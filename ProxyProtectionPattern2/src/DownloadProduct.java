
public class DownloadProduct implements Downloadable {
	private String productName;
	
	public DownloadProduct(String productName) {
		this.productName = productName;
	}

	@Override
	public void download(Customer customer) {
		System.out.println(customer.getName() + " hat das Produkt " + productName + " erfolgreich heruntergeladen.");
	}
	
}
