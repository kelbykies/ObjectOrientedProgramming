package hw14;

import java.util.ArrayList;
import java.util.List;

public class Debugging {

	  private static List<int[]> findHighTemperatures(int[][] temperature, 
		      int temperatureLimit)
		  {
			List<int[]> highTemperatures = new ArrayList<>();
				
			for (int row = 0; row < temperature.length; row++)
			{
				for (int col = 0; col < temperature[row].length; col++)
				{
					int[] highTemperature = new int[3];
					if (temperature[row][col] > temperatureLimit)
					{
						highTemperature[0] = row + 1;
						highTemperature[1] = col + 1;
						highTemperature[2] = temperature[row][col];
							
						highTemperatures.add(highTemperature);		
					}
				}
			}
			return highTemperatures;
		   }

	public static void main(String[] args) {
		
		int[][] temperatures = {{105, 99, 97, 88}, {20, 50}, {90, 100, 120, 115, 98}};
		int[][] temps = {{1516, 17,3 }, { }, {29, 2798,125}};
		int[][] weather = {{-14, -20, 5}, {-3, 50}, {15, -10, -17}};
		int[][] nothing = {{}, {}, {}};
		int[][] duplicates = {{199, 199, 199}, {20, 20}, {100, 100, 100}};
		
		for(int[] array : findHighTemperatures(temperatures, 100))
		{
			for(int element : array)
			{
				System.out.print(element + " ");
			}
		}
	}

}
