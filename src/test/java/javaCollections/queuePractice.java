package javaCollections;

import java.util.*;

public class queuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q=new LinkedList<>();//[b, c, d, e, Z] maintains insertion order and delete from front
		q.add("a");
		q.add("b");
		q.add("c");
		q.add("d");
		q.add("e");
		q.poll();
		System.out.println(q);
		

	}

}
