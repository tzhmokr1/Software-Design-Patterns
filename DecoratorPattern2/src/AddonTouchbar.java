
public class AddonTouchbar extends MacBookAddon {

	public AddonTouchbar(MacBook macBook) {
		super(macBook);
	}

	@Override
	public String getdescription() {
		return macBook.getdescription() + ", zusätzlich mit touchbar";
	}

	@Override
	public double getPrice() {
		return macBook.getPrice() + 400.00;
	}

	@Override
	public void increaseVolume() {
		System.out.println("Die Lautstärke des MacBooks wurde über die Touchbar erhöht!");
	}
	
	
	
}
