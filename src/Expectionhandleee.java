
public class Expectionhandleee {
	
	public static void main(String[] args) 
	{
		myException1();
		
//		String ac = "Maveric";
//		String ac1 = "Systems";
//		ac.concat(ac1);
//		System.out.println(ac);
//		
//		mymethod1();
	}
	
	
	public static void myException1()
	{
		int z = 0;
		String s = "Maveric Systems";
		
		try
		{
			int a = 5;
			int b = 10;
			int c = a/b;
			System.out.println("Executed Successfully!");
		try
		{
			int x = 5;
			int y = 10;
			z = x/y;
			try
			{
				System.out.println("The string is " + s);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Entering the Finally Block!");
			int z1 = 10;
			int finalblock = z+z1;
			System.out.println("The finally block exectes ! " + finalblock);
		}
		}
		catch (ArithmeticException ss) {
			// TODO: handle exception
			ss.printStackTrace();
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	public static final void mymethod1()
	{
		int x = 10;
		try
		{
			if(x>=10)
			{
				throw new ArithmeticException("/ by Greater than or equal to 10");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println(x);
			x++;
			System.out.println(x);
		}

		}


}
