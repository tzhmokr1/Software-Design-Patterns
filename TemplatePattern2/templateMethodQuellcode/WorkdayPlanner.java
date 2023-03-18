
public abstract class WorkdayPlanner {
	
	public void createWorkdayPlan() {
		//Algorithmus
		wakeUp();
		takeShower();
		breakfast();
		if(!isHoliday()) {
			goToWork();
			work();
		}
		sleep();
	}
	
	public abstract void goToWork();
	public abstract void work();
	
	public boolean isHoliday() {
		return false;
	}
	
	public void wakeUp() {
		System.out.println("Aufwachen und ins Bad gehen...");
	}
	
	public void takeShower() {
		System.out.println("Duschen...");
	}
	
	public void breakfast() {
		System.out.println("Früchstücken...");
	}
	
	public void sleep() {
		System.out.println("Schlafen...");
	}
	
}
