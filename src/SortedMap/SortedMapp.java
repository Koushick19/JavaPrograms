package SortedMap;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeMap;

public class SortedMapp {
	
	public static void main(String[] args) {
//		
//		TreeMap map = new TreeMap();
//		map.put("koushick", 95);
//		map.put("Dinesh", 96);
//		map.put("Arun",125);
//		map.put("subbu", 101);
//	
//		//map.put(122,95);//classcastException-->"java.lang.String cannot be cast to java.lang.Integer"
//		
//		System.out.println(map);
		
		TreeMap map = new TreeMap(new Mycompartor());
		map.put(90,"koushick");
		map.put(99,"Dinesh");
		map.put(10,"Arun");
		map.put("gfjf","zaffy");
		
		System.out.println(map);
		
	}
}

class Mycompartor implements Comparator 
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2= o2.toString();
		return s2.compareTo(s1);
	}
}
