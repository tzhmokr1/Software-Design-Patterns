
public class MacBookPro implements MacBook {

	@Override
	public String getdescription() {
		return "MacBook Pro \n Standard Ausstattung";
	}

	@Override
	public double getPrice() {
		return 1199.99;
	}

	@Override
	public void increaseVolume() {
		System.out.println("Die Lautstärke des MacBook Pro´s wurde erhöht!");
	}
	
}
