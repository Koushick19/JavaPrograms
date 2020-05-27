package PrimeNumber;

public class Fibannoci {

	public static void main(String[] args) 
	{
		int n =20;
		int t1=0;
		int t2=1;
		
		
		System.out.println("The Fibbonici series are :");
		
		System.out.println(t1);

				
		for(int i=1;i<=n;++i)
		{
			int sum = t1+t2;
			t1=t2;
			t2=sum;
			System.out.println(sum);
			
		}
		
	}

}
