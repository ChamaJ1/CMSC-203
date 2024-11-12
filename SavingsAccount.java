
public class SavingsAccount extends BankAccount
{
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double intialAmount)
	{
		super(name, intialAmount);
		this.savingsNumber = savingsNumber;
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest()
	{
		double interest = super.getBalance() * (rate / 12); //monthly interest
		super.deposit(interest);
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	//copy constructor
	public SavingsAccount(SavingsAccount account, double initialBalance )
	{
		super(account, initialBalance);
		
		this.savingsNumber = account.savingsNumber + 1; //one more than original savings number
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;

	}
	

}
