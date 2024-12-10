import java.util.ArrayList;
import java.util.List;
/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: Class to implement order interface
 * Due: 12/9/24
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Chama Jagodige
*/


public class Order implements OrderInterface {
	private int orderNumber;
    private int orderTime;
    private Day orderDay;
    private Customer customer;
    private List<Beverage> beverages;
    
    public static int generateOrder() { //generate a order number
        return (int) (Math.random() * (90000 - 10000 + 1)) + 10000;
    }
    
    public int getOrderNo() //get the order number
    {
    	return this.orderNumber;
    }
    
    public int getOrderTime() //get the order time
    {
    	return orderTime;
    }
    
    public Day getOrderDay() //get the order day
    {
    	return orderDay;
    }
    
    public Customer getCustomer() //get the customer info
    {
    	return customer;
    }
    
    
    public Order(int orderTime, Day orderDay, Customer customer) { //constructor
        this.orderNumber = generateOrder();
        this.orderTime = orderTime;
        this.orderDay = orderDay;
        this.customer = customer; 
        this.beverages = new ArrayList<>();
    }
    
    public void Customer(Customer customer) { //create and intialize the customer object
		this.customer = new Customer(customer);
	}
	@Override
	public boolean isWeekend() { //determine if its the weekend
		// TODO Auto-generated method stub
		if(orderDay == Day.SATURDAY || orderDay == Day.SUNDAY)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public Beverage getBeverage(int itemNo) { //get beverages from a certain index
		// TODO Auto-generated method stub
    	return beverages.get(itemNo);

	}
	
	
    public int getTotalItems() //calculate the total items in an order
	{
        return beverages.size();
    }
    
    

	@Override
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) { //add a new beverage(coffee)
		// TODO Auto-generated method stub
		Coffee coffee = new Coffee(bevName, size, extraShot, extraSyrup);
        beverages.add(coffee);
		
	}

	@Override
	public void addNewBeverage(String bevName, Size size) { //add a new beverage(alcohol)
		Alcohol alcohol = new Alcohol(bevName, size, this.isWeekend());
        beverages.add(alcohol);
		
	}

	@Override
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) { //add a new beverage(smoothie)
		// TODO Auto-generated method stub
		Smoothie smoothie = new Smoothie(bevName, size, numOfFruits, addProtein);
        beverages.add(smoothie);
		
	}

	@Override
	public double calcOrderTotal() { //get the total for the order
		double total = 0.0;
        for (Beverage beverage : beverages) {
            total += beverage.calcPrice();
        }
        return total;
	}

	@Override
	public int findNumOfBeveType(Type type) { //find the number of certain beverages
		int count = 0;
        for (Beverage beverage : beverages) {
            if (beverage.getType() == type) {
                count++;
            }
        }
        return count;
	}
	
	@Override
	public String toString() {
	    
		return super.toString()+ "Order [beverage=" + beverages + ", customer=" + customer + ", day=" + orderDay + ", orderNum=" + orderNumber
				+ ", time=" + orderTime + ", orderTotal=" + calcOrderTotal() + "]";
	}
	
	
    public int compareTo(Order anotherOrder) {
    	if(((Order) anotherOrder).getOrderNo() == this.getOrderNo()) {
			return 0;
		}
		else if(((Order) anotherOrder).getOrderNo() < this.getOrderNo()) {
			return 1;
		}
		else {
			return -1;
		}
    }

	
}
