package Treeset;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorInt {
	
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet(new mycomparator());
		set.add(10);
		set.add(40);
		set.add(40);
		set.add(100);
		set.add(15);
		set.add(25);
		set.add(30);
		
		System.out.println(set);
	}

}

class mycomparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer I1 = (Integer)o1;
		Integer I2 = (Integer)o2;
		
	return I2.compareTo(I1);
		
		
	}
	
}
