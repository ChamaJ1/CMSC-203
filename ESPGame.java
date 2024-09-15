/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: Make a game where the user has to guess a color randomly selected from a list
 * Due: 09/16/24
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Chama jagodige
*/

import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class ESPGame {

	
	
	public static void main(String []args) throws FileNotFoundException
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter File Name: ");
		
		String fileName = input.nextLine();
		Random rand = new Random();
		String guess;
		String color = "";
		int rndNum; 
		int round = 1; //keeps track of rounds
		int correctGuess = 0; //keeps track of correct guesses
		//created boolean to make while loop run, while loop will end if loss = true
	
		
		File colorFile = new File(fileName);//input file creation
		Scanner espColor = new Scanner(colorFile);
		System.out.println("These are the 16 colors");

		while(round < 4)//ends the game after 3 rounds
		{
			while(espColor.hasNextLine())//prints all 16 colors from the file
			{
				System.out.println(espColor.nextLine());
			}
			rndNum = rand.nextInt(16) + 1;
			
			switch(rndNum)//assigns random number to a color
			{
			case 1: color = "black";
			break;
			case 2: color = "white";
			break;
			case 3: color = "gray";
			break;
			case 4: color = "silver";
			break;
			case 5: color = "maroon";
			break;
			case 6: color = "red";
			break;
			case 7: color = "purple";
			break;
			case 8: color = "fuchsia";
			break;
			case 9: color = "green";
			break;
			case 10: color = "lime";
			break;
			case 11: color = "olive";
			break;
			case 12: color = "yellow";
			break;
			case 13: color = "navy";
			break;
			case 14: color = "blue";
			break;
			case 15: color = "teal";
			break;
			case 16: color = "aqua";
			break;
			}
			System.out.println("Round " + round);
			System.out.println();
			System.out.println("I am thinking of a color.");
			System.out.println("Enter your guess: ");
			guess = input.nextLine();
			
			if(guess.equals(color))//runs if the user gets the guess right
			{
				round++;
				correctGuess++;
				System.out.println("Correct");
				System.out.println("I was thinking of " + color);
				System.out.println();
			}
			else //runs if the user is incorrect
			{
				round++;
				System.out.println("Incorrect");
				System.out.println("I was thinking of " + color);
				System.out.println();
			}
			
		}
		
		System.out.println("Game Over");//prints after 3 rounds, game over text
		System.out.println("You guessed " + correctGuess + " out of 3 colors correctly");
		System.out.println();
		System.out.println("Name: Chama Jagodige");
		System.out.println("Due Date: 9/16/24");
		System.out.println("Student Description: I am a CMSC203 student with a major in Computer Science");



		
		
	}
}
