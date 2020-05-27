package Inhertance;

public class classB extends classA {
	
	public void mymethod1()
	{
		super.mymethod1();
		System.out.println("Hi,Am From ClassB");
	}
	
	public static void main(String[] args) {
		
		classA a = new classB();
		classB b = (classB)a;
		b.mymethod1();
		
	}

}
