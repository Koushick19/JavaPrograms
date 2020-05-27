import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListCollections {
	
	
	public static void main(String[] args) {
		
		System.out.println("Executing Array List");
		
		ArrayList obj = new ArrayList<>();

		obj.add(25);
		obj.add(65);
		obj.add(69);
		obj.add(null);


		obj.add(99);
		obj.add(52);
		obj.add(null);

		obj.add(52);
		obj.add(55);
		
		obj.addAll(LinkedListdata());
		
		System.out.println(obj);
		
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		
		
		
	}
	
	
	public static Collection LinkedListdata()
	{
		
		LinkedList obj = new LinkedList();
		obj.addFirst("Maveric");
		obj.add("Am");
		obj.add("Studying");
		obj.addLast("Systems");
		
		//System.out.println(obj);
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		System.out.println(obj.removeFirst());
		obj.addFirst("Mavericssss");	
		System.out.println(obj.removeLast());
		obj.addLast("Systemssss");
//		System.out.println(obj);
		
		return obj;
	}
	

}
