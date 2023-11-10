import java.io.IOException;
import database.Database;
import exception.DatabasePersistenceException;

public class Main {
    public static void main(String[] args) 
            throws DatabasePersistenceException, IOException {
        Database.getDataList().forEach(System.out::println); 
    }
}
