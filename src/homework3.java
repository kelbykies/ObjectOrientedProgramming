import java.util.Random;
import java.util.Scanner;
public class homework3 {
	/*private static boolean wordsInAlphabetical(String firstString, String secondString, String thirdString)
	{
		int firstAndSecond = firstString.compareTo(secondString);
		if (firstAndSecond < 0)
		{
			int secondAndThird = secondString.compareTo(thirdString);
			if(secondAndThird < 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
	
		System.out.print(wordsInAlphabetical("hard place", "man", "rock"));*/
		
	
	/*private static void letterGrade(String grade)
	{

		switch(grade)
		{
			case "A":
				System.out.println("4"); break;
			
			case "B":
				System.out.println("3");break;
				
			case "C":
				System.out.println("2");break;
				
			case "D":
				System.out.println("1");break;
				
			case "F":
				System.out.println("0"); break;
		}	
	}
	
	public static void main(String [] args)
	{
		boolean done = false;
		Scanner input = new Scanner(System.in);
		while(!done)
		{	
			System.out.println("Please enter one of the following letter Grades: A B C D F.\n"
					+"When you are finished entering grades, type DONE.");
			String grade = input.nextLine();
			
			switch(grade)
			{
			
				case "DONE": done = true; break;
				case "A": letterGrade(grade);break;
				case "B": letterGrade(grade);break;
				case "C": letterGrade(grade);break;
				case "D": letterGrade(grade);break;
				case "F": letterGrade(grade);break;
				default: System.out.println("Error. You have entered an invalid grade." + 
						"Please type any letter from A-F, excluding E.");
			}
		
		}
		input.close();
	}*/
	
	/*private static int findAnInteger(int number, int position)
	{
	String number_string = "" + number;
	
	String x = number_string.substring(position-1, position);
	int y = Integer.parseInt(x);
	
	return y;
	}

	public static void main(String[] args) 
	{
	System.out.print(findAnInteger(2468, 3));
		
	}*/
	
	/*public static void main(String[] args)
    {
		int a = 1, b = 2; 	
		swap(a, b);
		System.out.println("a = " + a + " b = " + b);
	}

private static void swap(double x, double y)
    {
        double temp = x;
		x = y;
		y = temp;
		System.out.println("x = " + x + " y = " + y);
    }*/

	/*public static String compareToFive(double x)
	 {
		if (x > 5) return "greaterThanFive";
		else if (x < 5) return "lessThanFive";
		else return "equalToFive";
	 }
	public static void main(String[] args)
	{
		System.out.print(compareToFive(5));
	}*/
	
/*private static int randomNumber(int countmax, int multiplier)
{
	Random random = new Random();
	int total = 0;

	for (int count = 1; count <= countmax; count++)
	{
		int firstNumber = random.nextInt(countmax * multiplier);
		int secondNumber = random.nextInt(countmax * (multiplier * 2));
		if (secondNumber < firstNumber) total++;
	}
	return total;
	
}
	
public static void main(String[] args)
{
	
		System.out.println(randomNumber(10, 1) + " random numbers less than 20 were smaller than numbers less than 10.");
		System.out.println(randomNumber(20, 5 ) + " random numbers less than 200 were smaller than numbers less than 100.");

}*/
	
/*private static String letterShift(String codedWord, int shiftAmount)
{
	char letter;
	char newLetter;
	String newWord = "";
	for(int i = 0; i < codedWord.length(); i++)
	{
		letter = codedWord.charAt(i);
		newLetter = (char) (letter + shiftAmount);
		for(int j = 0; j < Math.abs(shiftAmount); j++)
		{
			if(newLetter > 'z')
			{
				int zToA = newLetter - 'z';
				letter = 'a';
				newLetter = (char) (letter + (zToA - 1));
			}
			if(newLetter < 'a')
			{
				int aToZ = newLetter - 'a';
				letter = 'z';
				newLetter = (char) (letter + (aToZ + 1));
			}
		}
		newWord = newWord + newLetter;
	}
	return newWord;
}
public static void main(String[] args)
{
	System.out.println(letterShift("nkrru", -6));
	System.out.println(letterShift("xvo", 5));
	System.out.println(letterShift("haahjrhakhdu" , -7));
	System.out.println(letterShift("bttipiiwtipaadpzigttpibxscxvwiqgxcviwtvddsh", 11));
	System.out.println(letterShift("wmsnpmzyzjwrfglirfgqgqyqcapcrkcqqyecfyfy", 54));
	
}*/
	private static void formNumberBlock(int height, int width)
	{
		int number = 1;
		int topHalf = height - (height/2);

		for(int row = 1; row <= topHalf; row++)
		{
			
			for(int position = 1; position <= row; position++)
			{
				System.out.print(position + " ");
			}
			
			for(int steady = 1; steady <= (width -(2*row)) + 1; steady++)
			{
				System.out.print(number + " ");
				
			}
			number++;
			
			for(int decrease = row - 1; decrease > 0; decrease--)
			{
				System.out.print(decrease + " ");
			}
			System.out.println();	
		}
		
		for(int row = topHalf; row < height; row++)
		{
			int middleNumber = (height - row);
			number = middleNumber;
			for(int position = 1; position <= middleNumber; position++)
			{
				System.out.print(position + " ");
			}
	
			
			for(int steady = 1; steady <= (width -(2 * middleNumber)) + 1; steady++)
			{
				System.out.print(number + " ");

			}
			number--;
			for(int decrease = middleNumber - 1; decrease > 0; decrease--)
			{
				System.out.print(decrease + " ");
			}
			System.out.println();
			
		}		
	}

	public static void main(String[] args)
	{
		formNumberBlock(5,7);
		System.out.println();
		formNumberBlock(2,3);
		System.out.println();
		formNumberBlock(6,7);
		System.out.println();
		formNumberBlock(9,9);
	}
	
}

	

