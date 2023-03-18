import java.util.ArrayList;

public class ShortestTime implements RouteStrategy {

	@Override
	public void calculateRoute(ArrayList<Route> possibleRoutes) {
		//Algorithmus, der die Route mit der kürzesten Zeit ermittelt...
		Route choosenRoute = getRouteWithShortestTime(possibleRoutes);
		System.out.println("Die Route wurde erfolgreich berechnet!");
		System.out.println(choosenRoute);
	}
	
	public Route getRouteWithShortestTime(ArrayList<Route> possibleRoutes) {
		Route bestRoute = possibleRoutes.get(0);
		for(int i = 1; i < possibleRoutes.size(); i++) {
			if(bestRoute.getTimeInMinutes() > possibleRoutes.get(i).getTimeInMinutes()) {
				bestRoute = possibleRoutes.get(i);
			}
			
		}
		return bestRoute;
	}
	
}
