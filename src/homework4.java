import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class homework4 
{
	public static void main(String[] args) {
		
		/*int numberOfChildren = 0;
		final Scanner input = new Scanner(System.in);
		boolean done = false;
		
		while(!done)
		{
			System.out.println("Enter a number of children from 1 to 6. Type 7 when done: ");
			int userinput = input.nextInt();
			if (userinput == 7)
			{
				done = true;
			}
			else
			{
				System.out.println(computeChildExemption(userinput));
			}
		}*/
	
		Student henryFord = new Student("Henry Ford");
		Student barackObama = new Student("Barack Obama");
		Student georgeWashington = new Student("George Washington");
		Student brittneySpears = new Student("Britteny Spears");
		
		Course discrete = new Course("CMSC", 175, 3);
		Course dataStructures = new Course("CMSC", 155, 4);
		Course physics = new Course("Physics", 101, 3);
		Course biology = new Course("Biology", 101, 3);
		Course music = new Course("Music", 260, 5);
		Course chem = new Course("Biochemistry", 365, 4);
		
		henryFord.addCourse(discrete);
		henryFord.addCourse(dataStructures);
		henryFord.addCourse(physics);
		henryFord.addCourse(biology);
		henryFord.addCourse(music);
		
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
		System.out.println(brittneySpears);
		
		/*Student taylorSimmons = new Student("Taylor Simmons");
		Student bobTheBuilder = new Student("Bob The Builder");
		Student harryPotter = new Student("Harry Potter");
		Student abrahamLincoln = new Student("Abraham Lincoln");
		Student kelbyKies = new Student("Kelby Kies");
		Student jonathanSteinkruger = new Student("Jonathan Steinkruger");
		Student abbyLundquist = new Student("Abby Lundquist");*/
	
	
		
		/*// Scenario 1: Ordinary adds and drops
		harryPotter.addCourse(dataStructures); 	
		harryPotter.addCourse(discrete); 	 
		harryPotter.addCourse(physics);
		//harryPotter.dropCourse(physics);   
		harryPotter.addCourse(music);	
		//harryPotter.dropCourse(discrete);  
		harryPotter.addCourse(chem);

		// Scenario 2: Adding the same class twice
		jonathanSteinkruger.addCourse(dataStructures); 	
		jonathanSteinkruger.addCourse(dataStructures); 	 
		jonathanSteinkruger.addCourse(physics);
		//jonathanSteinkruger.dropCourse(dataStructures);   
		jonathanSteinkruger.addCourse(music);	
		jonathanSteinkruger.dropCourse(discrete);  
		
		// Scenario 3: Max Number of classes 3
		kelbyKies.addCourse(dataStructures); 	
		kelbyKies.addCourse(discrete); 	 
		kelbyKies.addCourse(physics);
		kelbyKies.addCourse(music);	
		kelbyKies.dropCourse(discrete);    

		// Scenario 4: Dropping a class the student isn’t in
		taylorSimmons.addCourse(dataStructures); 		 
		taylorSimmons.addCourse(physics);
		taylorSimmons.addCourse(music);	
		taylorSimmons.dropCourse(discrete);  
		  

		// Scenario 5: adding a class previously dropped;
		abrahamLincoln.dropCourse(dataStructures); 		 
		abrahamLincoln.addCourse(dataStructures);
		abrahamLincoln.addCourse(music);	
		abrahamLincoln.dropCourse(discrete);  

		// Scenario 3: Dropping a class when you have none		 
		bobTheBuilder.dropCourse(discrete);  
		
		//Scenario 4: Adding more than maximum number of classes, then dropping a class, then adding another one, to make sure it’s allowed.
		abbyLundquist.addCourse(dataStructures);
		abbyLundquist.addCourse(music);
		abbyLundquist.addCourse(discrete);
		abbyLundquist.addCourse(physics);
		abbyLundquist.addCourse(biology);
		abbyLundquist.dropCourse(discrete);
		abbyLundquist.addCourse(biology);
		
		System.out.print(taylorSimmons); // Student is in classes: CMSC155, Physics101, Music 260 
		System.out.println();
		System.out.print(bobTheBuilder); // Student is in classes: None 
		System.out.println();
		System.out.print(harryPotter); // should be in: CMSC155 and Music260
		System.out.println();
		System.out.print(abrahamLincoln);// Student is in classes: CMSC155, CMSC175, Music 260 
		System.out.println();
		System.out.print(kelbyKies);// Can only be in 3 classes: datastructures, discrete and physics.
										//The extra classes that are added after the max will just not be added.
		System.out.println();
		System.out.print(jonathanSteinkruger); //should be in: CMSC155 and Physics101 and Music260 and CMSC 175
		System.out.println();
		System.out.print(abbyLundquist);//Student is in classes:datastructures, music, physics and biology*/
		
		
		
		/*Student bob1 = new Student("Bob Smith", 3);
	   	Student bob2 = new Student("Bob Smith", 3);
	   	Student bob3 = bob1;
	  	Student bob4 = bob3;

	  	System.out.println(bob1 == bob2);
	  	System.out.println(bob2 == bob3);
	  	System.out.println(bob4 == bob1);
	  	System.out.println(bob1.equals(bob3));
	  	System.out.println(bob4.equals(bob2));*/
		
		
		/*System.out.println("Hedda Lettuce's ID is less than Bob the Builder: " + heddaLettuce.precedesByID(bobTheBuilder));
		System.out.println("Bob the Builder's ID is less than Harry Potter: " + bobTheBuilder.precedesByID(harryPotter));
		System.out.println("Harry Potter's ID is less than Abraham Lincoln: " + harryPotter.precedesByID(abrahamLincoln));
		
		//Reverse Comparison
		System.out.println("Bob the builder's ID is less than hedda Lettuce: " + bobTheBuilder.precedesByID(heddaLettuce));
		System.out.println("Harry Potter's ID is less than Bob the Builder: " + harryPotter.precedesByID(bobTheBuilder));
		System.out.println("Abraham Lincoln's ID is less than Harry Potter: " + abrahamLincoln.precedesByID(harryPotter));
		System.out.println();
		
		///special case
		System.out.println(heddaLettuce.precedesByID(kelbyKies));
		System.out.println(bobTheBuilder.precedesByID(jonathanSteinkruger));
		System.out.println(bobTheBuilder.precedesByID(bobTheBuilder));*/
		
		
		//string array
		/*Student[] students = new Student[6];
		students[0] = heddaLettuce;
		students[1] = bobTheBuilder;
		students[2] = harryPotter;
		students[3] = abrahamLincoln;
		students[4] = kelbyKies;
		students[5] = jonathanSteinkruger;
		
		for(Student student: students)
		{
			System.out.println(student);
		}
		

		
		
		
		
		
		/*int x = 4, y = 7; 
		double[] a = new double[y]; 

		//System.out.println(a[y-x]);
		//System.out.println(a[x+y/2]);
		int[] c; 
		System.out.println(c[0]);*/
		
		/*String[] array1 = {"Hi", "Bye", "Rye", "Fly", "Try"};
		String[] array2 = {"Hi", "Bye", "Rye", "Fly", "Try"};

		System.out.println(Arrays.equals(array1, array2));*/
		
		/*String x = "How now brown cow";
		String[] word = x.split("b")[0].split("o"); 
	
		System.out.print(Arrays.toString(word));*/
		
		/*int [] test = {};
		System.out.println(compareArrayToNumbers(test, 2.0f, 5.7f));	*/
		
	}

	private static boolean compareArrayToNumbers(int[] number, float num1, float num2)
	{
			List<Integer> newArray = new ArrayList<>();
			for(int i = 0; i < number.length; i++)
			{
				if((float) number[i] <= num2 && (float) number[i] >= num1)
				{
					newArray.add(number[i]);
				}
				else if((float) number[i] >= num2 && (float) number[i] <= num1)
				{
					newArray.add(number[i]);
				}
				else
				{
					i = number.length;
				}
			}
			if(newArray.size() == number.length && number.length > 0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
	}
}

