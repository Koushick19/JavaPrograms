import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Removecharacter 
{
	
	public static void main(String[] args) 
	{
		String result = removeChar("Java", 'a');
		String result1 = removeChar("Edition", 'i');
		
         System.out.println(result + " " + result1);
		
	}
	

    public static String removeChar(String str, char c) {
        if (str == null)
        {
            return null;
        }
        else
        {	
        return str.replaceAll(Character.toString(c), "");
        }
    }


}
