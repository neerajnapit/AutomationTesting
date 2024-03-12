package javaCollections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class avaStreamMethodsOnString {
	public static void main(String[] args) {
		String reverse="";
		String str="cts cts is mnc mnc companay";
		String arr[]=str.split("\\s");
		//char charArray[]=str.toCharArray();
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");// op-- companay mnc mnc is cts cts 
		}
		for(int i=str.length()-1; i>=0; i--) {
			 reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		//o/p-- cts-2 is-1 mnc-2 company-1
//		List<String> reverseWords=Stream.of("cts","cts","is","mnc","mnc","company").sorted(Collections.reverseOrder()).collect(Collectors.toList());
//		System.out.println(reverseWords);
	}

}
