
public class ManagerWorkday extends WorkdayPlanner {

	@Override
	public void goToWork() {
		System.out.println("Ins Bürogebäude gehen...");
	}

	@Override
	public void work() {
		System.out.println("Quartalsbereichte prüfen und Umsatz prüfen...");
	}
	
	@Override
	public boolean isHoliday() {
		return true;
	}

}
