import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class homework9 {
		/*Integer[] myArray = {-3, 1, 7, -2, 6, -3, -5, 0, 9};
		ArrayList<Integer> myArrayList = new ArrayList<>(Arrays.asList(myArray));

		for (Integer x : myArrayList)
	   		if (x < 0) myArrayList.remove(x);*/
		
		public static void addScoresToTotal(int total)
		{
			Scanner input = new Scanner(System.in);
			final int numberOfScores = 5;
			
			for (int count = 1; count <= numberOfScores; count++)
			{
				System.out.print("Enter score[" + count + "]: ");
				if (input.hasNextInt()) 
				{
					total += input.nextInt();
				}
				else 
				{ 
					System.out.println("Enter integers only."); 
	input.next(); // Read past the non-integer.
					count--;      // Go back one, to repeat the input.
				}
			}
			}

			public static void main(String[] args) {
				
				/*int total = 0;
				addScoresToTotal(total);
				System.out.println("total = " + total);*/
				
				Integer[] myArray = {-3, 1, 7, -2, 6, -3, -5, 0, 9};
				ArrayList<Integer> myArrayList = new ArrayList<>(Arrays.asList(myArray));

				for (Integer x : myArrayList)
			   		{
						if (x < 0) { 
							System.out.println("Hello");
							myArrayList.remove(x);}
					}
				




	}

}
