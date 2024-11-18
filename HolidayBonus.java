
public class HolidayBonus {

	public static double[] calculateHolidayBonus(double[][] data)
	{
		double [] bonuses = new double[data.length];
		double total;
		
		for(int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++) 
			{
				if (data[i][j] > 0)
				{
					if (data[i][j] == TwoDimRaggedArrayUtility.getHighestInColumn(data, j))
							{
								bonuses[i] += 5000;
							}
					else if(data[i][j] == TwoDimRaggedArrayUtility.getLowestInColumn(data, j))
							{
								bonuses[i] += 1000;
							}
					else
					{
						bonuses[i] += 2000;
					}
					
				}
			}
		}
		return bonuses;
	}
	
	public static double calculateTotalHolidayBonus(double [][] data)
	{
		double [] bonuses = new double[data.length];
		double total = 0;
		
		for(int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++) 
			{
				if (data[i][j] > 0)
				{
					if (data[i][j] == TwoDimRaggedArrayUtility.getHighestInColumn(data, j))
							{
								bonuses[i] += 5000;
							}
					else if(data[i][j] == TwoDimRaggedArrayUtility.getLowestInColumn(data, j))
							{
								bonuses[i] += 1000;
							}
					else
					{
						bonuses[i] += 2000;
					}
					
				}
			}
			
	}
		for (int i = 0; i < bonuses.length; i++)
		{
			total += bonuses[i];
		}
		return total;
		
		
}
}