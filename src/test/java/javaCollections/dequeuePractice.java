package javaCollections;

import java.util.*;

public class dequeuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Deque<String> deque = new ArrayDeque<String>();  
		   deque.add("Ravi");    
		   deque.add("Vijay");     
		   deque.add("Ajay"); 
		   System.out.println(deque);
		   deque.addFirst("Neeraj");
		   deque.addLast("Ajeet");
		   System.out.println(deque);
		   deque.poll();
		   System.out.println(deque);
		   deque.pollLast();
		   System.out.println(deque);
		   Iterator<String> itr=deque.iterator();
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }
//		   for(String name: deque) {
//			   System.out.println(name);
//		   }

	}

}
