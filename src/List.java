import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

public class List {
	
	
	
	public static void main(String[] args) {
		//List.LearnArray();
		//List.LearnVector();
		List.LearnLinkedList();
	}
	
	
	@SuppressWarnings("unchecked")
	public static Collection LearnArray()
	{
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		list.add("koushick");
		list.add("is");
		list.add("studying");
		list.add("in depth");
		list.add("collections ");
		list.add("for");
		list.add("List");
		list.add("Interface");
		list.add("so");
		list.add("please be");
		list.add("silent");
		list.add(25);
		list.add(10);
		list.add(false);
		list.add(true);
//		list.add("and");
//		list.add("do");
//		list.add("the");
//		list.add("work");
//		list.add("silent");



		return list;
	}

	
	@SuppressWarnings("unchecked")
	public static void LearnVector()
	{
		@SuppressWarnings("rawtypes")
		Vector vec = new Vector();
		
		vec.add("koushick");
		vec.add("is");
		vec.add("studying");
		vec.add("in depth");
		vec.add("collections ");
		vec.add("for");
		vec.add("List");
		vec.add("Interface");
		vec.add("so");
		vec.add("please be");
		vec.add("silent");
		vec.add(25);
		
		
		
	}
	
	@SuppressWarnings("unchecked")
	public static void LearnLinkedList()
	{
		@SuppressWarnings({ "rawtypes" })
		LinkedList lis = new LinkedList(List.LearnArray());
		lis.add(0, "Koushickdaww");
		lis.removeLast();
		lis.removeFirst();
		lis.set(1, "is mass and");
		lis.remove(1);
		int size = lis.size();
		System.out.println(lis + "" + size);
	}
}


