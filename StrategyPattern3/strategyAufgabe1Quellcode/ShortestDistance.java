import java.util.ArrayList;

public class ShortestDistance implements RouteStrategy {
	
	@Override
	public void calculateRoute(ArrayList<Route> possibleRoutes) {
		//Algorithmus, der die Route mit der kürzesten Zeit ermittelt...
		Route choosenRoute = getRouteWithShortestDistance(possibleRoutes);
		System.out.println("Die Route wurde erfolgreich berechnet!");
		System.out.println(choosenRoute);
	}
	
	public Route getRouteWithShortestDistance(ArrayList<Route> possibleRoutes) {
		Route bestRoute = possibleRoutes.get(0);
		for(int i = 1; i < possibleRoutes.size(); i++) {
			if(bestRoute.getDistanceInMeter() > possibleRoutes.get(i).getDistanceInMeter()) {
				bestRoute = possibleRoutes.get(i);
			}
			
		}
		return bestRoute;
	}
	
}