
public class Company {
	private String name;
	private String address;
	private CustomerList listOfCustomers;
	
	public Company(String name, String address, CustomerList listOfCustomers) {
		this.name = name;
		this.address = address;
		this.listOfCustomers = listOfCustomers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public CustomerList getListOfCustomers() {
		return listOfCustomers;
	}

	public void setListOfCustomers(CustomerList listOfCustomers) {
		this.listOfCustomers = listOfCustomers;
	}
	
	
}
