/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: Sets up customer info for the order
 * Due: 12/9/24
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Chama Jagodige
*/
public class Customer {

	private int age;
	private String name;
	
	public void setAge(int customerAge) //set the age of the customer
	{
		this.age = customerAge;
	}
	public int getAge() //get the age of the customer
	{
		return age;
	}
	
	public void setName(String customerName) //set the name of the cusomter
	{
		this.name = customerName;
	}
	
	public String getName() //get the name of the customer
	{
		return name;
	}
	public Customer(String name, int age) //constructor
	{
		this.name = name;
		this.age = age;
	}
	
	public Customer(Customer c) { //copy constructor 
        this.name = c.name;
        this.age = c.age;
    }
	
	@Override
	public String toString()
	{
		return(name + ", " + age);
		
	}
}
