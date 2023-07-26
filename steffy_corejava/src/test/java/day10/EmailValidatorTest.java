package day10;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

import day10.practice.EmailValidator;
import day10.practice.InvalidEmailException;

public class EmailValidatorTest {

    @Test 
    public void testIsValidEmail_ValidEmail() {
        String validEmail = "test@example.com";
        try {
            boolean result = EmailValidator.isValidEmail(validEmail);
            assertTrue(result);
        } catch (InvalidEmailException e) {
            // If a valid email throws an exception, the test should fail
        	
       assertEquals(e.getMessage(),"The email cannot be null");
        }
    }
    
    @Test
    public void testIsValidEmail_InvalidEmail() {
        String invalidEmail = "notanemail";
        try {
            boolean result = EmailValidator.isValidEmail(invalidEmail);
            assertFalse(result);
        } catch (InvalidEmailException e) {
            // If an invalid email throws the exception, the test should pass
            assertTrue(true);
        }
    }

    @Test
    public void testIsValidEmail_NullEmail() throws InvalidEmailException {
        String nullEmail = null;
        try {
        	 EmailValidator.isValidEmail(nullEmail);
        	
        }catch(InvalidEmailException e) {
        	 assertEquals(e.getMessage(),"The email cannot be null");
        	
        }
       
        
    }
}
