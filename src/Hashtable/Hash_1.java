package Hashtable;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

public class Hash_1 
{
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		Hashtable tab = new Hashtable(30);
		tab.put(new Temp(10), "Koushick");
		tab.put(new Temp(2), "Subbu");
		tab.put(new Temp(21), "Arun");
		 
 		System.out.println(tab);
 		
 		
 		
	}

}

class Temp
{
	int i;
	public Temp(int i)
	{
		this.i=i;
	}
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return i+"";
	}
}