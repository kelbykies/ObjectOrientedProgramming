package hw14;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

public class Duplicates {
	
	public static List<String> removingDuplicates(List<String> duplicatedList)
	{
		Set<String> newSet = new HashSet<>(duplicatedList);
		List<String> transformedList = new ArrayList<>(newSet);
		return transformedList;
	}

	public static void main(String[] args)
	{
		List<String> duplicatedArray = new ArrayList<>();
		duplicatedArray.add("hi");
		duplicatedArray.add("hi");
		duplicatedArray.add("low");
		duplicatedArray.add("hi");
		duplicatedArray.add("hi");
		duplicatedArray.add("Hi");
		duplicatedArray.add("low");
		duplicatedArray.add("lo");
		duplicatedArray.add("hi");
		
		List<String> doubleArray = new ArrayList<>();
		doubleArray.add("hi");
		doubleArray.add("bye");
		doubleArray.add("hi");
		doubleArray.add("Bye");
		doubleArray.add("bye");
		doubleArray.add("bye");
		doubleArray.add("hi");
		doubleArray.add("Hi");
		
		List<String> noDouble = new ArrayList<>();
		noDouble.add("hi");
		noDouble.add("bye");
		noDouble.add("lye");
		noDouble.add("rye");
		noDouble.add("my");
		noDouble.add("My");
		noDouble.add("sky");
		noDouble.add("Bye");

		System.out.println(removingDuplicates(duplicatedArray));
		System.out.println(removingDuplicates(doubleArray));
		System.out.println(removingDuplicates(noDouble));
	}

}
