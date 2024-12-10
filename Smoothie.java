/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: Sets up smoothie order process
 * Due: 12/9/24
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Chama Jagodige
*/

public class Smoothie extends Beverage {
	

	static final double PROTEIN_PRICE = 1.5; //constants to make it easier
	static final double FRUIT_PRICE = .5;
	int numOfFruits;
	boolean addProtein;
	
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) //constructor
	{
		super(bevName, Type.SMOOTHIE, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}
	
	@Override
	public double calcPrice() //adjust the price to account for each fruit and the protien
	{
		double price = addSizePrice();
		if(addProtein)
		{
			price += PROTEIN_PRICE;
		}
		price += (FRUIT_PRICE * numOfFruits);
		
		return price;
	}
	
	public int getNumOfFruits() //get the number of rruits
	{
		return numOfFruits;
	}
	@Override
	public String toString() //to string method
	{
		return super.toString() + ", fruits=" + numOfFruits + ", addProtein=" + addProtein + ", price=" + calcPrice();
	}
	
	@Override
	public boolean equals(Object anotherBev)
	{
		if (this == anotherBev)
			return true;
		if (!super.equals(anotherBev))
			return false;
		if (getClass() != anotherBev.getClass())
			return false;
		Smoothie other = (Smoothie) anotherBev;
		return addProtein == other.addProtein && numOfFruits == other.numOfFruits;
	}
}