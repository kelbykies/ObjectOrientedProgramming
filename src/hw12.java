import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class hw12 {
	
	public static void countingWordsInFile(String filename, String compareWord)
	{
		int standardWordCount = 0;
		int inclusiveWordCount = 0;
		
		try
        {
            FileReader contentToCompare = new FileReader(filename);
            Scanner input = new Scanner(contentToCompare);

            while (input.hasNextLine())
            {
                String line = input.nextLine();
                String[] words = line.split(" ");
            
	            for(String element : words)
	            {
	            		if(compareWord.equals(element))
	            		{
	            			standardWordCount++;
	            		}
	            		
	            		else if(element.contains(compareWord))
            			{
            				inclusiveWordCount++;
            			}
	            }
        		}
            input.close();
            System.out.println(filename + " The standard word count is " + standardWordCount + "\n"
            			+ "The inclusive word count is " + inclusiveWordCount);
        }
        catch (IOException exception)
        {
            System.out.println("Some problem occurred with the file!!!");
        }
	}
	
	public static void sortingUserData()
	{
		final Scanner input = new Scanner(System.in);
		List<Integer> numberList = new ArrayList<>();
		
		System.out.println("Enter any numbers: Press D when Done");
		while(input.hasNextInt())
		{
			int num = input.nextInt();
			numberList.add(num);
		}

		final Scanner question = new Scanner(System.in);
		System.out.println("How should the numbers be sorted? Increasing, decreasing, or both? ");
		
		if(question.hasNext())
		{
			String word = question.next();
			
			if(word.equalsIgnoreCase("Increasing"))
			{
				Collections.sort(numberList);
				
				System.out.print("The numbers in increasing order is... ");
				for(int position : numberList)
				{
					System.out.print(position + " ");
				}
			}
			else if (word.equalsIgnoreCase("Decreasing"))
			{
				Collections.sort(numberList, Collections.reverseOrder());
				
				System.out.print("The numbers in decreasing order is... ");
				for(int element : numberList)
				{
					System.out.print(element + " ");
				}
			}
			else if (word.equalsIgnoreCase("Both"))
			{
				List<Integer> decreasingList = numberList;
				Collections.sort(numberList);
			
				System.out.print("The numbers in increasing order is... ");
				for(int position : numberList)
				{
					System.out.print(position + " ");
				}
				System.out.println();
				
				Collections.sort(decreasingList, Collections.reverseOrder());
				
				System.out.print("The numbers in decreasing order is... ");
				for(int element : decreasingList)
				{
					System.out.print(element + " ");
				}
			}
			else System.out.println("You did not input a valid option. Try again.");
		}
		
		input.close();
		question.close();
}
	
	
	
	public static double addingPositiveIntegers(List<Double> inputList)
	{
		double sum = 0;
		for(double element : inputList)
		{
			if(element >= 0)
			{
				sum += element;
			}
		}
		
		return sum;
	}
	
	
	public static List<Integer> iteratingThroughAList(List<Integer> negativeList)
	{
		ListIterator<Integer> iterator = negativeList.listIterator();
		
		while (iterator.hasNext())
		{
			int value = iterator.next();
			if (value < 0) 
			{
				iterator.remove();
			}
		}
		
		return negativeList;
	}

	
	public static void main(String[] args)
	{
		/*countingWordsInFile("problem125", "the");
		countingWordsInFile("problem125", "dog");
		countingWordsInFile("test2", "brain");
		countingWordsInFile("test3", "name");
		countingWordsInFile("test4", "the");
		countingWordsInFile("test5", "16");
		countingWordsInFile("test6", "how");*/
		
		//sortingUserData();
		
		//Linked List
		/*Major cmsc = new ComputerScience();
		Major math = new Math();
		
		Student henryFord = new Student("Henry Ford", cmsc);
		Student barackObama = new Student("Barack Obama", math);
		Student georgeWashington = new Student("George Washington", cmsc);
		Student brittneySpears = new Student("Britteny Spears", math);
		
		Course discrete = new Course("CMSC", 175, 3);
		Course dataStructures = new Course("CMSC", 155, 4);
		Course physics = new Course("Physics", 101, 3);
		Course biology = new Course("Biology", 101, 3);
		Course music = new Course("Music", 260, 5);
		Course chem = new Course("Biochemistry", 365, 4);
		
		henryFord.addCourse(discrete);
		henryFord.addCourse(dataStructures);
		henryFord.addCourse(physics);
		henryFord.dropCourse(discrete);
		henryFord.dropCourse(physics);
		
		barackObama.addCourse(physics);
		barackObama.addCourse(chem);
		barackObama.addCourse(music);
		barackObama.addCourse(discrete);
		barackObama.dropCourse(music);
		
		georgeWashington.addCourse(music);
		georgeWashington.addCourse(music);
		georgeWashington.addCourse(dataStructures);
		
		brittneySpears.dropCourse(biology);
		brittneySpears.dropCourse(dataStructures);
		brittneySpears.addCourse(music);
			
		System.out.println(henryFord);
		System.out.println();
		System.out.println(barackObama);
		System.out.println();
		System.out.println(georgeWashington);
		System.out.println();
		System.out.println(brittneySpears);*/
		
		
		/*List<Double> arrayList = new ArrayList<>();
		List<Double> linkedList = new LinkedList<>();
		
		int length1 = 5;
		int length2 = 100000;
		
		for(int i = 0; i < length1; i++)
		{
			arrayList.add(3.0);
			linkedList.add(6.0);
		}
		
		System.out.println(addingPositiveIntegers(arrayList));
		System.out.println(addingPositiveIntegers(linkedList));
		
		for(int i = 0; i < length2; i++)
		{
			arrayList.add(3.0);
			linkedList.add(6.0);
		}
		
		System.out.println(addingPositiveIntegers(arrayList));
		System.out.println(addingPositiveIntegers(linkedList));*/
		
		/*List<Integer> listOfNumbers = new ArrayList<>();
		List<Integer> numbersLinkedList = new LinkedList<>();
		
		listOfNumbers.add(3);
		listOfNumbers.add(3);
		listOfNumbers.add(15);
		listOfNumbers.add(4);
		listOfNumbers.add(2);
		listOfNumbers.add(90);
		listOfNumbers.add(44);
		listOfNumbers.add(5);
		listOfNumbers.add(16);
		listOfNumbers.add(30);
		listOfNumbers.add(87);
		listOfNumbers.add(129);
		int negative = -100000;
		for(int i = 0; i >= negative; i--)
		{
			listOfNumbers.add(i);
		}
		
		
		numbersLinkedList.add(3);
		numbersLinkedList.add(3);
		numbersLinkedList.add(15);
		numbersLinkedList.add(4);
		numbersLinkedList.add(2);
		numbersLinkedList.add(90);
		numbersLinkedList.add(44);
		numbersLinkedList.add(5);
		numbersLinkedList.add(88);
		numbersLinkedList.add(43);
		numbersLinkedList.add(4);
		numbersLinkedList.add(71);
		
		int numberLessThanZero = -100000;
		for(int i = 0; i >= numberLessThanZero; i--)
		{
			numbersLinkedList.add(i);
		}
		
		System.out.println((iteratingThroughAList(listOfNumbers)));
		System.out.println((iteratingThroughAList(numbersLinkedList)));*/
		
		/*int x = 1;
		while (x > 0) 
			x++;
		System.out.println(x); */
		
		  
	}
}
