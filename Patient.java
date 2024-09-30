
public class Patient {

	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zipcode;
	private String phoneNumber;
	private String emergencyName;
	private String emergencyContact;
	
	public void setFirstName(String fName)
	{
		firstName = fName;
	}
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setMiddleName(String mName)
	{
		middleName = mName;
	}
	public String getMiddleName()
	{
		return middleName;
	}

	public void setLastName(String lName)
	{
		lastName = lName;
	}
	public String getLastName()
	{
		return lastName;
	}
	
	public String buildFullName()
	{
		return (firstName + " " + middleName + " " + lastName);
	}
	
	public void setAddress(String add)
	{
		address = add;
	}
	public String getAddress()
	{
		return address;
	}
	
	public void setCity(String add)
	{
		city = add;
	}
	public String getCity()
	{
		return city;
	}
	
	public void setState(String add)
	{
		state = add;
	}
	public String getState()
	{
		return state;
	}
	
	public void setZipCode(int zip)
	{
		zipcode = zip;
	}
	public int getZipCode()
	{
		return zipcode;
	}
	
	public String buildAddress()
	{
		return (address + " " + city + " " + state + " " + zipcode);
	}
	
	public void setPhoneNumber(String number)
	{
		phoneNumber = number;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setEmergencyName(String name)
	{
		emergencyName = name;
	}
	public String getEmergencyName()
	{
		return emergencyName;
	}
	
	public void setEmergencyContact(String number)
	{
		emergencyContact = number;
	}
	public String getEmergencyContact()
	{
		return emergencyContact;
	}
	
	public String buildEmergencyContact()
	{
		return (emergencyName + " " + emergencyContact);
	}
	
	public String toString(char name, char info)
	{
		
		if(info == 'y')
		{
			return ("Address: " + buildAddress() + "\n" + "Emergency Contact: " + buildEmergencyContact());
		}
		else
		{
			return ("Name: " + buildFullName());
		}
		
	}
	
	Patient()
	{
		
	}
	
	
	public Patient(String fname, String mName, String lName)
	{
		setFirstName(fname);
		getFirstName();
		setMiddleName(mName);
		getMiddleName();
		setLastName(lName);
		getLastName();
		buildFullName();
		
	}
	
	public Patient (String add, String town, String state, int zip, String name ,String contact)
	{
		setAddress(add);
		getAddress();
		setCity(town);
		getCity();
		setState(state);
		getState();
		setZipCode(zip);
		getZipCode();
		setEmergencyName(name);
		getEmergencyName();
		setEmergencyContact(contact);
		getEmergencyContact();
		buildAddress();
		buildEmergencyContact();
		
		
	}
	
	
}
