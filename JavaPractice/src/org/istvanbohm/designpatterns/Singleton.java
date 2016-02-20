package org.istvanbohm.designpatterns;


// Singleton
class Logger {
	private static final Logger instance = new Logger();
	
	public static Logger getInstance() {
		return instance;
	}
	
	private Logger() {
		
	}
	
	public void log(String msg) {
		System.out.println(System.currentTimeMillis() + " : " + msg);
	}
}

// Lazy loading / deferred singleton
class LazyLogger {
	private static LazyLogger instance = null;
	
	// We should make getInstance() thread safe
	public synchronized static LazyLogger getInstance() {
		if(instance==null) instance = new LazyLogger();
		return instance;
	}
	
	private LazyLogger() {
		
	}
	
	public void log(String msg) {
		System.out.println(System.currentTimeMillis() + " : " + msg);
	}
	
}





public class Singleton {

	public static void main(String[] args) {
		Logger mylogger = Logger.getInstance();
		mylogger.log("hello world!!!");
	}

}
