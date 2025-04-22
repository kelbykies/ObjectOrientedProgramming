
public class testcode {
	public static void main(String args[])
	{
		Major math = new Math();
	
		Student johnDoe = new Student("John Doe", math);
		Student shelbyHunemiller = new Student("Shelby Hunemiller", math);
		Student caseyNickel = new Student("Casey Nickel", math);
		Student kateHudson = new Student("Kate Hudson", math);
		Student elvisPresley = new Student("Elvis Presley", math);
		Student jenniferAniston = new Student("Jennifer Aniston", math);
		Student marilynMonroe = new Student("Marilyn Monroe", math);

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
		System.out.println();
		//End Scenario: Student does not qualify for any major; especially math.
					
		//Scenario 2:A Math major taking courses, but no Math courses. 
		shelbyHunemiller.addCourse(music159);
		shelbyHunemiller.addCourse(physics101);
		shelbyHunemiller.addCourse(chem365);
		System.out.println(shelbyHunemiller);
		System.out.println();
		//End Scenario: Does not qualify for the math major.

		//Scenario 3:Math major with 3 or more Math courses, but only 1 or 2 are above the 200 level.
		caseyNickel.addCourse(math230);
		caseyNickel.addCourse(math201);
		caseyNickel.addCourse(math155);
		caseyNickel.addCourse(math151);
		System.out.println(caseyNickel);
		System.out.println();
		//End Scenario: Student does not qualify for math major.
			
		//Scenario 4: A Math major with 3 Math courses above the 200 level
		kateHudson.addCourse(math230);
		kateHudson.addCourse(math201);
		kateHudson.addCourse(math331);
		kateHudson.addCourse(chem365);
		kateHudson.addCourse(physics101);
		System.out.println(kateHudson);
		System.out.println();
		//End Scenario: Student does qualify for a math major.
			
		//Scenario 5:A Math major with more than 3 Math courses above the 200 level.
		elvisPresley.addCourse(math230);
		elvisPresley.addCourse(math201);
		elvisPresley.addCourse(math331);
		elvisPresley.addCourse(math265);
		System.out.println(elvisPresley);
		System.out.println();
		//End Scenario: Student does qualify for a math major.
			
		//Scenario 6:A Math major with 3 courses above the 200 level, but not all of them are Math courses.
		jenniferAniston.addCourse(chem365);
		jenniferAniston.addCourse(math331);
		jenniferAniston.addCourse(math265);
		jenniferAniston.addCourse(physics101);
		jenniferAniston.addCourse(math155);
		System.out.println(jenniferAniston);
		System.out.println();
		//End Scenario: Student does not qualify for a math major.

		//Scenario 7: A math major taking 3 math course but none are above 200.
		marilynMonroe.addCourse(math155);
		marilynMonroe.addCourse(math151);
		marilynMonroe.addCourse(math199);
		System.out.println(marilynMonroe);
		System.out.println();
		//End Scenario: Student does not qualify for a math major.

	}
}
