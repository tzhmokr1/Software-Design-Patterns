
public class Route {
	private String name;
	private int timeInMinutes;
	private int distanceInMeter;
	
	public Route(String name, int timeInMinutes, int distanceInMeter) {
		this.name = name;
		this.timeInMinutes = timeInMinutes;
		this.distanceInMeter = distanceInMeter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTimeInMinutes() {
		return timeInMinutes;
	}

	public void setTimeInMinutes(int timeInMinutes) {
		this.timeInMinutes = timeInMinutes;
	}

	public int getDistanceInMeter() {
		return distanceInMeter;
	}

	public void setDistanceInMeter(int distanceInMeter) {
		this.distanceInMeter = distanceInMeter;
	}
	
	@Override
	public String toString() {
		return name + ": Zeit = " + timeInMinutes + ", Distanz = " + distanceInMeter;
	}
}
