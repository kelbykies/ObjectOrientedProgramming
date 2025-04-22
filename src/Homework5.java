import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework5 {
	
	public static int[] [] determiningSuccessiveDifferences(int [] startArray)
	{
		if(startArray.length != 0)
		{
			int [] [] jagged = new int[startArray.length][];
			jagged[0] = startArray;
			
			/*for(int position = 0; position < startArray.length ; position++)
			{
				jagged[0][position] = startArray[position];
			}*/
			
			int row1length = jagged[0].length;
			
			for(int row = 1; row <= row1length - 1; row++)
			{
				jagged[row] = new int[row1length - row];
				//System.out.print(Arrays.deepToString(jagged));
				
				for(int column = 0; column < row1length - row; column++)
				{
					int difference = jagged[row - 1][column + 1] - jagged[row - 1][column];
					jagged[row][column] = difference;
				}
			}
			return jagged;
		}
		else
		{
			int [] [] jagged = null;
			System.out.println("There are no inegers in this Array. There are no successive differences");
			return jagged;
		}
		
	}
	
	public static List<Integer> intermixArrays(List<Integer> array1, List<Integer> array2)
	{
		List<Integer> finalArrayList = new ArrayList<Integer>();
		int smallerList = Integer.min(array1.size(), array2.size());
		List<Integer> longerList = array1;
		
		if(array1.size() == smallerList)
		{
			longerList = array2;	
		}
		
		for(int position = 0; position < smallerList; position++)
		{
			finalArrayList.add(array1.get(position));
			finalArrayList.add(array2.get(position));
		}
	
		for(int count = smallerList; count < (longerList.size()); count++)
		{
			finalArrayList.add(longerList.get(count));
		}
		return finalArrayList;
	}
	
	public static void main(String[] args)
	{

		/*List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		//test1: basic test
		list1.add(3);
		list1.add(8);
		list1.add(7);
		list1.add(1);
		
		list2.add(4);
		list2.add(5);*/
		
		//Test2:Lists of the same size
		/*list1.add(3);
		list1.add(9);
		list1.add(5);
		
		list2.add(2);
		list2.add(4);
		list2.add(6);*/
		
		//Test3:Nothing in the lists.
		
		
		//Test4: One list is empty
		/*list1.add(8);
		list1.add(10);
		list1.add(5);*/
		
		//Test5:Lists have one element
		/*list1.add(3);
		list2.add(9);*/
		
		//Test6:Super long list for one and one element in the other
		/*list1.add(8);
		list1.add(7);
		list1.add(1);
		list1.add(3);
		list1.add(9);
		list1.add(5);
		list1.add(13);
		list1.add(10);
		list1.add(5);
		list2.add(4);*/
		
		//System.out.println(intermixArrays(list1, list2));
		
		
		
		
		int [] initialArray = {2, 9, 28, 65, 126};
		int [] startArray = {1, 1, 1, 1};
		int [] array1 = {4, 3, 2, 1};
		int [] testArray = {};
		int [] beginningArray = {1345, 2987, 42, 1};
		
		//Test1: Example
		int [] [] finalArray = determiningSuccessiveDifferences(initialArray);
		
		//Test2: Array with the same numbers
		//int [] [] finalArray = determiningSuccessiveDifferences(startArray);
		
		//Test3: negative differences
		//int[] [] finalArray = determiningSuccessiveDifferences(array1);
		
		//Test4: empty array
		//int [] [] finalArray = {{}};
		
		//Test5: Big Numbers
		//int[] [] finalArray = determiningSuccessiveDifferences(beginningArray);
	
		
		for(int[] row : finalArray)
		{
			for(int element : row)
			{
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
		
		
			/*List<Integer> myList = new ArrayList<Integer>();
			myList.add(3);
			myList.add(4);
			myList.add(5);
			myList.remove(1);
			//System.out.println(myList);
			
			
			Student student1 = new Student("Hedda Lettuce", 123);
			Student student2 = new Student("Jerry Attrick", 456);
			Student student3 = new Student("Hedda Lettuce", 123);
			Student student4 = student1;
				
			List<Student> students = new ArrayList<>();
			students.add(student1);
			students.remove(student3);
			students.remove(student4);
			System.out.print(students);*/
			
			//String test = "This is a test string";	
		/*int [] data = {1, 2, 3, 4};
		final int minSize = 10;
		int total = 0;

		for (int index = 0; index < data.size(); index++)
		{
			     		if (data.get(index).computeArea() > minSize) 
		{
		total++;
		}
		}*/
			
		
		
	}}

