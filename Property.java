public class Property {
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	
	//constructors
	public Property(Property property) {
		propertyName = property.getPropertyName();
		city = property.getCity();
		rentAmount = property.getRentAmount();
		owner = property.getOwner();
		plot = property.getPlot();
	}
	
	public Property(String name, String town, double rent, String pOwner) {
		propertyName = name;
		city = town;
		rentAmount = rent;
		owner = pOwner;
	}
	
	public Property(String name, String town, double rent, String pOwner, int x, int y, int width, int depth) {
		propertyName = name;
		city = town;
		rentAmount = rent;
		owner = pOwner;
		plot = new Plot(x, y, width, depth);
	}
	
	//getter and setter methods
	public void setPropertyName(String name) {
		propertyName = name;
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public void setCity(String town) {
		city = town;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setRentAmount(double rent) {
		rentAmount = rent;
	}
	
	public double getRentAmount() {
		return rentAmount;
	}
	
	public void setOwner(String pOwner) {
		owner = pOwner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	
	public Plot getPlot() {
	    return plot;
	  }
	
	//toString method
	public String toString() {
		String propertyString;
		propertyString =  propertyName + "," + city + "," + owner + "," + rentAmount ;
		return propertyString;
	}
	
}