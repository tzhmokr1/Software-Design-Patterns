import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		
		CustomerList list1 = new CustomerListProxyImpl();
		Company company1 = new Company("Bauwaren Heinz", "Sägestraße 12, München", list1);
		
		System.out.println("Firmenname: " + company1.getName());
		
		list1 = company1.getListOfCustomers();
		
		List<Customer> cusList = list1.getCustomerList();
		for(Customer customer : cusList) {
			System.out.println(customer);
		}

		
	}
}
