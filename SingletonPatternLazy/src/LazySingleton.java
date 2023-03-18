
public class LazySingleton {
	private static LazySingleton instance;
	
	private LazySingleton() {
		System.out.println("Das LazySingleton Objekt wurde erstellt!");
	}
	
	public static LazySingleton getInstance() {
		if(instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
