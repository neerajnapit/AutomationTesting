package javaCollections;

import java.util.*;

public class ListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> list=new ArrayList<>();
		//List<String> list=new LinkedList<>();
		List<String> list=new Stack<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		//list.remove("e");
		System.out.println(list);
		list.remove("e");
		System.out.println(list);


	}

}
