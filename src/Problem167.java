import java.util.ArrayList;
import java.util.List;

public class Problem167 {

	private static List<Integer>  shortenArrays(int[] testArray, int n)
	{
		List<Integer> finalArray = new ArrayList<>();
		int stoppingPointFromStart = n - 1;
		int stoppingPointFromEnd = (testArray.length) - n;
		int halfListLength = (testArray.length)/2;
		
		if(n < halfListLength)
		{
			for(int frontElement = 0; frontElement <= stoppingPointFromStart; frontElement++)
			{
				finalArray.add(testArray[frontElement]);
			}
			
			for(int endElement = stoppingPointFromEnd; endElement <= testArray.length - 1; endElement++)
			{
				finalArray.add(testArray[endElement]);
			}
		}
		else
		{
			for(int frontElement = 0; frontElement < halfListLength; frontElement++)
			{
				finalArray.add(testArray[frontElement]);
			}
			for(int endElement = halfListLength; endElement <= testArray.length - 1; endElement++)
			{
				finalArray.add(testArray[endElement]);
			}
		}
		return finalArray;
	}
	public static void main(String[] args) {
		
		//n=0
		int [] array1 = {1, 3, 8, -1, 5, 1, 4};
		System.out.println(shortenArrays(array1, 0));
		
		//n=2
		int [] array2 = {1, 3, 8, -1, 5, 1, 4};
		System.out.println(shortenArrays(array2, 2));
		
		//n=4
		int [] array3 = {1, 3, 8, -1, 5, 1, 4};
		System.out.println(shortenArrays(array3, 4));
		
		//n = 5
		int [] array4 = {1, 3, 8, -1, 5, 1, 4};
		System.out.println(shortenArrays(array4, 5));
		
		//even numbered array
		int [] array5 = {1, 3, 8, 5, 1, 4};
		System.out.println(shortenArrays(array5, 2));
		
		//empty array
		int [] array6 = {};
		System.out.println(shortenArrays(array6, 3));
		
		//n = # larger then the size of the array
		int [] array7 = {1, 3, 8, -1, 5, 1, 4};
		System.out.println(shortenArrays(array7, 8));
	}
}
