package day10.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {
	
		if (emailId == null) {
			throw new InvalidEmailException("The email cannot be null");
		} 

//		String emailId = "suryafreshworks.com";

		// Below is a Regex by RFC standard RFC 5322
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailId);
//		Boolean isMatch = matcher.matches();
		Boolean isMatch = Pattern.matches(regex, emailId);

		if (!isMatch) {
			throw new InvalidEmailException("The email is invalid");
		}

		return true;

	}
}