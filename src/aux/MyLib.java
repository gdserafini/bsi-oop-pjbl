package aux;

public class MyLib {
    
    public static boolean invalidString(String str){
        return str == null || str.isBlank() || str.isEmpty();
    }

}
