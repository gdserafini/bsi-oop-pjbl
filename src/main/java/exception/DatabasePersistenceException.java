package exception;

public class DatabasePersistenceException extends Exception {
    
    public DatabasePersistenceException(){
        super();
    }

    public DatabasePersistenceException(
            String exceptionMessage){
        super(exceptionMessage);
    }

}
