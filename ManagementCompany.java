public class ManagementCompany {
	private String name;
	private String taxID;
	private double managementFeePercentage;
	final int MAX_PROPERTY = 5;
	private Property[] properties;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private Plot plot;
	private int numberofProperties;
	
	//constructor
	public ManagementCompany() {
		name = "";
		taxID = "";
		managementFeePercentage = 0;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
		numberofProperties = 0;
	}
	
	public ManagementCompany(String companyName, String id, double fee) {
		name = companyName;
		taxID = id;
		managementFeePercentage = fee;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
		numberofProperties = 0;
	}
	
	public ManagementCompany(String companyName, String id, double fee, int x, int y, int width, int depth) {
		name = companyName;
		taxID = id;
		managementFeePercentage = fee;
		plot = new Plot(x, y, width, depth);
		properties = new Property[MAX_PROPERTY];
		numberofProperties = 0;
	}
	
	public ManagementCompany(ManagementCompany company) {
		name = company.name;
		taxID = company.taxID;
		managementFeePercentage = company.managementFeePercentage;
		plot = company.plot;
		properties = company.properties;
		numberofProperties = company.numberofProperties;
	}
	 
	 //getter and setter methods
	 public double getManagementFeePercentage() {
	        return managementFeePercentage;
	    }
	 public void setManagementFeePercentage(double percentage)
	 {
		 managementFeePercentage = percentage;
	 }
	 public void setPlot(int x, int y, int width, int depth) {
			plot = new Plot(x, y, width, depth);
		}
		
		public Plot getPlot() {
			return plot;
		}
	 public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    public void setTaxId(String tax) {
	        this.taxID = tax;
	    }
	    
	    public String getTaxId() {
	        return taxID;
	    }
	    
	    //add property method
	    public int addProperty(Property property) {
			if(numberofProperties == MAX_PROPERTY) {
				return -1;
			}
			
			if(property == null) {
				return -2;
			}
			
			if(!plot.encompasses(property.getPlot())) {
				return -3;
			}
			
			for(int i = 0; i < numberofProperties; i++) {
				if(property.getPlot().overlaps(properties[i].getPlot())) {
					return -4;
				}
			}
			
			Property prop = new Property(property);
			
			properties[numberofProperties] = prop;
			numberofProperties++;
			
			return numberofProperties-1;
			
		}
	    
	    //getTotalRent method
	    public double getTotalRent() {
			double total = 0;
			
			for(int i = 0; i < numberofProperties; i++) {
				total += properties[i].getRentAmount();
			}
			
			return total;
		}
	    
	    //getHighestRentProperty
	    public Property getHighestRentProperty() {
	        Property highestRent = properties[0];
	        for (int i = 1; i < numberofProperties; i++) {
	            if (properties[i].getRentAmount() > highestRent.getRentAmount()) {
	                highestRent = properties[i];
	            }
	        }
	        return highestRent;
	    }
	    //removeLastProperty Method
	    public void removeLastProperty() {
	        
	            properties[numberofProperties - 1] = null;
	            numberofProperties--;
	    }
	    
	    //isPropertiesFull method
	    public boolean isPropertiesFull() {
	    	if(numberofProperties >= MAX_PROPERTY)
	    	{
	    		return true;
	    	}
	    	else
	    	{
	    		return false;
	    	}


	    }
	    
	    //getPropertiesCount methd
	    public int getPropertiesCount() 
	    {
	        return numberofProperties;
	    }
	    
	    //isManagmentFeeValid Method
	    public boolean isManagementFeeValid(double fee) 
	    {
	    	if(fee >= 0 && fee <=100)
	    	{
	    		return true;
	    	}
	    	else
	    	{
	    		return false;
	    	}
	    }
	    
	    //toStringMethod
	    public String toString() {
	    	String listOfProperties = "";
	        for (int i = 0; i < MAX_PROPERTY; i++) {
	          if (properties[i]==null) {
	            break;
	          } 
	          listOfProperties += properties[i] + "\n"; 
	        }
	        return "List of the properties for " + name + ", taxID: " + taxID
	            + "\n______________________________________________________\n"
	            + listOfProperties +  "______________________________________________________\n\n"
	            + " total management Fee: " + (getTotalRent() * managementFeePercentage / 100);
	    }
	    

}