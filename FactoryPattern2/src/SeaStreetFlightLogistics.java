
public class SeaStreetFlightLogistics extends Logistics {

	@Override
	protected Transport transportFactory(String transportType) {
		Transport transport = null;
		
		if(transportType.equals("sea")) {
			transport = new SeaTransport();
		}
		else if(transportType.equals("street")) {
			transport = new StreetTransport();
		}
		else if(transportType.equals("flight")) {
			transport = new FlightTransport();
		}
		else {
			System.out.println("Ungültiger Transport Typ");
		}
		
		return transport;
	}

}
