
public class ThreadsafeSingleton {
	private static ThreadsafeSingleton instance;
	
	private ThreadsafeSingleton( ) {
		
	}
	
	/*
	public static synchronized ThreadsafeSingleton getInstance() {
		if(instance == null) {
			instance = new ThreadsafeSingleton();
		}
		return instance;
	}
	*/
	//double-checked logging
	public static ThreadsafeSingleton getInstance() {
		if(instance == null) {
			synchronized(ThreadsafeSingleton.class) {
				if(instance == null) {
					instance = new ThreadsafeSingleton();
				}
			}
		}
		return instance;
	}
	
}
