package week6;
//Topic - Collections
//Priority Queue example

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String> pqueue = new PriorityQueue<String>();
		
		pqueue.add("Ganu");
		pqueue.add("Manu");
		pqueue.add("Janu");
		
		System.out.println(pqueue); // Print the elements
		
		pqueue.remove("Manu"); // Remove the Given Elements 
		
		System.out.println(pqueue.peek()); // Retrieve the first element of this queue		
		
		Iterator<String> iter = pqueue.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for(String s : pqueue) {
			System.out.println(s);
		}
		
		
	}

}
