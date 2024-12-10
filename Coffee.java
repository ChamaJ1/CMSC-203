/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: Sets up coffee order process
 * Due: 12/9/24
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Chama Jagodige
*/
public class Coffee extends Beverage {
	
	static final double EXTRA_SHOT = .5; //constants to make it easier for me
	static final double EXTRA_SYRUP = .5;
	boolean extraShot; 
	boolean extraSyrup;
	
	Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) //constructors
	{
		super(bevName, Type.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	
	public boolean getExtraSyrup() //determine if this is true or not
	{
		return extraSyrup;
	}
	@Override
	public double calcPrice() //adjust price for extra shot or syrup
	{
		double price = addSizePrice();

		if(this.extraShot)
		{
			price += EXTRA_SHOT;
		}
		if(getExtraSyrup() == true)
		{
			price += EXTRA_SYRUP;
		}
		System.out.println(price);
		
		return price;
	}
	
	@Override
	public String toString() //to strink
	{
		System.out.println(this.bevName + ", " + this.size + "," + this.extraShot + ", " + this.extraSyrup + ", " + this.calcPrice());
		return (bevName + ", " + this.size + ", " + this.extraShot + ", " + this.extraSyrup + ", " + this.calcPrice());
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
