
public abstract class Regulator {
	private double currentVoltage; //Aktuelle Spannung
	private double currentCurrent; //Aktuellen Strom
	
	public abstract void increaseVoltage();

	public double getCurrentVoltage() {
		return currentVoltage;
	}

	public void setCurrentVoltage(double currentVoltage) {
		this.currentVoltage = currentVoltage;
	}

	public double getCurrentCurrent() {
		return currentCurrent;
	}

	public void setCurrentCurrent(double currentCurrent) {
		this.currentCurrent = currentCurrent;
	}
	
}
