
public class Channel {
	
	private String name;
	private double frequenzy;
	
	public Channel(String name, double frequenzy) {
		this.name = name;
		this.frequenzy = frequenzy;
	}
	
	@Override
	public String toString() {
		return "Du hörst gerade " + name + " (Frequenz: " + frequenzy + ")";
	}
}
