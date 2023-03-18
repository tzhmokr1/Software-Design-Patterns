import java.util.ArrayList;

public class Navigation {
	
	private ArrayList<Route> possibleRoutes;
	private RouteStrategy choosenStrategy;
	
	public Navigation(ArrayList<Route> possibleRoutes) {
		this.possibleRoutes = possibleRoutes;
	}
	
	public void chooseStrategy(RouteStrategy choosenStrategy) {
		this.choosenStrategy = choosenStrategy;
	}
	
	public void calculateRoute() {
		System.out.println("Die Route wird berechnet...");
		choosenStrategy.calculateRoute(possibleRoutes);
	}
	
}
