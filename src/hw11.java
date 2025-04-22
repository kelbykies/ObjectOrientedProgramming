import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class hw11 {
	
	public static String recognizingACelebrity(int[] [] testArray)
	{
		int rowCount = 0;
		int columnTotal = 0;
		int celebRowCount = 0;
	
		for(int row = 0; row < testArray.length; row++)
		{
			rowCount = 0;
			
			for(int column = 0; column < testArray.length; column++)
			{
				rowCount = rowCount + testArray[row][column];
			}	
	
			if(rowCount == 1)
			{
				celebRowCount = rowCount;
				columnTotal = 0;
				
				for(int increasingRow = 0; increasingRow < testArray.length; increasingRow++) 
				{
					columnTotal += testArray[increasingRow][row];	
				}
			}	
		}
		
		if(columnTotal == testArray.length && celebRowCount == 1)
		{
			String celebrity = "There is a celebrity";
			return celebrity;
		}
		else
		{
			String notFamous = "There is not a celebrity";
			return notFamous;
		}
}
	
	public static void modifyEmailList(String emailList, String outputEmailList)
	{
		try
        {
            FileReader emailReader = new FileReader(emailList);
            Scanner input = new Scanner(emailReader);

            while (input.hasNextLine())
            {
                String line = input.nextLine();
                String[] words = line.split(" ");
                StringBuilder stringBuilder = new StringBuilder(line);
                int numberOfConcatenations = 1;
                
                for (int count = 0; count < numberOfConcatenations; count++)
                {	
                		stringBuilder.append(line);
                }

                System.out.print(line + " ");
            }
            
            emailReader.close();
        }
        catch (IOException exception)
        {
            System.out.println("Some problem occurred with the file!!!");
        }
		
	}

	public static void main(String[] args) {
		
		modifyEmailList("emailtest.txt", "outputEmailList.txt");
		
		
		Major cmsc = new ComputerScience();
		Student johnnyDepp = new Student("Johnny Depp", cmsc);
		Student jonathanSteinkruger = new Student("Jonathan Steinkruger", cmsc);
		
		CGPcourse computerScience =  new CGPcourse("CMSC", 175, 4,"Ankeny");
		CGPcourse math = new CGPcourse("MATH", 365, 4, "West Des Moines");
		CGPcourse constitutionalLaw = new CGPcourse("Constitutional Law", 250, 4, "Ankeny");
		CGPcourse biochemistry = new CGPcourse("CHEM", 359, 4, "West Des Moines");
		CGPcourse biology = new CGPcourse("BIOL", 300, 4, "Ankeny");
		CGPcourse nutrition = new CGPcourse("Nutrition", 370, 4, "West Des Moines");
		
		Course discrete = new Course("CMSC", 175, 4);
		Course dMathematics = new Course("CMSC", 175, 4);
		Course dataStructures = new Course("CMSC", 155, 4);
		Course introToProgram = new Course("CMSC", 150, 4);
		Course biochem = new Course("CHEM", 365, 4);
		
		//a.
		/*johnnyDepp.addCourse(discrete);
		johnnyDepp.addCourse(dMathematics);
		System.out.println(johnnyDepp);
		
		
		//b.
		johnnyDepp.addCourse(discrete);
		johnnyDepp.addCourse(computerScience);
		System.out.println(johnnyDepp);*/
		

		//Scenario 1: Adding graduate courses and normal courses
		/*jonathanSteinkruger.addCourse(computerScience);
		jonathanSteinkruger.addCourse(math);
		jonathanSteinkruger.addCourse(biology);
		jonathanSteinkruger.addCourse(dataStructures);
		jonathanSteinkruger.dropCourse(dataStructures);
		System.out.println(jonathanSteinkruger);*/
		
		
		int [] [] testArray1 = {{1,1,1,0}, {0, 1, 1,0}, {0,0,1,0}, {1,0,1,1}};
		int [] [] testArray2 = {{}};
		int [] [] testArray3 = {{1,1,1}, {1,1,1}, {1,1,1}};
		int [] [] testArray4 = {{1}};
		int [] [] testArray5 = {{0,0}, {0,0}};
		int [][] testArray6 = {{1,0,1,1,1}, {0,0,0,1,0}, {1,1,1,1,0}, {1,1,0,1,0},{1,0,1,1,0}};
		
		
		/*System.out.println(recognizingACelebrity(testArray1));
		//System.out.println(recognizingACelebrity(testArray2));
		System.out.println(recognizingACelebrity(testArray3));
		System.out.println(recognizingACelebrity(testArray4));
		System.out.println(recognizingACelebrity(testArray5));
		//System.out.println(recognizingACelebrity(testArray6));*/
		
		
	}

}

