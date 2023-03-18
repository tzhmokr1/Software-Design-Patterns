
public class BasicSingleton {
	
	private static final BasicSingleton instance = new BasicSingleton();
	
	private BasicSingleton() {
		System.out.println("Das BasicSingleton Objekt wurde erstellt!");
	}
	
	public static BasicSingleton getInstance() {
		return instance;
	}
}
