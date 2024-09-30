
public class Procedure {

	private String procedure;
	private String dateOfProcedure;
	private String practitioner;
	private double charges;
	
	public void setProcedure(String procedureName)
	{
		procedure = procedureName;
	}
	public String getProcedure()
	{
		return procedure;
	}
	
	public void setDateOfProcedure(String date)
	{
		dateOfProcedure = date;
	}
	public String getDateOfProcedure()
	{
		return dateOfProcedure;
	}
	
	public void setPractitioner(String name)
	{
		practitioner = name;
	}
	public String getPractitioner()
	{
		return practitioner;
	}
	
	public void setCharges(double amount)
	{
		charges = amount;
	}
	public double getCharges()
	{
		return charges;
	}
	
	public String toString(char name, char info)
	{
		if(info == 'y')
		{
			return ("Practitioner: " + practitioner + "\n" + "Charges: " + charges);
		}
		else
		{
			return("Procedure: " + procedure + "\n" + "Procedure Date: " + dateOfProcedure);
		}
	}
	
	Procedure()
	{
		
	}
	
	Procedure(String name, String date)
	{
		setProcedure(name);
		getProcedure();
		setDateOfProcedure(date);
		getDateOfProcedure();
	}
	
	Procedure(String pract, double amount )
	{
		setPractitioner(pract);
		getPractitioner();
		setCharges(amount);
		getCharges();
	}
	
	
	
	
	
}
