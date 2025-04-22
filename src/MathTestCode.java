
public class MathTestCode {

	public static void main(String args[])
	{
		Student johnDoe = new Student("John Doe", new Major);
		
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
		
		/*//Scenario 1: A Math major taking no courses.Does not qualify for the math major.
		System.out.println(johnDoe);
		//End Scenario: Student does not qualify for any major; especially math.*/
		
		
		//Scenario 2:A Math major taking courses, but no Math courses. 
		johnDoe.addCourse(music159);
		johnDoe.addCourse(physics101);
		johnDoe.addCourse(chem365);
		
		

	}
}
