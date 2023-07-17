package day05;
import org.junit.Test;

import day05.Details;
import day05.DetailsValidator;

import static org.junit.Assert.*;

public class DetailsValidatorTest {

    @Test
    public void testValidate_ValidDetails() {
        Details details = new Details();
        details.setDeptName("Engineering");
        details.setDeptId(123);

        try {
            boolean result = DetailsValidator.validate(details);
            assertTrue(result);
        } catch (IllegalArgumentException e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }


    @Test
    public void testValidatedeptName_NullName() {
        try {
            DetailsValidator.validatedeptName(null);
            fail("Expected IllegalArgumentException was not thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Department name cannot be null and it should have a length greater than 2", e.getMessage());
        }
    }

    @Test
    public void testValidatedeptName_EmptyName() {
        try {
            DetailsValidator.validatedeptName("");
            fail("Expected IllegalArgumentException was not thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Department name cannot be null and it should have a length greater than 2", e.getMessage());
        }
    }

    @Test
    public void testValidatedeptName_ShortName() {
        try {
            DetailsValidator.validatedeptName("IT");
            fail("Expected IllegalArgumentException was not thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Department name cannot be null and it should have a length greater than 2", e.getMessage());
        }
    }

    @Test
    public void testValidatedeptName_ValidName() {
        try {
            DetailsValidator.validatedeptName("Sales");
        } catch (IllegalArgumentException e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testValidatedeptId_NegativeId() {
        try {
            DetailsValidator.validatedeptId(-1);
            fail("Expected IllegalArgumentException was not thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Department ID should be a positive value", e.getMessage());
        }
    }

    @Test
    public void testValidatedeptId_ZeroId() {
        try {
            DetailsValidator.validatedeptId(0);
            fail("Expected IllegalArgumentException was not thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Department ID should be a positive value", e.getMessage());
        }
    }

    @Test
    public void testValidatedeptId_ValidId() {
        try {
            DetailsValidator.validatedeptId(123);
        } catch (IllegalArgumentException e) {
            fail("Unexpected exception thrown: " + e.getMessage());
        }
    }
}

