
public class Threaddata  {
	
	public static void main(String[] args) {
		
		MyThread run = new MyThread();
		run.start();
		
		MyThread1 run1 = new MyThread1();
		if(run.isAlive())
		{
		run.start();
		run1.start();
		}
		else
		{
			System.out.println("Thread has been destroyed!!");
		}
		
		for(int i=0;i<5;i++)
		{
		System.out.println("main thread");
		} 
		
		
	}

}

class MyThread extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("child thread");
} 

} 

}

class MyThread1 extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("child thread 1");
} 

} 

}


