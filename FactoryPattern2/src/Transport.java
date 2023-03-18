
public abstract class Transport {
	private String customerName;
	private String destination;
	//...
	
	public void collectProductsFromCustomer() {
		System.out.println("Die Produkte vom Kunden wurden abgeholt.");
	}
	
	public abstract void transportProducts();
}
