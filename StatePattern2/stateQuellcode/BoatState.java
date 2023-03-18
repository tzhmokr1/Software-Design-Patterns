
public class BoatState extends State {
	
	private AmphibiousVehicle vehicle;
	
	public BoatState(AmphibiousVehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void accelerate() {
		System.out.println("Mithilfe des Motors und der Schiffsschraube schneller werden...");
	}

	@Override
	public void getSlower() {
		System.out.println("Schiffsschraube in andere Richtung laufen lassen...");
	}
	
	
}
