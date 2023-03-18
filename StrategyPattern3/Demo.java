import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		Route route1 = new Route("Route 1", 18, 500);
		Route route2 = new Route("Route 2", 22, 2400);
		Route route3 = new Route("Route 3", 12, 1000);
		
		ArrayList<Route> routes = new ArrayList<Route>();
		routes.add(route1);
		routes.add(route2);
		routes.add(route3);
		
		Navigation navigationTest = new Navigation(routes);
		navigationTest.chooseStrategy(new ShortestDistance());
		navigationTest.calculateRoute();

		
	}

}
