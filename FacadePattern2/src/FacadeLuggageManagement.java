
public class FacadeLuggageManagement {
	
	private AirportSystem airport;
	private Airplane airplane;
	private LocalLogisticsCompany company;
	private Hotel hotel;
	
	public FacadeLuggageManagement() {
		this.airport = new AirportSystem();
		this.airplane = new Airplane();
		this.company = new LocalLogisticsCompany();
		this.hotel = new Hotel();
	}
	
	public void sendLuggage() {
		airport.checkLuggage();
		airport.transportToAirplane();
		airplane.putLuggageToPlane();
		airplane.takeLuggageOut();
		company.putLuggageToTruck();
		company.transportToHotel();
		hotel.transportLuggageToGuest();
	}
	
}
