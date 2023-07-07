package day02.practice;


public class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void info (String msg) {
		System.out.println("INFO: " + msg);
	}
	
	public static void error (String msg) {
		System.out.println("ERROR: " + msg);
	}
	
	public static void debug (int num) {
		System.out.println("DEBUG: " + num);
	}
	public static void info (int num) {
		System.out.println("INFO: " + num);
	}
	
	public static void error (int num) {
		System.out.println("ERROR: " + num);
	}
	
	
public static void main(String[] args) {
	Logger logger = new Logger();
	logger.debug("o");   
	logger.info("helllo"); 
	logger.error("l"); 
	logger.debug(2);   
	logger.info(3); 
	logger.error(4);
	
	
}
}