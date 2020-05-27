import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegA {
	
	public static void main(String[] args) {
		
		int count =0;
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher("MavericSystems1245DDDSS");
		while(m.find())
		{
			count++;
			System.out.println(m.start()+ "___" + m.end() + "___" + m.group());
		}
		System.out.println("The Total Occurances are " + count);

		
	}
	
	
	

}
