package com.fssa.veeblooms;

public class CustomException extends Exception {
public CustomException(String msg) {
	super(msg);
}
public CustomException(Throwable te) {
	super(te);
}

public CustomException(String msg, Throwable te) {
	 
	super(msg, te);
}

}


