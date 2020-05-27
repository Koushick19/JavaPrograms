
public class Singletonclassj {
	
	String mystring = "Singleton";
	
	private static Singletonclassj obj ;
	
	private Singletonclassj() {
		
	}
	
	public static Singletonclassj getInstance()
	{
		if(obj==null)
		{
		obj = new Singletonclassj();
		}
		return obj;
	}
	
	public void mydata(String getdata)
	{
	  
	   System.out.println("Welcome to " + getdata);
	}
	
	public void mydata1() {
		System.out.println("Singleton class!" + mystring);
	}

}
