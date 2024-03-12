package javaCollections;

import java.util.*;
import java.util.Map.Entry;

public class treeMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> hp=new TreeMap<>();
		hp.put("lastName", "Neeraj");
		hp.put("firstName", "Napit");
		System.out.println(hp.put("phone", "8709627406"));
		System.out.println(hp);// prints in ascending order 
		                       // {firstName=Napit, lastName=Neeraj}
		System.out.println(hp.get("firstName"));// prints same as hasmap cporresponding value
      for(Entry<String, String> entry: hp.entrySet()) {
    	  System.out.println(entry.getKey()+ " - " +entry.getValue());
    	  
      }
	}

}
