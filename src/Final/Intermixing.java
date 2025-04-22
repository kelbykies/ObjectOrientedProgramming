package Final;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Intermixing {

	public static void intermixFiles(String file1, String file2, String file3)
	{
		List<String> array1 = new ArrayList<String>();
		List<String> array2 = new ArrayList<String>();
		
		  try
	        {
	            FileReader reader1 = new FileReader(file1);
	            FileReader reader2 = new FileReader(file2);
	            Scanner input1 = new Scanner(reader1);
	            Scanner input2 = new Scanner(reader2);
	            PrintWriter outputFile = new PrintWriter(file3);
		    		
	            while (input1.hasNextLine())
	            {
	                String line = input1.nextLine();
	                array1.add(line);
	            }
	            
	            while (input2.hasNextLine())
	            {
	                String text = input2.nextLine();
	                array2.add(text);
	            }
	            
	            int smallerList = Integer.min(array1.size(), array2.size());
    				List<String> longerList = array1;
    		
		    		if(array1.size() == smallerList)
		    		{
		    			longerList = array2;	
		    		}
	            
	            for(int position = 0; position < smallerList; position++)
	    			{
	    				outputFile.println(array1.get(position));
	    				outputFile.println(array2.get(position));
	    			}
	           
	    			for(int count = smallerList; count < (longerList.size()); count++)
	    			{
	    				outputFile.println(longerList.get(count));
	    			}
	    			
	            reader1.close();
	            reader2.close();
	            input1.close();
	            input2.close();
	            outputFile.close();
	        }
		  
	        catch (IOException exception)
	        {
	            System.out.println("Some problem occurred with the file!!!");
	        }
	}
	
	
	public static void main(String[] args) {	
		//Same Length
		//intermixFiles("Intermix1", "Intermix2", "IntermixedFile");
		
		//First File is shorter
		//intermixFiles("shortFile", "longFile", "IntermixedFile");
		//Second File is shorter
		intermixFiles("longFile", "shortFile", "IntermixedFile");
	
		//Files with itself
		//intermixFiles("Intermix1", "Intermix1", "IntermixedFile");
		
		//Third file is the same as one of the first two files
		//intermixFiles("Intermix1", "Intermix2", "IntermixedFile");
		
		//One or both files empty
		//intermixFiles("nothing", "nothing", "IntermixedFile");
		//intermixFiles("nothing", "Intermix2", "IntermixedFile");
		
		//Files dont exist
		//intermixFiles("firstFile", "secondFile", "IntermixedFile");
	}
}
