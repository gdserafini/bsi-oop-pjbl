package aux;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class MyLib {

    private static final String STR_SEPARATOR = ",";
    
    public static boolean invalidString(String str){
        return str == null || str.isBlank() || str.isEmpty();
    }

    private static ArrayList<Object> getAttributesValues(Object obj) 
            throws IllegalArgumentException, IllegalAccessException{
        var attrValues = new ArrayList<Object>();
        var fields = obj.getClass().getDeclaredFields();
        for (Field f : fields){
            f.setAccessible(true);
            attrValues.add(f.get(obj));
        }
        return attrValues;
    }

    public static String formatComaStr(Object objToStr) 
            throws IllegalArgumentException, IllegalAccessException{
        var formattedStr = "";
        var attrValues = getAttributesValues(objToStr);
        for(int i = 0; i < attrValues.size(); i++){
            if(i == 0) formattedStr += attrValues.get(i);
            else formattedStr += STR_SEPARATOR + attrValues.get(i).toString();
        }
        return formattedStr;
    }

}
