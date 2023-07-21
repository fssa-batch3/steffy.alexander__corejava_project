package day10.practice;


class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class EmailValidator {
    public static boolean isValidEmail(String emailId) throws InvalidEmailException {
       
        if (emailId.contains("@")) {
            return true;
        } else {
            throw new InvalidEmailException("Invalid email address: " + emailId);
        }
    }
}