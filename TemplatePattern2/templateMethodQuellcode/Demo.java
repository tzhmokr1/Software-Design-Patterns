
public class Demo {

	public static void main(String[] args) {
		
		WorkdayPlanner managerDay = new ManagerWorkday();
		managerDay.createWorkdayPlan();
		
		System.out.println();
		
		WorkdayPlanner policeOfficerDay = new PoliceOfficerWorkday();
		policeOfficerDay.createWorkdayPlan();
		
		
	}

}
