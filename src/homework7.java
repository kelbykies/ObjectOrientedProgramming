import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class homework7 
{
	private static int [][] changeToZero(int [][] randomArray)
	{
		int rowLength = randomArray[0].length;
		int[] positionArray = new int [2];
		List <int []> listOfArrays = new ArrayList<>();
		
		for(int row = 0; row < randomArray.length; row++)
			for(int column = 0; column < rowLength; column++)
			{
				if(randomArray[row][column] == 0)
				{
					positionArray[0] = row;
					positionArray[1] = column;
					listOfArrays.add(Arrays.copyOf(positionArray, 2));
				}
			}
				
		for(int i = 0; i < listOfArrays.size(); i++)
		{
			for(int position = 0; position < rowLength ; position++)
			{
				randomArray[listOfArrays.get(i)[0]][position] = 0;
			}
			for(int position = 0; position < randomArray.length; position++) 
			{
				randomArray[position][listOfArrays.get(i)[1]] = 0;
			}
		}
		return randomArray;
	}
	
	public static void main(String[] args) 
	{
		int [][] startArray1 = {{2,3,4,5,6}, {1,1,0,1,1}, {7,9,2,3,5}, {6,1,2,0,8}};
		int [] [] startArray2 = {{1,2,3}, {4,5,6}, {7,8,9}, {0,0,0}};
		int [] [] startArray3 = {{0, 1, 2}, { 1, 0, 3}, {4, 9, 0}};
		int [] [] startArray4 = {{1, 2, 34, 5}, {56, 16, 3, 4}, {12, 0, 99, 100}};
		int [] [] startArray5 = {{1,2,3,4}, {6, 7, 8, 9}, {2, 4, 3, 1}}; 
		
		int [] [] endArray = changeToZero(startArray5);
		for (int [] row : endArray )
		{
			for(int element : row)
			{
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	/*private static int[] makeRandomArray(int size, int limit)
	{  // Create size many random integers from 1 to limit.
		Random random = new Random();
		
		int[] randomNumbers = new int[size];
		for (int count = 0; count < size; count++)
			randomNumbers[count] = (random.nextInt(limit) + 1);
		
		return randomNumbers;
	}*/

	/*private static void selectionSort(int[] data) 
	{ 
		long comparisons = 0;
		for (int index = 0; index < data.length-1; index++) 
		{ 
		   // Find the index'th smallest element
		   int min = index; 

		   for (int scan = index + 1; scan < data.length; scan++) 
		   {
			   comparisons ++;
		   
			   if (data[scan] < data[min])  
				   {min = scan;} 
		   }
			    
		   if (min != index) // swap the elements
		   {
			  int temp = data[index]; 
			  data[index] = data[min];  
			  data[min] = temp;
		   }
		} 
		System.out.println("\nComparisons made: " + comparisons);
	}
	
	public static void main(String[] args) 
	{
		boolean done = false;
		final Scanner input = new Scanner(System.in);
		
		while(!done)
		{
			System.out.println("Please enter a positive integer:  Enter -1 when finished.");
			int enteredNum = input.nextInt();
			if(enteredNum == -1)
			{
				done = true;
			}
			else if(enteredNum >= 0)
			{
				int [] randomArray = makeRandomArray(enteredNum, 1000);
				selectionSort(randomArray);
			}
			else
			{
				System.out.println("Please enter a number greater than or equal to 0!  Or Enter -1 when finished.");
			}
	
		}
		input.close();*/
		
		
		/*int[] testArray1 = {5, 3,4,10,22,5,15}; 
		selectionSort(testArray1);
		
		int[] testArray2 = {10,22,5,15}; 
		selectionSort(testArray2);
		
		int[] testArray3 = {5,15}; 
		selectionSort(testArray3);
		
		int[] testArray4 = {5, 3, 4, 10, 22, 5, 15, 9, 8, 7}; 
		selectionSort(testArray4);*/

		
		/*int[] testArray1 = {5, 3,4,10,22,5,15}; 
		System.out.println(selectionSort(testArray1));
		
		int[] testArray2 = {10,22,5,15}; 
		System.out.println(selectionSort(testArray2));
		
		int[] testArray3 = {5,15}; 
		System.out.println(selectionSort(testArray3));
		
		int[] testArray4 = {5, 3, 4, 10, 22, 5, 15, 9, 8, 7}; 
		System.out.println(selectionSort(testArray4));*/
		
		Student johnDoe = new Student("John Doe");
		
		Course math265 = new Course("Intro to Adv Math", 265, 4);
		Course math151 = new Course("Calculus I", 151, 4);
		Course math331 = new Course("Real Analysis", 331, 4);
		Course math155 = new Course("Discrete Math", 155, 4);
		Course math200 = new Course("Calculus II", 200, 4);
		Course math201 = new Course("Linear Algebra", 201, 4);
		Course math230 = new Course("Complex Variables", 230, 4);
		Course math199 = new Course("Calculus III", 199, 4);
		Course music159 = new Course("Intro to Jazz", 159, 2);
		Course physics101 = new Course("Basic Physics", 101, 4);
		Course chem365 = new Course("Biochemistry", 365, 4);
		
		//Scenario 1: A Math major taking no courses.Does not qualify for the math major.
		System.out.println(johnDoe);
		//End Scenario: Student does not qualify for any major; especially math.
		
		
		//Scenario 2:A Math major taking courses, but no Math courses. 
		johnDoe.addCourse(music159);
		johnDoe.addCourse(physics101);
		johnDoe.addCourse(chem365);
		System.out.println(johnDoe);
		//End Scenario: Does not qualify for the math major.

		/*johnDoe.dropCourse(music159);
		johnDoe.dropCourse(physics101);
		johnDoe.dropCourse(chem365);
		
		//Scenario 3:Math major with 3 or more Math courses, but only 1 or 2 are above the 200 level.
		johnDoe.addCourse(math230);
		johnDoe.addCourse(math201);
		johnDoe.addCourse(math155);
		johnDoe.addCourse(math151);
		System.out.println(johnDoe);
		//End Scenario: Student does not qualify for math major.
		
		johnDoe.dropCourse(math230);
		johnDoe.dropCourse(math201);
		johnDoe.dropCourse(math155);
		johnDoe.dropCourse(math151);
		
		
		//Scenario 4: A Math major with 3 Math courses above the 200 level
		johnDoe.addCourse(math230);
		johnDoe.addCourse(math201);
		johnDoe.addCourse(math331);
		johnDoe.addCourse(chem365);
		johnDoe.addCourse(physics101);
		System.out.println(johnDoe);
		//End Scenario: Student does qualify for a math major.
		
		johnDoe.dropCourse(math230);
		johnDoe.dropCourse(math201);
		johnDoe.dropCourse(math331);
		johnDoe.dropCourse(chem365);
		johnDoe.dropCourse(physics101);
		
		
		//Scenario 5:A Math major with more than 3 Math courses above the 200 level.
		johnDoe.addCourse(math230);
		johnDoe.addCourse(math201);
		johnDoe.addCourse(math331);
		johnDoe.addCourse(math265);
		System.out.println(johnDoe);
		//End Scenario: Student does qualify for a math major.
		
		johnDoe.dropCourse(math230);
		johnDoe.dropCourse(math201);
		johnDoe.dropCourse(math331);
		johnDoe.dropCourse(math265);
		
		//Scenario 6:A Math major with 3 courses above the 200 level, but not all of them are Math courses.
		johnDoe.addCourse(chem365);
		johnDoe.addCourse(math331);
		johnDoe.addCourse(math265);
		johnDoe.addCourse(physics101);
		johnDoe.addCourse(math155);
		//System.out.println(johnDoe);
		//End Scenario: Student does not qualify for a math major.
		
		johnDoe.dropCourse(chem365);
		johnDoe.dropCourse(math331);
		johnDoe.dropCourse(math265);
		johnDoe.dropCourse(physics101);
		johnDoe.dropCourse(math155);
		
		//Scenario 7: A math major taking 3 math course but none are above 200.
		johnDoe.addCourse(math155);
		johnDoe.addCourse(math151);
		johnDoe.addCourse(math199);
		//System.out.println(johnDoe);
		//End Scenario: Student does not qualify for a math major.*/

}
