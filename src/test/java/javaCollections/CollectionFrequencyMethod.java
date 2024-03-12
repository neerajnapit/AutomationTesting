package javaCollections;

import java.util.*;
import java.util.Collections;

public class CollectionFrequencyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {20,10,9,20,8,7,10,12,20,9,12};
		//Unsorted array
		for(int num:arr) {
			System.out.println(num);	
		}
		//System.out.println(arr);
		System.out.println("************************");
		//sorting array
		Arrays.sort(arr,Collections.reverseOrder());
		//sorted array
		for(int sortnum:arr) {
			
			System.out.println(sortnum);	
		}
		//System.out.println(arr);
		// get count of each items--frequency method
		System.out.println("************************");
		List<Integer> numbers=Arrays.asList(arr);
		for(int number:numbers) {
			if((Collections.frequency(numbers, number))==1) {
				System.out.println("first unique number is "+ number);
				break;
				
			}
		}
		//int count=Collections.frequency(Arrays.asList(arr), 20);

	}

}
