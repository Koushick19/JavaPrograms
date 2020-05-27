import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ExceptionHandlinggg{
	
	public static void main(String[] args) throws IOException 
	{
		
		//Expectionhandle();
		Exceptionhandle1();
		
//		String s1 = "Maveric";
//		String s2 = "systems";
//		s1.concat(s2);
//		System.out.println(s1);
	}
	
	
	public static void Expectionhandle()
	{
		try
		{
			int x = 100;
			int y = 0;
			int c = x/y;
			
			System.out.println("The Number is " + c);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			
		}
	}
	
	public static void Exceptionhandle1() throws IOException
	{
		BufferedReader reader = null;
		try
		{
			Properties prop = new Properties();
			reader = new BufferedReader(new FileReader("C:\\Users\\Hp\\workspace\\JavaPrograms\\file.properties"));
			prop.load(reader);
			System.out.println(prop);
			System.out.println("File got Reading");
			try
			{
				int x = 10;
				int y = 0;
				int c = x/y;
				
				System.out.println("The Output is " + c);
			}
			catch (ArithmeticException e) {
				// TODO: handle exception
				e.printStackTrace();
				try
				{
					int a = 5;
					int b = 10;
					int c = b-a;
					System.out.println("The output is " + c);
				}
				catch (Exception e1) {
					// TODO: handle exception
					e1.printStackTrace();
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			reader.close();
			System.out.println("File Closed!");
		}
		
	}
	
	

	

}
