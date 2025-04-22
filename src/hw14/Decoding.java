package hw14;

public class Decoding {
	
	public static String loopThroughString(String text)
	{
		String secretMessage = "";
		
		if(text.length() > 0)
		{
			for(int i = 0; i < text.length(); i += 7)
			{
				char letter = (char) decodeText(text.substring(i, i + 7));
				secretMessage += letter;
			}
		}
		else
		{
			secretMessage = "There is no secret message here.";
		}
		
		return secretMessage;
	}
	public static int decodeText(String hiddenText)
	{
		String newMessage = "";
		String hiddenMessage = "";
		int decimalNumber = 0;
		
		for(int letter = 0; letter < 7; letter++)
		{
			hiddenMessage = hiddenText.substring(letter, letter + 1);
			
			if(hiddenMessage.equals("S")) 
			{
				newMessage += "1";
			}
			
			if(hiddenMessage.equals("C"))
			{
				newMessage += "0";
			}	
		}
		
		int position = 0;
		for(int i = newMessage.length(); i > 0; i--)
		{
			int number = Integer.parseInt(newMessage.substring(i-1, i));
			decimalNumber += (number * Math.pow(2, position));
			position++;
		}
		return decimalNumber;
	}

	public static void main(String[] args) {
		System.out.println(loopThroughString("SCCSCCC"));
		System.out.println(loopThroughString("SCCSCCCSSCSCCSCSCCCCCSCCCCSCSSCSSSSSSCCCSCCSCCCCS"));
		System.out.println(loopThroughString(""));
		System.out.print(loopThroughString("Hi Bob!"));
		System.out.println(loopThroughString("SCCSCCCSSCSCCSCSCCCCCSCCCCSCSSCSSSSSSCCCSCCSCCCCSSCCSCCCSSCSCCSCSCCCCCSCCCCSCSSCSSSSSSCCCSCCSCCCCS"));
	}
}
