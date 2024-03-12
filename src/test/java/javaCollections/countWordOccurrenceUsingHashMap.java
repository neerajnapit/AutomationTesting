package javaCollections;

import java.util.*;
import java.util.Map.Entry;

public class countWordOccurrenceUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="cts cts is multinational company company";
		Map<String,Integer> hasMap=new LinkedHashMap<>();
		String[] words=str.split(" ");
		for(String word: words) {
			Integer integer =hasMap.get(word);
			if(integer==null) {
				hasMap.put(word, 1);
			}
			else {
				hasMap.put(word, integer + 1);
			}
		}
		
		//System.out.println(hasMap);
		for(Map.Entry<String, Integer> entry: hasMap.entrySet()) {
	    	  System.out.println(entry.getKey()+ " - " +entry.getValue());
	    	  
	      }

	}

}
