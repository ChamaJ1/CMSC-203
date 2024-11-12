
public class CheckingAccount extends BankAccount
{
	static final double FEE = .15;
	
	public CheckingAccount(String name, double intialAmount)
	{
		super(name, intialAmount);
		this.accountNumber = accountNumber+ "-10";
	}
	
	public boolean withdraw(double withdrawalAmount)
	{
		double totalWithdraw = withdrawalAmount + FEE;
		boolean completed = true;

		if (totalWithdraw <= balance)
		{
			this.balance = balance - totalWithdraw;
		}
		else
		{
			completed = false;
		}
		return completed;
	}
	}
