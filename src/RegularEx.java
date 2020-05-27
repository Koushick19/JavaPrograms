import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx {

	
	public static void main(String[] args) {
		
		int count =0;
		Pattern p = Pattern.compile("kous");
		Matcher m = p.matcher("koushkoushickkous");
		while(m.find())
		{
			count++;
			System.out.println(m.start()+ "___" + m.end() + "___" + m.group());
		}
		System.out.println("The Total Occurances are " + count);
		
		System.out.println("_______________________________________");
		
		//myregEx();
		
		System.out.println("________________________________________");
		
		//MyregEx2();
		
		System.out.println("_________________________________________");
		
		MyregEx3();
		}
	
	
	public static  void myregEx()
	{
		Pattern p = Pattern.compile("[a-z]");
		Matcher m = p.matcher("abcdeficKlm");
		
		while(m.find())
		{
			
			System.out.println(m.start()+ "___" + m.group());
		}


	}
	
	
	
	public static void MyregEx2()
	{
		Pattern p = Pattern.compile("\\S");
		Matcher m = p.matcher(" MavericSYSTEMS123456!@");
		while(m.find())
		{
			
			System.out.println(m.start()+ "___" + m.group());
		}

	}
	
	public static void MyregEx3()
	{
		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher("abaabaaab123455");
		
		while(m.find())
		{
			
			System.out.println(m.start()+ "___" + m.group());
		}

	}

		
	
}
