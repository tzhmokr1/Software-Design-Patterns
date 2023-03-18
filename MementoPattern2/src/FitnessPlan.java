
public class FitnessPlan {
	private String typeOfTraining;
	
	public FitnessPlan(String typeOfTraining) {
		this.typeOfTraining = typeOfTraining;
	}
	
	public void changeTraining(String typeOfTraining) {
		this.typeOfTraining = typeOfTraining;
	}
	
	public Memento save() {
		System.out.println("Zustand erfolgreich gespeichert!");
		return new Memento(this.typeOfTraining);
	}
	
	public void restore(Memento memento) {
		this.typeOfTraining = memento.getState();
		System.out.println("Zustand wiederhergestellt");
	}
	
	@Override
	public String toString() {
		return "Trainingsart: " + typeOfTraining;
	}
	
}
