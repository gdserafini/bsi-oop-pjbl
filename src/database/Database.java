package database;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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

    public static String getCaseFile(int id){
        try{
            var reader = getReader();
            while((line = reader.readLine())!=null){
                if(line.split(",")[0].equals(Integer.toString(id))) return line;
            }
            reader.close();
        } catch(Exception e){ e.printStackTrace(); }
        return null;
    }

    public static void saveCase(String caseToSave){
        try{
            var writer = getWriter();
            writer.write(caseToSave);
            writer.newLine();
            writer.close();
        }
        catch(Exception e) { e.printStackTrace(); }
    }

}
