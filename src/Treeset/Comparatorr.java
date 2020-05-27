package Treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparatorr {
	
	public static void main(String[] args) 
	{
		Employees emp1 = new Employees("koushick", 85);
		Employees emp2 = new Employees("dinesh", 60);
		Employees emp3 = new Employees("danny", 54);
		Employees emp4 = new Employees("subbu", 45);
		Employees emp5 = new Employees("arun", 65);
		
		TreeSet set = new TreeSet(new comparator());
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		
		System.out.println(set);
		
	}

}

class comparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employees e1 = (Employees) o1;
		Employees e2 = (Employees) o2;
		
		String s1 = e1.name;
		String s2 = e2.name;

		return s1.compareTo(s2);
	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		String s1 = o1.toString();
//		String s2 = o2.toString();
//		int len1 = s1.length();
//		int len2 = s2.length();
//		if(len1<len2)
//		{
//			return -1;
//		}
//		else if(len1>len2)
//		{
//			return +1;
//		}
//		else
//		{	
//		return s1.compareTo(s2);
//		}
//	}
}
