package database;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import exception.DatabasePersistenceException;
import interf.DBCaseEntity;

public class Database {
    
    private static final String STD_PATH = "./src/database/";
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

    public static String getCaseFile(int id) 
            throws DatabasePersistenceException{
        try{
            var reader = getReader();
            while((line = reader.readLine())!=null){
                if(line.split(",")[0].equals(Integer.toString(id))) return line;
            }
            reader.close();
        } catch(Exception e){ 
            throw new DatabasePersistenceException(
                "Erro de leitura. " + e.getMessage());
        }
        return null;
    }

    public static void persistData(DBCaseEntity dataToSave) 
            throws DatabasePersistenceException{
        try{
            var writer = getWriter();
            writer.write(dataToSave.getDBCaseEntityData());
            writer.newLine();
            writer.close();
        }
        catch(Exception e) { 
            throw new DatabasePersistenceException(
                "Erro de leitura. " + e.getMessage());
        }
    }

}
