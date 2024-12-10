/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: Sets up prices, types and size of each drink
 * Due: 12/9/24
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Chama Jagodige
*/
public abstract class Beverage {
	protected static final double BASE_PRICE = 2.0;
    protected static final double SIZE_PRICE = .5;

	String bevName;
	Type type;
	Size size;
	
	public Type getType() //returns what type of drink it is
	{
		return type;
	}
	public void setBevName(String name) //sets the name of the drink
	{
		bevName = name;
	}
	public String getBevName() //getter for name
	{
		return bevName;
	}
	
	public Size getSize() //getter for size
	{
		return this.size;
	}
	
	public double getBasePrice() //returns base price
	{
		return BASE_PRICE;
	}
	
	public double addSizePrice() //adjusts the price based on the size
	{
		double adjustedPrice = BASE_PRICE;
		if(size == Size.MEDIUM)
		{
			adjustedPrice = BASE_PRICE + SIZE_PRICE;
		}
		
		if(size == Size.LARGE)
		{
			adjustedPrice = BASE_PRICE + (2*SIZE_PRICE);
		}
		else
		{
			return adjustedPrice;
		}
		
		return adjustedPrice;
	}
	
	public abstract double calcPrice(); //abstract method that will get implemenented in other classes
	
	public Beverage(String bevName, Type type, Size size)//constructor
	{
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}
	@Override
	public String toString()
	{
		return (bevName + ", " + size);
	}
	
	@Override
	public boolean equals(Object anotherBev)
	{
		if(this == anotherBev)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
	