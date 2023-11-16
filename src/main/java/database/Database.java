package database;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import exception.DatabasePersistenceException;
import interf.DBCaseEntity;

public class Database {
    
    private static final String STD_PATH = "C:\\Users\\julia\\Downloads\\2\u00B0 per\u00EDodo BSI\\Programa\u00E7\u00E3o Orientada a Objetos\\code_v01\\src\\main\\java\\database\\";
    private static final String DB_NAME = "cases_db.txt";
    private static String line;

    private static BufferedReader getReader() 
            throws FileNotFoundException{
        return new BufferedReader(
                new FileReader(""+ STD_PATH + DB_NAME));
    }

    private static BufferedWriter getWriter() 
            throws IOException{
        return new BufferedWriter(new FileWriter(
            "" + STD_PATH + DB_NAME, true));
    }

    public static String getData(int id){
        try{
            var reader = getReader();
            while((line = reader.readLine())!=null){
                if(line.split(",")[0].equals(""+id)) return line;
            }
            reader.close();
        } catch(Exception e){ 
            e.printStackTrace();
        }
        return null;
    }

    public static void persistData(DBCaseEntity dataToSave)
            throws DatabasePersistenceException{
        try{
            if(getData(dataToSave.getCaseId()) == null){
                saveData(dataToSave.getDBCaseEntityData());
            }
            else throw new DatabasePersistenceException(
                "Dado id: " + dataToSave.getCaseId() +
                " já existe no banco de dados.");
        }
        catch(Exception e) {
           throw new DatabasePersistenceException(
                "Erro de persistencia - " + e.getLocalizedMessage());
        }
    }
    public static List<String> getDataList() throws IOException{
        try {
            var reader = getReader();
            var lines = new ArrayList<String>();
            while((line = reader.readLine()) != null) lines.add(line);
            return lines;
        }
        catch (FileNotFoundException e) { e.printStackTrace(); }
        catch(Exception e){ e.printStackTrace(); }
        return null;
    }

    private static void saveData(String data) throws IOException{
        var writer = getWriter();
        writer.write(data);
        writer.newLine();
        writer.close();
    }
}
