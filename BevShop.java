import java.util.ArrayList;
/*
 * Class: CMSC203 
 * Instructor: Huseyin Aygun
 * Description: Class designed to implement beverageShop interface
 * Due: 12/9/24
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Chama Jagodige
*/


public class BevShop implements BevShopInterface{

	private ArrayList<Order> orders;
	private int currentOrderIndex;
	private int numAlcohol;
	
	public BevShop() 
	{
		orders = new ArrayList<>(); //creates new orders array
	}

	@Override
	public boolean isValidTime(int time) {
		return (time >= MIN_TIME) && (time <= MAX_TIME); //checks if time is valid
	}

	@Override
	public int getMaxNumOfFruits() { //returns the max amount of fruits
		// TODO Auto-generated method stub
		return MAX_FRUIT;
	}

	@Override
	public int getMinAgeForAlcohol() { //returns the minimum age to drink alcohol
		// TODO Auto-generated method stub
		return MIN_AGE_FOR_ALCOHOL; 
	}

	@Override
	public boolean isMaxFruit(int numOfFruits) { //returns max number of fruits
		// TODO Auto-generated method stub
		return numOfFruits > MAX_FRUIT;
	}

	@Override
	public int getMaxOrderForAlcohol() { //returns max number of alcohol drinks per order
		// TODO Auto-generated method stub
		return MAX_ORDER_FOR_ALCOHOL;
	}

	@Override
	public boolean isEligibleForMore() { //determines if more alcohol can be bought
		// TODO Auto-generated method stub
		if(numAlcohol < MAX_ORDER_FOR_ALCOHOL)
		{
			return true;
		}
		return false;
	}
	
	public void setNumOfAlcohol(int num) //setter to get num of alcohol drinks
	{
		numAlcohol = num;
	}

	@Override
	public int getNumOfAlcoholDrink() { //getter
		// TODO Auto-generated method stub
		return numAlcohol;
	}

	@Override
	public boolean isValidAge(int age) { //checks if age is above or equal to minimum age
		// TODO Auto-generated method stub
		return age >= MIN_AGE_FOR_ALCOHOL;
	}

	@Override
	public void startNewOrder(int time, Day day, String customerName, int customerAge) { //new order process
		// TODO Auto-generated method stub
		Customer customer = new Customer(customerName, customerAge);
		Order order = new Order(time, day, customer);
		orders.add(order);
		currentOrderIndex = orders.indexOf(order);
		numAlcohol = 0;
		
	}

	@Override
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) { //make a new coffee order
		// TODO Auto-generated method stub
		orders.get(currentOrderIndex).addNewBeverage(bevName, size, extraShot, extraSyrup);
		
	}

	@Override
	public void processAlcoholOrder(String bevName, Size size) { //make a new alcohol order
		// TODO Auto-generated method stub
		orders.get(currentOrderIndex).addNewBeverage(bevName, size);
		
	}

	@Override
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) { //make a new smoothie order
		// TODO Auto-generated method stub
		orders.get(currentOrderIndex).addNewBeverage(bevName, size, numOfFruits, addProtein);
		
	}

	@Override
	public int findOrder(int orderNo) { //find a order in the array
		// TODO Auto-generated method stub
		for (int i= 0; i < orders.size(); i++) {
			if(orders.get(i).getOrderNo() == orderNo) {
				return i;
			}
		}
		return -1; //returns -1 if order isnt found
	}

	@Override
	public double totalOrderPrice(int orderNo) { //get the total order price
		// TODO Auto-generated method stub
		return orders.get(findOrder(orderNo)).calcOrderTotal();
	}

	@Override
	public double totalMonthlySale() { //get the monthly sale
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 0; i < orders.size(); i++) {
			sum += orders.get(i).calcOrderTotal();
		}
		return sum;
	}

	@Override
	public int totalNumOfMonthlyOrders() { //get number of orders in a month
		// TODO Auto-generated method stub
		return orders.size();
	}

	@Override
	public Order getCurrentOrder() { //get the order at the current index
		// TODO Auto-generated method stub
		return orders.get(currentOrderIndex);
	}

	@Override
	public Order getOrderAtIndex(int index) { //find any order
		// TODO Auto-generated method stub
		return orders.get(index);
	}

	@Override
	public void sortOrders() { //sort the orders
		// TODO Auto-generated method stub
		for(int i = 0; i<orders.size()-1; i++) {
			int minOrder = i;
			for (int j = i + 1; j < orders.size(); j++) {
				if(orders.get(j).getOrderNo() < orders.get(minOrder).getOrderNo()) {
					minOrder = j;
				}
			}
			Order swap = orders.get(minOrder);
			orders.set(minOrder, orders.get(i));
			orders.set(i, swap);
		}
	}
	
	public String toString() {
		String str = "BEV SHOP\nMINTHLY SALES:"+ totalMonthlySale() + "\n\n";
		for (int i = 0; i < orders.size(); i++) {
			str +="Order "+i+ "\n";
			str +=orders.get(i).toString();
		}
		return str;
	}
	

}
