package day10.practice;

public class InvalidEmailException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8105491977357554060L;

	// Calling each super constructors for each of the types
	public InvalidEmailException(String msg) {
		super(msg);
	}

	public InvalidEmailException(Throwable te) {
		super(te);
	}

	public InvalidEmailException(String msg, Throwable te) {
		super(msg, te);
	}
}
