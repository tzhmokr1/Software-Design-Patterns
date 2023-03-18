
public class Demo {

	public static void main(String[] args) {
		
		Caretaker fitnessCaretaker = new Caretaker();
		
		FitnessPlan fitnessPlan = new FitnessPlan("Krafttraining");
		System.out.println(fitnessPlan);
		
		fitnessCaretaker.saveState(fitnessPlan);
		
		fitnessPlan.changeTraining("Ausdauertraining");
		System.out.println(fitnessPlan);
		
		fitnessCaretaker.saveState(fitnessPlan);
		
		fitnessPlan.changeTraining("Gemischtes Training");
		System.out.println(fitnessPlan);
		
		fitnessCaretaker.saveState(fitnessPlan);
		
		//Restore
		fitnessCaretaker.restoreState(fitnessPlan, 0);
		System.out.println(fitnessPlan);
		
		
	}

}
