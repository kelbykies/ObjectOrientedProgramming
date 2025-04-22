
public class homework8 {

	/*public static String recursiveReverse(String toBeReversed)
	{
	
		if (toBeReversed.equals("")) return "";
		else return recursiveReverse(toBeReversed.substring(1))		
	 + toBeReversed.charAt(0) ;
		
	}*/

	public static void main(String[] args) 
	{
		//int number = "Math".compareTo("Mathematics")	;		
			//	System.out.println(number);
		/*String test = "abcd";
		System.out.println(recursiveReverse(test));*/
		 
		Major cmsc = new ComputerScience("CMSC");
		
		Student johnDoe = new Student("John Doe",cmsc);
		Student donaldDuck = new Student("Donald Duck",cmsc);
		Student ronWeasley = new Student("Ron Weasley", cmsc);
		Student kateShelley = new Student("Kate Shelley", cmsc);
		Student harryPotter = new Student("Harry Potter", cmsc);
		Student jenniferAniston = new Student("Jennifer Aniston", cmsc);
		
		Course discrete = new Course("CMSC", 175, 3);
		Course dataStructures = new Course("CMSC", 155, 4);
		Course introToProgram = new Course("CMSC", 150, 4);
		Course operatingSystems = new Course("CMSC", 335, 4);
		Course capstone = new Course("CMSC", 385, 1);
		Course programmingLanguages = new Course("CMSC", 315, 5);
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
				//End Scenario: Student does not qualify for a computer science major.
		}
}


