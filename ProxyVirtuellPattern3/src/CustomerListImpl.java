import java.util.ArrayList;
import java.util.List;

public class CustomerListImpl implements CustomerList {

	@Override
	public List<Customer> getCustomerList() {
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer("Franz Schweiger", "Kohlstraße 20, München", true));
		customerList.add(new Customer("Alice Theodor", "Sonnenstraße 20, München", false));
		customerList.add(new Customer("Thaddeus Schweiger", "Plantenstraße 12, München", true));
		customerList.add(new Customer("Franziska Bauer", "Alpenweg 33, Hamburg", true));
		customerList.add(new Customer("Elias Dotzler", "Frankfurterstraße 11, München", true));
		System.out.println("Datenbankabfrage wurde durchgeführt!");
		return customerList;
	}
	
}
