package javaCollections;

import java.util.*;

public class setPractice {

	public static void main(String[] args) {
	// HashSet stores data in ascending order but LinkedHashSet maintains insertion order
		//Set<String> data=new HashSet<>();//[b, d, e, f]
		Set<String> data=new LinkedHashSet<>();//[f, b, d, e]
		//Set<String> data=new TreeSet<>();//[b, d, e, f]
		data.add("f");
		data.add("b");
		data.add("c");
		data.add("d");
		data.add("e");
		data.remove("c");
		System.out.println(data);
		

	}

}
