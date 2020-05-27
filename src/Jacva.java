import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class Jacva {
	
	public static void main(String[] args) {
		
		
		/*
		 * 
		 * 
		 * Program -01 To find duplicates using collections.frequency
		 * 
		 * 
		 */
		
		String s = "koushicksudharsanamsssssssaaaaaaaaaaaa";
		List<String> as = Arrays.asList(s.split(""));
		Set<String> ss = new HashSet<String>(as);
	
		System.out.println("The data with duplicates + " + as);
		System.out.println("The data without duplicates + " + ss);
		
		for(String dup:ss)
		{
			System.out.println("The count for duplicates + " + dup + "------>" + Collections.frequency(as,dup));
		}
		
		
		
		/*
		 * 
		 * 
		 * Program -02 create a Treeset for Customized sorting order
		 * 
		 * 
		 */
		
		TreeSet<String> set = new TreeSet<String>(new Compare());
		set.add("My");
		set.add("name");
		set.add("is");
		set.add("Koushick");
		System.out.println(set);
		
		
		
		/*
		 * 
		 * 
		 * Program -03 Find Prime number
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int prime = sc.nextInt();
		
		 if (findprime(prime)) {  
	           System.out.println(prime + " is a prime number");  
	       } else {  
	           System.out.println(prime + " is not a prime number");  
	       }  
		
		
	} 
	
	public static boolean findprime(int n) 
	{
		if(n<=1)
		{
			return false;
		}	
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}	
		return true;
	}

}

class Compare implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2= o2.toString();
		return s2.compareTo(s1);
	}
}
