package day10.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 


public class EmailExceptionDemo {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your email");
	String email=scan.nextLine();
	try {
		EmailValidator.isValidEmail(email);
	} catch (InvalidEmailException e) {
	
		e.printStackTrace();
	}
	
	}

}