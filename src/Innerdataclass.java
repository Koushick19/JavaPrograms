

public class Innerdataclass {
	
	
	public static void main(String[] args) {
		
//		Innerdatastep.NestedStaticClass obj = new Innerdatastep.NestedStaticClass();
//		obj.print();
//		obj.print1();
		
//		Localclass obj1 = new Localclass();
//		obj1.result();
		
//		OuterClass obj2 = new OuterClass();
//		OuterClass.NestedClass ac = obj2.new NestedClass();
//		ac.Mynestedclass();
		
		
		Myannonyms obj3 = new Myannonyms() {
			
			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				System.out.println("Sleeping!");
			}
			
			@Override
			public void eat(String data) {
				// TODO Auto-generated method stub
				
				System.out.println("My name is " + data);
				
			}
			
			@Override
			public void eat(int arg1) {
				// TODO Auto-generated method stub
				
				System.out.println("The Integer is " + arg1);
				
			}
		};
		
		obj3.sleep();
		obj3.eat(5);
		obj3.eat("Maveric Systems");
		obj3.Python();
	}
	
	

}

class Innerdatastep
{
	public static class NestedStaticClass {
	      public void print() { 
	        System.out.println("Message from nested static class"); 
	      }
	      
	      public void print1()
	      {
	    	  System.out.println("This is Second Method!");
	      }
	   }
}

class Localclass
{
	int  n =5;
	void result(){  
		   // Local inner class
		   class Cube {  
		     int calc() {
		        return n*n*n;
		     }  
		   }
		  
		   Cube c = new Cube();  
		   System.out.println(c.calc());  

}
	
	
}



class OuterClass 
{
	public class NestedClass
	{
		public void Mynestedclass()
		{
			System.out.println("This is an Example of Nested class!");
		}
	}
}


interface  Myannonyms
{
	void eat(int arg1);
	void sleep();
	void eat(String data);
	public default void Python()
	{
		System.out.println("What is python?");
	}
	
}
