
public abstract class Logistics {
	
	//Definition der Factory Method
	protected abstract Transport transportFactory(String transportType);
	
	public Transport manageTransportForCustomer(String transportType) {
		//Delegation an die Subklasse (Erzeugung des konkreten Objekts)
		Transport transport = transportFactory(transportType);
		
		transport.collectProductsFromCustomer();
		transport.transportProducts();
		
		return transport;
		
		
	}	
}

