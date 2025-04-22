package hw14;

import java.util.Map;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Maps {

	public static Map<String, Integer> countingTheFirstWord(String filename)
	{
		Map<String, Integer> wordCount = new HashMap<>();
		
		 try
	     {
	            FileReader reader = new FileReader(filename);
	            Scanner input = new Scanner(reader);

	            while (input.hasNextLine())
	            {
	                String line = input.nextLine(); 
	                String[] words = line.split(" ");
	                String word = words[0];
	               
                    if (wordCount.containsKey(word))
                    {
                    		wordCount.get(word);
                    		int numberOfWords = wordCount.get(word);
                    		numberOfWords++;
                    		wordCount.put(word, numberOfWords);
                    } 
                    else
                    {
                    		int numberOfWords = 0;
                    		numberOfWords++;
                    		wordCount.put(word,  numberOfWords);
                    }
	            }

	            reader.close();
	            input.close();
	        }
	        catch (IOException exception)
	        {
	            System.out.println("Some problem occurred with the file!!!");
	        }
		 return wordCount;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(countingTheFirstWord("Hamlet.txt"));
		System.out.println(countingTheFirstWord("TestScenario"));
		System.out.println(countingTheFirstWord("Spaces"));
		System.out.println(countingTheFirstWord("triple"));
		System.out.println(countingTheFirstWord("nothing"));
	}
}
