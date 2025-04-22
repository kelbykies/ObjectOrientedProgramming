import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class arrays {
	
	public static void main(String args[])
	{
		//String[] [] testArray = {{"Hello", "My", "name"}, {"is", "Jonathan", "Steinkruger."},{"How", "Are", "you"}};
		//System.out.println(comparingLengthOfString(testArray, 4, 10));
		
		/*int[] [] integerTestArray1 = { {2, 4, 5}, {0, -1, 13}, {5, 1, 3} };
		computingTheRowSumOfAnArray(integerTestArray1);
		
		int[] [] integerTestArray2 = { {2, 10, 5}, {0, 0, 13}, {5, 1, 3} };
		computingTheRowSumOfAnArray(integerTestArray2);
		
		int[] [] integerTestArray3 = { };
		computingTheRowSumOfAnArray(integerTestArray3);
		
		int[] [] integerTestArray4 = { {2, 4, 5}, {2, 4, 5}, {2, 4, 5} };
		computingTheRowSumOfAnArray(integerTestArray4);*/
		
		/*int[] sortingTest = {4, 2, 8, 2, 1, 10};
		Arrays.sort(sortingTest);
		System.out.println(Arrays.toString(sortingTest));*/
		
		
		/*Double[] tenSortingTest = {10.0, 5.0, 20.0, 80.0, 2.0, 2.0, 40.0};
		Arrays.sort(tenSortingTest, (a,b) -> {if (a % 10 != 0 && b % 10 == 0) return 1; else return -1; }); 
		System.out.println(Arrays.toString(tenSortingTest));*/
		
		Integer[] birthYears1 = {2007, 2002, 1996, 1999, 2001, 1982, 2001, 1998, 1993};
		Arrays.sort(birthYears1, (a,b) -> {if ((Math.abs(1999-a) > Math.abs(1999-b))) return 1; else return -1; });
		System.out.println(Arrays.toString(birthYears1));
		
		Integer[] birthYears2 = {2017, 2002, 1954, 1999, 2000, 1999, 2005, 1990, 2009};
		Arrays.sort(birthYears2, (a,b) -> {if ((Math.abs(1999-a) > Math.abs(1999-b))) return 1; else return -1; });
		System.out.println(Arrays.toString(birthYears2));
		
		Integer[] birthYears3 = {};
		Arrays.sort(birthYears3, (a,b) -> {if ((Math.abs(1999-a) > Math.abs(1999-b))) return 1; else return -1; });
		System.out.println(Arrays.toString(birthYears3));
		
		Integer[] birthYears4 = {2007, -2002, 1996, 1999, -2001, 1982, 2001, -1998, 1993};
		Arrays.sort(birthYears4, (a,b) -> {if ((Math.abs(1999-a) > Math.abs(1999-b))) return 1; else return -1; });
		System.out.println(Arrays.toString(birthYears4));
		
		
	}
	
	/*private static List<String> comparingLengthOfString(String[][] testArray, int minLength, int maxLength)
	{
		List<String> wordsWithLengthBetweenTwoNumbers = new ArrayList<>();	
		for(String[] chunkOfText : testArray )
		{
			for(String element : chunkOfText)
			{
				if(element.length() > minLength && element.length() < maxLength)
				{
					wordsWithLengthBetweenTwoNumbers.add(element);
				}
			}
		}
		return wordsWithLengthBetweenTwoNumbers;
	}*/
	
	//Problem 6
	/*private static void computingTheRowSumOfAnArray(int[][] arrayWithIntegers)
	{
		
		int row = 0;
		int biggestSum = Integer.MIN_VALUE;
		
		for(int i = 0; i < arrayWithIntegers.length; i++)
		{
			int sum = 0;
			for(int j = 0; j < arrayWithIntegers.length; j++)
			{
				sum += arrayWithIntegers[i][j];
			}
			
			if(sum > biggestSum)
			{
				biggestSum = sum;
				row = i + 1;
			}
		}
		System.out.println(biggestSum + " " + row);*/
		
	}

