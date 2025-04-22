package hw14;

import java.util.ArrayList;
import java.util.List;

public class LongestString {

	public static List<String> findTheLongestString(List<String> list)
	{
		
		List<String> longStrings = new ArrayList<>();
		
		String longestWord = list.get(0);
		longStrings.add(longestWord);
		
		for(int i = 1; i < list.size(); i++)
		{
			String newWord = list.get(i);
			
			if(longestWord.length() > newWord.length())
			{
				
			}
			else if(longestWord.length() == newWord.length())
			{
				longStrings.add(newWord);
			}
			else
			{
				for(int j = 0; j < longStrings.size(); j++)
				{
					longStrings.clear();
				}
				longestWord = newWord;
				longStrings.add(longestWord);
			}
		}
		return longStrings;
	}
	
	public static void main(String[] args) {
		//Basic Test
		/*List<String> listOfStrings = new ArrayList<>();
		listOfStrings.add("Hello");
		listOfStrings.add("Kelby");
		listOfStrings.add("this");
		listOfStrings.add("to");
		listOfStrings.add("a");
		listOfStrings.add("Minneapolis");
		listOfStrings.add("KelbyKies");
		listOfStrings.add("");
		
		for(String list : findTheLongestString(listOfStrings))
		{
			System.out.println(list);
		}*/
		
		//words that are all the same length
		/*List<String> shortWords = new ArrayList<>();
		shortWords.add("as");
		shortWords.add("hi");
		shortWords.add("to");
		shortWords.add("it");
		shortWords.add("as");
		
		for(String list : findTheLongestString(shortWords))
		{
			System.out.println(list);
		}*/
		
		/*//same word with spaces behind it
		List<String> oneWordAndASpace = new ArrayList<>();
		oneWordAndASpace.add("Hello");
		oneWordAndASpace.add("Hello    *");
		
		for(String list : findTheLongestString(oneWordAndASpace))
		{
			System.out.println(list);
		}*/
		
		//starts with one letter and each word grows by one
		List<String> littleLonger = new ArrayList<>();
		littleLonger.add("a");
		littleLonger.add("hi");
		littleLonger.add("two");
		littleLonger.add("love");
		littleLonger.add("Kelby");
		littleLonger.add("KelbyK");
		littleLonger.add("lovers");
		littleLonger.add("racecars");
		for(String list : findTheLongestString(littleLonger))
		{
			System.out.println(list);
		}
	}
}
