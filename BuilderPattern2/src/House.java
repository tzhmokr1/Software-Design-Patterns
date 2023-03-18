
public class House {
	private String basement; //Keller 
	private String material; //Material
	private String kitchen; //Küche
	private String roof; //Dach
	
	public void setBasement(String basement) {
		this.basement = basement;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}
	public void setRoof(String roof) {
		this.roof = roof;
	}
	
	@Override
	public String toString() {
		return "Keller: " + basement + "\nMaterial: " + material + "\nKüche: " + kitchen + "\nDach: " + roof;
	}
	
	
}
