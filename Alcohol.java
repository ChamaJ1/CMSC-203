/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: Sets up alchohol order process
 * Due: 12/9/24
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Chama Jagodige
*/
public class Alcohol extends Beverage{
	boolean isWeekend;
	static final double WEEKEND_PRICE = .60; //constant variable to keep it simmple

	public Alcohol(String bevName, Size size, boolean isWeekend) //constructor
	{
		super(bevName, Type.ALCOHOL, size);
		this.isWeekend = isWeekend;
	}

	@Override
	public double calcPrice() { //calculators the price of coffee
		double price = addSizePrice();
		if(this.isWeekend == true)
		{
			price += WEEKEND_PRICE;
		}
		
		return price;
	}
	
	public boolean isWeekend() { //determines if its the weekend
		return isWeekend;
	}
	public void setIsWeekend(boolean i) {
		isWeekend = i;
	}
	
	@Override
	public String toString()
	{
		String description = getBevName() + ", " + getSize();
		
		if(isWeekend) 
		{
			description += " Weekend";
		}
		description += ", $" + calcPrice();
		return description;
	}
	
	@Override
	public boolean equals(Object anotherBev)
	{
		if(super.equals(anotherBev) && isWeekend == this.isWeekend()) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
