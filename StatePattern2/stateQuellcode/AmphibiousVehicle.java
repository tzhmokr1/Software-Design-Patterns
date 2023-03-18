
public class AmphibiousVehicle {
	private CarState car;
	private BoatState boat;
	
	private State currentState;
	
	public AmphibiousVehicle() {
		car = new CarState(this);
		boat = new BoatState(this);
		
		currentState = car;
	}
	
	public void prepareForWater() {
		this.currentState = boat;
		System.out.println("Das Fahrzeug wurde für das Wasser vorbereitet...");
	}
	
	public void prepareForLand() {
		this.currentState = car;
		System.out.println("Das Fahrzeug wurde für das Land vorbereitet....");
	}
	
	public void accelerate() {
		currentState.accelerate();
	}
	
	public void getSlower( ) {
		currentState.getSlower();
	}
	
}
