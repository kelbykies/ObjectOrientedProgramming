import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class competitionProblem {
	

		public static boolean determiningPrimeNumber(int i)
		{
				if(i < 2) return false;
				if(i == 2 || i==3) return true;
				if(i % 2 == 0 || i % 3 == 0) return false;
				
				int sqrtN = (int) Math.sqrt(i) + 1;
				for(int m = 6; m <= sqrtN; m += 6)
				{
					if(i % (m-1) == 0 || i % (m + 1) == 0) return false;
				}
				return true;
		}
		
		private static boolean circulate(int i) 
		{
			boolean circulateDetermination = false;
			String number = "" + i;
			int stringLength = number.length();
			List<Integer> circlePrimeList = new ArrayList<>();
			
			circlePrimeList.add(i);
			if(stringLength == 1)
			{
				boolean singleDigit = determiningPrimeNumber(i);
				if(singleDigit == true)
				{
					circulateDetermination = true;
				}
			}
			else
			{
				for(int j = 0; j <= stringLength - 1; j++)
				{ 
					String newNumber = "";
					newNumber += number.substring(1, stringLength) + number.substring(0, 1);
					int integer = Integer.parseInt(newNumber);
					
					boolean circlePrime = determiningPrimeNumber(integer);
					if(circlePrime == true)
					{
						circlePrimeList.add(i);
					}
					else
					{
						circulateDetermination = false;
					}
					
					if(circlePrimeList.size() == number.length())
					{
						circulateDetermination = true;
					}	
				}
			}
			
			return circulateDetermination;
		}
		
		public static List<Integer> determiningCircularPrime(int x, int y)
		{
			boolean prime;
			boolean circularPrime;
			List<Integer> circularArray = new ArrayList<>();
			
			for(int startingElement = x; startingElement < y; startingElement++)
			{
				prime = determiningPrimeNumber(startingElement);
			
				if(prime == true)
				{
					circularPrime = circulate(startingElement);
					if(circularPrime == true)
					{
						circularArray.add(startingElement);
					}
				}
			}
			return circularArray;
			
		}
		
		public static void main(String[] args)
		{
			/*List<Integer> array1 = determiningCircularPrime(5, 50);
			
			for(int position : array1)
			{
				System.out.println(position);
			}*/
			
			/*List<Integer> array2 = determiningCircularPrime(50, 1000);
			
			for(int position : array2)
			{
				System.out.println(position);
			}*/
			
			/*List<Integer> array3 = determiningCircularPrime(0, 10);
			
			for(int position : array3)
			{
				System.out.println(position);
			}*/
			
			List<Integer> array4 = determiningCircularPrime(100, 5000);
			
			for(int position : array4)
			{
				System.out.println(position);
			}
			
			//Should be true
			/*System.out.println(circulate(197));
			System.out.println(circulate(971));
			System.out.println(circulate(719));
			System.out.println(circulate(5));
			System.out.println(circulate(13));
			System.out.println(circulate(17));
			
			//should be false
			System.out.println(circulate(4));
			System.out.println(circulate(9));
			System.out.println(circulate(12));
			System.out.println(circulate(80));
			System.out.println(circulate(64));
			System.out.println(circulate(100));*/
		}
	}
