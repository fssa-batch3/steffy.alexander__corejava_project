package com.fssa.veeblooms.validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fssa.veeblooms.CustomException;
import com.fssa.veeblooms.ErrorMessages;



class TestPlantValidator {
	 @Test
	    public void testValidatePlantName_ValidName() {
	        // Arrange
	        String validPlantName = "Sunflower";
	        TestPlantValidator validator = new TestPlantValidator();

	        // Act
	        try {
	        	PlantValidator.validatePlantName(validPlantName);
	        } catch (CustomException e) {
	            // Assert
	            Assertions.fail("Unexpected exception thrown for a valid plant name.");
	        }
	    }

	    @Test
	    public void testValidatePlantName_NullName() {
	        // Arrange
	        String nullPlantName = null;
	        TestPlantValidator validator = new TestPlantValidator();

	        // Act
	        CustomException exception = null;
	        try {
	        	PlantValidator.validatePlantName(nullPlantName);
	        } catch (CustomException e) {
	            exception = e;
	        }

	        // Assert
	        Assertions.assertNotNull(exception, "Expected CustomException for null plant name");
	        Assertions.assertEquals(ErrorMessages.INVALID_PLANT_NAME, exception.getMessage());
	    }

	    @Test
	    public void testValidatePlantName_EmptyName() {
	        // Arrange
	        String emptyPlantName = "";
	        TestPlantValidator validator = new TestPlantValidator();

	        // Act
	        CustomException exception = null;
	        try {
	            PlantValidator.validatePlantName(emptyPlantName);
	        } catch (CustomException e) {
	            exception = e;
	        }

	        // Assert
	        Assertions.assertNotNull(exception, "Expected CustomException for empty plant name");
	        Assertions.assertEquals(ErrorMessages.INVALID_PLANT_NAME, exception.getMessage());
	    }

	    @Test
	    public void testValidatePlantName_ShortName() {
	        // Arrange
	        String shortPlantName = "AB";
	        TestPlantValidator validator = new TestPlantValidator();

	        // Act
	        CustomException exception = null;
	        try {
	        	PlantValidator.validatePlantName(shortPlantName);
	        } catch (CustomException e) {
	            exception = e;
	        }

	        // Assert
	        Assertions.assertNotNull(exception, "Expected CustomException for short plant name");
	        Assertions.assertEquals(ErrorMessages.INVALID_PLANT_NAME_LENGTH, exception.getMessage());
	    }
}

//


 
