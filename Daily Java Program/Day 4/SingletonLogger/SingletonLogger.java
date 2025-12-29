package SingletonLogger;

public class SingletonLogger {
	// private instance variable
	private static SingletonLogger instance;
	private static final String PREFIX = "[APP]";
	
	// private constructor
	private SingletonLogger() {
//		System.out.println("Singleton object created");
	}
	
	// public static mehtod lazy initialization
	public static SingletonLogger getInstance(){
		if(instance == null) {
			instance = new SingletonLogger();
		}
		return instance;
	}
	
	public void log(String msg) {
		System.out.println(PREFIX + msg);
	}
}
