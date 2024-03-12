package javaCollections;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamMethodsOnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(3,2,2,7,5,1,9,7);
		System.out.println(numbers);
		//sort the array
		List<Integer> sortedArray=numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(sortedArray);
		List<Integer> reverseArray=Stream.of(10,100,1,1,1,2,3,4,4,5,6).distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseArray);
		System.out.println(reverseArray.get(1));

	}

}
