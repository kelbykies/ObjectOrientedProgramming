import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class hw10
{
	public static void compareWordLength(String comparedWord, String readFileName, String writeFileName)
	{
		try
        {
            FileReader filereader = new FileReader(readFileName);
            PrintWriter output = new PrintWriter(writeFileName);
            Scanner input = new Scanner(filereader);

            while (input.hasNextLine())
            {
                String line = input.nextLine();
                boolean wordIsLonger = false;
                String[] words = line.split(" ");

                for (String word : words)
                    if (word.length() > comparedWord.length())
                    {
                        wordIsLonger = true;
                    }
                if(wordIsLonger == true)
                {
                		output.println(line);
                }
            }
            filereader.close();
            output.close();
        }
        catch (IOException exception)
        {
            System.out.println("Some problem occurred with the file!!!");
        }
    }
	
	public static void countNonSpaceCharacters(String readFileName)
	{
		try
		{
			FileReader filereader = new FileReader(readFileName);
			Scanner input = new Scanner(filereader);
			List<String> lines = new ArrayList<>();
			List<String> outputArray = new ArrayList<>();
			
			while (input.hasNextLine())
            {
                String line = input.nextLine();
                lines.add(line);
             
            }   
			filereader.close();
			PrintWriter output = new PrintWriter(readFileName);
			
             for(String element : lines)
             {
            	 	String[] modifiedWords = element.split(" ");
            	 	int characterCount = 0;
            	 	
            	 	for (String word : modifiedWords)
                {
                		characterCount += word.length();
                } 
            	 	outputArray.add(element + " " + characterCount);
             
            	 output.println(element + " " + characterCount);
             }
             output.close();
            
          }

		catch (Exception exception)
        {
            System.out.println("Some problem occurred with the file!!!");
        }
	}


	public static void modifyEmailList(String emailList, String outputEmailList)
	{
		try
        {
            FileReader emailReader = new FileReader(emailList);
            PrintWriter output = new PrintWriter(outputEmailList);
            Scanner input = new Scanner(emailReader);

            while (input.hasNextLine())
            {
                String line = input.nextLine();
                String[] words = line.split(" ");
                
                output.print(line + "; ");
            }
            
            emailReader.close();
            output.close();
        }
        catch (IOException exception)
        {
            System.out.println("Some problem occurred with the file!!!");
        }
		
	}
	
public static void main(String[] args)
	{
		//compareWordLength("hello", "file1", "file2");
		
		//Nonstarred: 102
/*		countNonSpaceCharacters("file1");
		countNonSpaceCharacters("counttest1");
		countNonSpaceCharacters("counttest2");
		countNonSpaceCharacters("counttest3");
		countNonSpaceCharacters("counttest4");
		countNonSpaceCharacters("counttest5");*/
		
		//Starred Question
		/*modifyEmailList("emailtest.txt", "outputEmailList.txt");
		modifyEmailList("emailtest2.txt", "outputEmailList.txt");
		modifyEmailList("emailtest3", "outputEmailList.txt");
		modifyEmailList("emailtest4", "outputEmailList.txt");
		modifyEmailList("emailtest5", "outputEmailList.txt");*/
		
		//Nonstarred 103
		Major cmsc = new ComputerScience();
		Student jonathanSteinkruger = new Student("Jonathan Steinkruger", cmsc);
		Student marisaKonz = new Student("Marisa Konz", cmsc);
		Student winnieThePooh = new Student("Winnie The Pooh", cmsc);
		Student tomCruise = new Student("Tom Cruise", cmsc);
		Student davidSpade = new Student("David Spade", cmsc);
		
		//graduate courses
		CGPcourse computerScience =  new CGPcourse("CMSC", 175, 4,"Ankeny");
		CGPcourse math = new CGPcourse("MATH", 365, 4, "West Des Moines");
		CGPcourse constitutionalLaw = new CGPcourse("Constitutional Law", 250, 4, "Ankeny");
		CGPcourse biochemistry = new CGPcourse("CHEM", 359, 4, "West Des Moines");
		CGPcourse biology = new CGPcourse("BIOL", 300, 4, "Ankeny");
		CGPcourse nutrition = new CGPcourse("Nutrition", 370, 4, "West Des Moines");
		
		//normalcourses
		Course discrete = new Course("CMSC", 175, 4);
		Course dataStructures = new Course("CMSC", 155, 4);
		Course introToProgram = new Course("CMSC", 150, 4);
		Course biochem = new Course("CHEM", 365, 4);

		//Scenario 1: Adding graduate courses and normal courses
		jonathanSteinkruger.addCourse(computerScience);
		jonathanSteinkruger.addCourse(math);
		jonathanSteinkruger.addCourse(biology);
		jonathanSteinkruger.addCourse(dataStructures);
		jonathanSteinkruger.dropCourse(dataStructures);
		System.out.println(jonathanSteinkruger);
		
		//End Scenario
		
		//Scenario 2: Adding a graduate and normal course with the same code
		marisaKonz.addCourse(biochem);
		marisaKonz.addCourse(biochemistry);
		marisaKonz.addCourse(computerScience);
		marisaKonz.addCourse(introToProgram);
		System.out.println(marisaKonz);
		//End Scenario
		
		//Scenario 3: Adding the same course twice
		winnieThePooh.addCourse(biochemistry);
		winnieThePooh.addCourse(biochemistry);
		System.out.println(winnieThePooh);
		//End Scenario
		
		//Scenario 4: Dropping  course when there is no course
		tomCruise.dropCourse(constitutionalLaw);
		tomCruise.dropCourse(discrete);
		System.out.println(tomCruise);
		//End Scenario
		
		//Scenario 5: 
		davidSpade.addCourse(discrete);
		davidSpade.addCourse(math);
		davidSpade.addCourse(computerScience);
		davidSpade.addCourse(biology);
		davidSpade.addCourse(nutrition);
		System.out.println(davidSpade);
		
		/*List<Course> classList = new ArrayList<>();
		classList.add(discrete);
		classList.add(dataStructures);
		classList.add(biochem);
		classList.add(introToProgram);
		
		List<CGPcourse> cgpList = new ArrayList<>();
		
		for(Course course : classList)
		{
			cgpList.add(course.makeCGPCourse("West Des Moines"));
		}
		
		for(CGPcourse course : cgpList)
		{
			System.out.println(course);
		}*/
}
}
