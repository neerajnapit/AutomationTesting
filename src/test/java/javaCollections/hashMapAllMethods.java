package javaCollections;

import java.util.*;

public class hashMapAllMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> hp=new HashMap<>();
		hp.put("firstName", "Neeraj");
		hp.put("lastName", "Napit");
		//Integer value=hp.get("lastName");// this will return corresponding value
		String value=hp.get("lastName");//hp.put("lastName", "Napit");--- so return Napit
		System.out.println(value);
		
		

	}

}
