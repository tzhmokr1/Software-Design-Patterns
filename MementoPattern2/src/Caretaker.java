import java.util.ArrayList;

public class Caretaker {
	private ArrayList<Memento> mementos;
	
	public Caretaker() {
		this.mementos = new ArrayList<Memento>();
	}
	
	public void saveState(FitnessPlan fitnessPlan) {
		mementos.add(fitnessPlan.save());
	}
	
	public void restoreState(FitnessPlan fitnessPlan, int index) {
		fitnessPlan.restore(mementos.get(index));
	}
}
