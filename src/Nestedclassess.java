import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Nestedclassess {
	
	
	public static BufferedWriter reader = null;
	public static char[] file;
	public static void main(String[] args) throws IOException 
	{
		Demo ab = new Demo();
		Demo.Demonested abc = ab.new Demonested();
		abc.run();
		
//		Demo2 obj = new Demo2();
//		Demo2.Demo1nested abd = obj.new Demo1nested();
//		Demo2.Demo2nested bbd = obj.new Demo2nested();
//		
//		abd.run1();
//		bbd.run2();
		
		Demo2 obj = new Demo2();
		obj.mymethod();
		
	  File annoy = new File() {
		
		@Override
		public void Writedata() {
			// TODO Auto-generated method stub
            try {
				reader = new BufferedWriter(new FileWriter("C:\\Users\\Hp\\workspace\\JavaPrograms\\data2.txt"));
				reader.write(file);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            finally {
            	try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
	};
		
	
		
	
	System.out.println("-------------");
	
	annoy.mydata();
    annoy.Readdata();
    annoy.Writedata();
	

		
	}
	
}

class Demo
{

	public class Demonested
	{
		public void run()
		{
			System.out.println("this is demo testing!");
		}
	}
	
	
}


class Demo2
{
	public void mymethod()
	{
	
	 class Demo1nested
	{
		public void run1()
		{
			System.out.println("This is my First Inner Nested class");
		}
	}
	 
	
	class Demo2nested
	{
		public void run2()
		{
			System.out.println("This is My Inner Nested Class");
		}
	}
	
	Demo1nested nstd = new Demo1nested();
	nstd.run1();
	
	Demo2nested nttd = new Demo2nested();
	nttd.run2();
	
	}
	
	
}

//Annonynmys Inner class

interface File
{

	
public default void mydata()
{
	System.out.println("Am going to read and write using File I/O!");
}

public default void Readdata() throws IOException
{
	BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Hp\\workspace\\JavaPrograms\\data.txt"));
	String data = reader.readLine();
	Nestedclassess.file = data.toCharArray();
	
}

void Writedata();


}
