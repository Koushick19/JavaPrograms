import java.util.PriorityQueue;

public class Quuee {
	
	public static void main(String[] args) {
		
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Hi");
		queue.add("am Studying");
		queue.add("Java");
		queue.add("In advance");
		
		System.out.println(queue.element());
		System.out.println(queue.poll());
	}

}
