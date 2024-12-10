import java.util.Scanner;

/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: Class to test out every other class
 * Due: 12/9/24
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Chama Jagodige
*/


public class BevShopDriverApp {

    public static void main(String[] args) {
    	int tempAge, tempOrderNo;
    	int num = 0;
    	Scanner input = new Scanner(System.in);

		Customer tempCustomer;
		int anInvalidTime = 8, anotherInvalidTime = 24;

		BevShop bev = new BevShop();
		System.out.println("The current order in process can have at most " + bev.getMaxOrderForAlcohol() + " alcoholic drinks");
		System.out.println("Tue minimum age to order alcohol is " + bev.getMinAgeForAlcohol());
		System.out.println("Start a new order"); // Start a new order

		System.out.println("Would you please enter your name?"); 
		String name = input.nextLine();
		System.out.println("Would you please enter your age?");
		int age = input.nextInt();
		bev.startNewOrder(12, Day.MONDAY, name, age);
		
		System.out.println(bev.isValidAge(age)); // true
		if (bev.isValidAge(age)) {
			System.out.println("Your age is above 20 and you are eligible to order alcohol");
			
			while(bev.isEligibleForMore())
			{
				System.out.println("Add alcohol drink"); // Add alcohol drink
				System.out.println("Add drink name");
				String drinkName = input.next();
				System.out.println("Choose size(small, medium, large");
				String size = input.next();
				if(size.equals("small"))
				{
					bev.processAlcoholOrder(drinkName, Size.SMALL);
					
				}
				else if(size.equals("medium"))
				{
					bev.processAlcoholOrder(drinkName, Size.MEDIUM);
				}
				else if(size.equals("large"))
				{
					bev.processAlcoholOrder(drinkName, Size.LARGE);
				}
				
				System.out.println("Total on the Order:" + bev.getCurrentOrder().calcOrderTotal());
				System.out.println(bev.isEligibleForMore());
				num++;
				bev.setNumOfAlcohol(num);
				bev.getNumOfAlcoholDrink();
			}
		}
		else
		{
			System.out.println("Not of age to drink alcohol");
		}

		System.out.println("Add a COFFEE to order"); // Add a COFFEE to order
		System.out.println("Add drink name");
		String drinkName = input.next();
		System.out.println("Do you want an extra shot of coffee?(y/n)");
		String extraShot = input.next();
		boolean extraS = false;
		if(extraShot.equals("y"))
		{
			extraS = true;
		}
		else
		{
			extraS = false;
		}
		System.out.println("Do you want an extra syrup?(y/n)");
		String extraSyrup = input.next();
		boolean extraSyr = false;
		if(extraSyrup.equals("y"))
		{
			extraSyr = true;
		}
		else
		{
			extraSyr = false;
		}
		System.out.println("Choose size(small, medium, large");
		String size = input.next();
		if(size.equals("small"))
		{
			bev.processCoffeeOrder(drinkName, Size.SMALL, extraS, extraSyr);			
		}
		else if(size.equals("medium"))
		{
			bev.processCoffeeOrder(drinkName, Size.MEDIUM, extraS, extraSyr);		}
		else if(size.equals("large"))
		{
			bev.processCoffeeOrder(drinkName, Size.LARGE, extraS, extraSyr);		}
		

		System.out.println("Total on the Order:" + bev.getCurrentOrder().calcOrderTotal()); 
	
		size = "";
		System.out.println("Add a SMOOTHIE to order"); // Add a SMOOTHIE to order
		drinkName = input.next();
		System.out.println("How many fruits do you want?");
		int fruits = input.nextInt();
		while(fruits > bev.getMaxNumOfFruits())
		{
			System.out.println("Max fruits reached, put less fruits into the smoothie");
			fruits = input.nextInt();
		}
		System.out.println("Add protein?(y/n)");
		String protein = input.next();
		boolean addP = false;
		if(protein.equals("y"))
		{
			addP = true;
		}
		else
		{
			addP = false;
		}
		
		System.out.println("Choose size(small, medium, large)");
		size = input.next();
		
		if(size.equals("small"))
		{
			bev.processSmoothieOrder(drinkName, Size.SMALL, fruits, addP);		//two fruits for each order to make it simpler	
		}
		else if(size.equals("medium"))
		{
			bev.processSmoothieOrder(drinkName, Size.MEDIUM, fruits, addP);		
		}
		else if(size.equals("large"))
		{
			bev.processSmoothieOrder(drinkName, Size.LARGE, fruits, addP);		
		}
		
		System.out.println("Total on the Order:" + bev.getCurrentOrder().calcOrderTotal()); 
		System.out.println("Number of fruits: " + fruits);
		System.out.println("Student Name: Chamath jagodige");
		System.out.println("CRN: 23488");
		System.out.println("Due Date: 12/9/24");
		
		
		}
    
}

