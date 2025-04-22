
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CountOccurrences
{
	public static void main(String[] args) throws FileNotFoundException
	{
		final String word1 = "CMSC";
		final String word2 = "155";

	    for (String filename : args)
	    {
	    		countOccurrencesInFile(filename, word1, word2);
	    }
	}

	private static void countOccurrencesInFile(String filename, String searchWord1, String searchWord2) throws FileNotFoundException
	{
		final FileReader reader = new FileReader(filename);
		final Scanner scanner = new Scanner(reader);
		int count = 0;

        while (scanner.hasNext())
        {
            String wordOne = scanner.next();
            
            if(wordOne.equals(searchWord1))
            {
            		String wordTwo = scanner.next();
            		
            		if(wordTwo.equals(searchWord2))
            		{
            			count++;
            		}
            }
        }

        System.out.println("File: " + filename + " Count = " + count);
        scanner.close();
    }
}

