
public class MacBookAir implements MacBook {

	@Override
	public String getdescription() {
		return "MacBook Air \n Standard Ausstattung";
	}

	@Override
	public double getPrice() {
		return 799.99;
	}

	@Override
	public void increaseVolume() {
		System.out.println("Die Lautstärke des MacBook Air wurde erhöht!");
	}
	
	
	
}
