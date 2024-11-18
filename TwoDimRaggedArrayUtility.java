import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	
	public static double[][] readFile(File file)
	{			
		double[][] raggedArray = new double[0][];

		try {
			Scanner rowReader = new Scanner(file);
			int rows = 0;
			
		
			while(rowReader.hasNextLine())
			{
				rows++;
				rowReader.nextLine();
			}
			rowReader.close();
			
			String nextLine;
			
			rowReader = new Scanner(file);
			raggedArray = new double[rows][];
			
			Scanner columnReader = new Scanner(file);
			for(int i = 0; i < raggedArray.length; i++)
			{
				String[] numbers; //string to temporarily hold the numbers
				nextLine = rowReader.nextLine();
				numbers = nextLine.split(" "); //get the individual numbers
				
				raggedArray[i] = new double[numbers.length];
				
				for (int j = 0; j < numbers.length; j++) {
					raggedArray[i][j] = Double.parseDouble(numbers[j]); //put the double numbers into the 2D array
				}
				
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return raggedArray;


		}
	
	public static void writeToFile(double [][] data, File outputFile)
	{
		try {
			FileWriter fileWriter = new FileWriter(outputFile);
			
			for (int i = 0; i < data.length; i++) {
				for(int j = 0; j < data[i].length; j++) {
					fileWriter.write(data[i][j] + " ");
				}
				
				fileWriter.write('\n');
			}
			
			fileWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	{
		
	}

	public static double getTotal(double[][] data)
	{
		double total = 0;
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; j++)
			{
				total += data[i][j];
			}
		}
		return total;
	}
	
	public static double getAverage(double [][] data)
	{
		double total = 0;
		int count = 0;
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; j++)
			{
				count++;
				total += data[i][j];
			}
		}
		return (total / count);
	}
	
	public static double getRowTotal(double[][] data, int row)
	{
		double total = 0;
		
		for(int i = 0; i < data[row].length; i++)
		{
			total += data[row][i];
		}
		return total;
	}
	
	public static double getColumnTotal(double[][] data, int column)
	{
		double total = 0;
		
		for(int i = 0; i < data.length; i++)
		{
			if ( column < data[i].length) {
				total += data[i][column];
			}
		}
		return total;
	}
	
	public static double getHighestInRow(double [][] data, int row)
	{
		double highestValue = data[row][0];
		for(int i = 0; i < data[row].length; i++)
		{
			if (data[row][i] > highestValue)
			{
				highestValue = data[row][i];
			}
		}
		return highestValue;
	}
	
	public static double getHighestInRowIndex(double [][] data, int row)
	{
		double highestValue = data[row][0];
		int highestIndex = 0;
		for(int i = 0; i < data[row].length; i++)
		{
			if (data[row][i] > highestValue)
			{
				highestValue = data[row][i];
				highestIndex = i;
			}
		}
		return highestIndex;
	}
	
	public static double getLowestInRow(double [][] data, int row)
	{
		double lowestValue = data[row][0];
		
		for(int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] < lowestValue)
			{
				lowestValue = data[row][i];
			}
		}
		return lowestValue;
	}
	
	public static double getLowestInRowIndex(double [][] data, int row)
	{
		double lowestValue = data[row][0];
		double lowestIndex = 0;
		
		for(int i = 0; i < data[row].length; i++)
		{
			if(data[row][i] < lowestValue)
			{
				lowestValue = data[row][i];
				lowestIndex = i;
			}
		}
		return lowestIndex;
	}
	
	public static double getHighestInColumn(double [][] data, int col)
	{
		double highestValue = data[0][col];
		
		for(int i = 0; i < data.length; i++)
		{
			if ( col < data[i].length) {
				
				if(data[i][col] > highestValue)
				{
					highestValue = data[i][col];
				}
			}
		}
		return highestValue;
	}
	public static double getHighestInColumnIndex(double[][] data, int col)
	{
		double highestValue = data[0][col];
		double highestIndex = 0;
		
		for(int i = 0; i < data.length; i++)
		{
			if ( col < data[i].length) {
				
				if(data[i][col] > highestValue)
				{
					highestValue = data[i][col];
					highestIndex = i;
				}
			}
		}
		return highestIndex;
	}
	
	public static double getLowestInColumn(double[][] data, int col)
	{
		double lowestValue = data[0][col];
		
		for(int i = 0; i < data.length; i++)
		{
			if ( col < data[i].length)
			{
				if(data[i][col] < lowestValue)
				{
					lowestValue = data[i][col];
				}
			}
		}
		return lowestValue;
	}
	
	public static double getLowestInColumnIndex(double[][] data, int col)
	{
		double lowestValue = data[0][col];
		int lowestIndex = 0;
		
		for(int i = 0; i < data.length; i++)
		{
			if ( col < data[i].length)
			{
				if(data[i][col] < lowestValue)
				{
					lowestValue = data[i][col];
					lowestIndex = i;
				}
			}
		}
		return lowestIndex;
	}
	
	public static double getHighestInArray(double[][] data)
	{
		double highestValue = data[0][0];
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; i++)
			{
				if(data[i][j] > highestValue)
				{
					highestValue = data[i][j];
				}
			}
		}
		return highestValue;
	}
	
	public static double getLowestInArray(double[][] data)
	{
		double lowestValue = data[0][0];
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; i++)
			{
				if(data[i][j] < lowestValue)
				{
					lowestValue = data[i][j];
				}
			}
		}
		return lowestValue;
	}

}
