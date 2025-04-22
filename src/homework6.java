import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class homework6 {

	public static void main(String[] args) {
		
		/*List<String> test = new ArrayList<>();
		test.add("Hi");
		test.add("Bob");
		test.add("How");
		test.add("are");
		test.add("you");
		test.add("Hi");
		String element = "Hi";
		
		//test.remove(element);
		//test.removeAll(element);
		//while (test.contains(element)) test.remove(element);
		//int numberOfOccurrences = Collections.frequency(test, element);
		//for (int count = 1; count <= numberOfOccurrences; count++) 
		                //test.remove(element);

		List<String> listOfElementsToRemove = new ArrayList<>();
		listOfElementsToRemove.add(element);
		test.removeAll(listOfElementsToRemove);*/
		
		/*int [] [] array = {{1,4,2}, {7,2}, {4,3,2,1}, {3}};
		Arrays.sort(array, (a,b)-> {if(findAverage(a) < findAverage(b)) return 1; else return -1;});
		System.out.println(Arrays.deepToString(array));*/
		
		System.out.println(addingRecursiveIntegers(1, 5));
		System.out.println(addingRecursiveIntegers(1, 8));
		System.out.println(addingRecursiveIntegers(1, 2));
		System.out.println(addingRecursiveIntegers(1, 10));
		
		
	}

	//Recursion
	public static int addingRecursiveIntegers(int startInt, int maxNumber)
	{	
		if(startInt > maxNumber) return 1;
		else return startInt + addingRecursiveIntegers(startInt + 1, maxNumber);
	}
	
/*public static double findAverage(int[] averageArray)
{
	double average = 0;
	double sum = 0;
	for(int i = 0; i < averageArray.length; i++)
	{
		sum += averageArray[i];
	}
	average = sum / averageArray.length;
	return average;
}*/
}
		
		/*for( int[] row : array)
		{
			for(int element : row)
			{
				System.out.print(element + " ");
			}
			System.out.println();
			}
*/
		//System.out.println(test);
	
		/*String[][] peoplesBirthYears= {{"Chris", "2017"}, {"Pat", "2002"}, {"Romeo", "1996"}, {"Juliet", "1999"}, {"Logan", "1983"}, {"Dana", "2006"}};
	
		Arrays.sort(peoplesBirthYears, (a,b) -> {if((Math.abs(Integer.parseInt(a[a.length-1])) - 1999) >
				Math.abs(Integer.parseInt(b[b.length-1]) - 1999))  return 1; else return -1;});
	
		System.out.print(Arrays.deepToString(peoplesBirthYears));*/

	


