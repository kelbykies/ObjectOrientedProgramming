import java.util.Scanner;
import java.text.DecimalFormat;
public class homework2 {
	
	public static void main(String[] args) {
		
		boolean done = false;
		final Scanner input = new Scanner(System.in);
		String shortestWord = "";
		String longestWord = "";
		String userWord;
		int count = 0;
		while(!done)
		{
			
			System.out.print("Please enter a word and press Enter. Type Done when finished.");
			userWord = input.next();
			if(userWord.equals("Done"))
			{
				done = true;
			}	
			else
			{
			int length1 = userWord.length();

			if(count == 0)
			{
				shortestWord = userWord;
				count++;
			}
			else if(length1 < shortestWord.length())
			{
				shortestWord = userWord;	
			}
			else
			{
				longestWord = userWord;
			}
			}
			
		}
		if(shortestWord != "" && longestWord != "")
		{
			System.out.println("The shortest word is " + shortestWord + "\nThe longest word is " + longestWord);
		}
		else
		{
			System.out.println("I'm sorry you did not enter any words.\nTherefore, there is no shortest and no longest word.");
		}
		input.close();
	}
}
		/*String s = "Casey Nickel is VPS";
		int num = s.length();
		System.out.println(s.substring(2,num));
		
		int remainder = num%2;
		
		if(remainder == 0)
		{
			int evenmiddle = num/2;
			System.out.println(s.substring(evenmiddle-1, evenmiddle + 1));
		}
		else if (remainder != 0) 
		{
			int oddmiddle = num/2;
			System.out.println(s.substring(oddmiddle, oddmiddle+1));
		}
		int simpson = s.indexOf("Simpson");
		int college = s.indexOf("College");
		
		if((simpson > 0) && (college > 0))
		{
			System.out.println("This string has Simpson College in it.");
		}
		else if(simpson > 0)
		{
			System.out.println("This string has Simpson in it");
		}
		else if(college > 0)
		{
			System.out.println("This string has College in it");
		}*/
		
		/*String first= "red";
		String second = "blue";
		int wordlength = second.length();
		String backwards = "";
		for(int count = 0; count < wordlength; count++)
			backwards += second.charAt(wordlength-count-1);
		
		
		String firstLetters= first.substring(0,2);
		String secondLetters = backwards.substring(0,2);
		
		
		int num = firstLetters.compareTo(secondLetters);
		//System.out.print(num);
		if(num == 0)
		{
			System.out.println("true");
		}
		else if (num != 0)
		{
			System.out.println("false");
		}*/
		
		/*int i;
		int sum = 0;
		for (i = 1; i <= 10; i++)
		{
		   	sum += i; 
		   	
		}
		System.out.println(sum);*/
		/*int x = 10;
		boolean t = (x > 10); 
		
		if (t == true) 
			{
			System.out.println("x is greater than 10");
			}*/
		
		//PROBLEM 21
		/*double sum = 0;
		int j = 0;
		for (double n = 1; n <=50; n += 2)
		{
			sum+= (1/n);
			sum -= (1/(n+1));

		}
		System.out.println(sum);*/
		//PROBLEM 22
		/*double distance = 10;
		double total = 0;
		DecimalFormat exactlyThree = new DecimalFormat("0.000");
		for(int i = 1; distance >= 0.1; i++)
		{
			total += distance;
			System.out.println("Day " + i + " distance today = " + exactlyThree.format(distance) + " total = " + exactlyThree.format(total));
			distance *= 0.7;
			for(int n = 1; n <= 1 && distance < 0.1; n++)
			{
				total += distance;
				System.out.println("Day " + (i + 1) + " distance today = " + exactlyThree.format(distance) + " total = " + exactlyThree.format(total));
			}
		}*/
		
		//PROBLEM 23
		/*String s = "Java";
		int length = s.length();
			for(int i = 1; i <= length; i++) 
			{
				for(int n = 0; n <= length - i; n++)
				{
					System.out.print(s.substring(n, n + i) + " ");
					
				}
				System.out.println();
			}	*/	
		
			
	
		//PROBLEM 24
		/*boolean canDrink;
		Scanner input = new Scanner(System.in);
		System.out.print("What is your age?");
		if(input.hasNextLine())
		{
			int age = input.nextInt();
		
			if (age >= 21)
			{
				canDrink = true;
				System.out.println("What would you like to drink?");
			}
			else
			{
				canDrink = false;
				System.out.println("Sorry. But you are not old enough to be drinking.");
			}
		}
		input.close();*/
		



		
		



