import java.io.FileReader;
import java.io.IOException;
import java.lang.Math;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class hw13 
{
private static boolean isPrime(int n) 
	{
	    if (n < 2) return false;
	    if (n == 2 || n == 3) return true;
	    if (n % 2 == 0 || n % 3 == 0) return false;

	    int sqrtN = (int) Math.sqrt(n) + 1;
	    
	    for (int divisor = 6; divisor <= sqrtN; divisor += 6) 
	    {
	        if (n % (divisor-1) == 0 || n % (divisor+1) == 0) return false;
	    }

	    return true;
	}

private static void findTheDiagonalString(String filename)
{
	 try
     {
         FileReader reader = new FileReader(filename);
         Scanner input = new Scanner(reader);

         while (input.hasNext())
         {
        	 	String word = input.next(); // Read one WORD at a time.
             
         }

         reader.close();
     }
     catch (IOException exception)
     {
         System.out.println("Some problem occurred with the file!!!");
     }
}

	public static void main(String[] args) {
	
		//Prime
		/*System.out.println(isPrime(13));
		System.out.println(isPrime(23));
		System.out.println(isPrime(17));
		System.out.println(isPrime(29));
		System.out.println(isPrime(31));
		System.out.println(isPrime(5));
		System.out.println(isPrime(179));
		
		//Not Prime
		System.out.println(isPrime(25));
		System.out.println(isPrime(16));
		System.out.println(isPrime(4));
		System.out.println(isPrime(35));
		System.out.println(isPrime(0));
		System.out.println(isPrime(1));*/
		
		
		/*Scanner input = new Scanner(System.in);
		String filename = "";
		int number = 0;
		
		do
		{
			System.out.print("Type an integer between 1 and 9: ");
			if (input.hasNextInt()) number = input.nextInt();
			else 
			{
				input.next();
				System.out.println("Wrong entry. Please enter an integer between 1 and 9");
			}
		}
		
		while (!(1 <= number && number <= 9));
		{
			if (number == 1) filename = "file1.txt";
			if (number == 2) filename = "file2.txt";
			if (number == 3) filename = "file3.txt";
			if (number == 4) filename = "file4.txt";
			if (number == 5) filename = "file5.txt";
			if (number == 6) filename = "file6.txt";
			if (number == 7) filename = "file7.txt";
			if (number == 8) filename = "file8.txt";
			if (number == 9) filename = "file9.txt";
		}
		System.out.println(filename);*/
		
		//findTheDiagonalString("diagonal");
		/*String cmscMajor = "cmscMajor";
		
		Major cmsc = new ComputerScience(cmscMajor);
		
		Student johnDoe = new Student("John Doe",cmsc);
		Student donaldDuck = new Student("Donald Duck",cmsc);
		Student ronWeasley = new Student("Ron Weasley", cmsc);
		Student kateShelley = new Student("Kate Shelley", cmsc);
		Student harryPotter = new Student("Harry Potter", cmsc);
		Student jenniferAniston = new Student("Jennifer Aniston", cmsc);
		
		Course discrete = new Course(cmscMajor, 175, 3);
		Course dataStructures = new Course(cmscMajor, 155, 4);
		Course introToProgram = new Course(cmscMajor, 150, 4);
		Course operatingSystems = new Course(cmscMajor, 335, 4);
		Course capstone = new Course(cmscMajor, 385, 1);
		Course programmingLanguages = new Course(cmscMajor, 315, 5);
		Course chem = new Course("Biochemistry", 365, 4);
		Course physics = new Course("Physics", 101, 3);
		Course biology = new Course("Biology", 101, 3);
		Course music = new Course("Music", 260, 5);
		
		//Scenario 1: A Computer Science major taking no courses. Does not qualify for the math major.
				System.out.println(johnDoe);
				System.out.println();
				//End Scenario: Student does not qualify for any major; especially computer science.
							
				//Scenario 2:A Computer Science major taking 3 computer science courses, 2 of which are above 300
				donaldDuck.addCourse(operatingSystems);
				donaldDuck.addCourse(discrete);
				donaldDuck.addCourse(capstone);
				System.out.println(donaldDuck);
				System.out.println();
				//End Scenario: Does qualify for the computer science major.

				//Scenario 3:Person with 3 computer science classes, but none are over 300
				ronWeasley.addCourse(introToProgram);
				ronWeasley.addCourse(discrete);
				ronWeasley.addCourse(dataStructures);
				System.out.println(ronWeasley);
				System.out.println();
				//End Scenario: Student does not qualify for computer science major.
					
				//Scenario 4: A Math major with 3 computer science courses above the 300 level
				kateShelley.addCourse(operatingSystems);
				kateShelley.addCourse(capstone);
				kateShelley.addCourse(programmingLanguages);
				System.out.println(kateShelley);
				System.out.println();
				//End Scenario: Student does qualify for a computer science major.
					
			//Scenario 5:Student has 4 classes all computer science, drops the one that is above 300
				harryPotter.addCourse(capstone);
				harryPotter.addCourse(introToProgram);
				harryPotter.addCourse(discrete);
				harryPotter.addCourse(dataStructures);
				harryPotter.dropCourse(capstone);
				System.out.println(harryPotter);
				System.out.println();
				//End Scenario: Student does not qualify for a computer science major.
					
				//Scenario 6:A student with no computer science courses
				jenniferAniston.addCourse(chem);
				jenniferAniston.addCourse(biology);
				jenniferAniston.addCourse(music);
				jenniferAniston.addCourse(physics);
				System.out.println(jenniferAniston);
				System.out.println();
				//End Scenario: Student does not qualify for a computer science major.*/
	}		

}
