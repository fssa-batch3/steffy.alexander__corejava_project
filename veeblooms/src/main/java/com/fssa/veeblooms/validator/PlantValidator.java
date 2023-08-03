package com.fssa.veeblooms.validator;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fssa.veeblooms.CustomException;
import com.fssa.veeblooms.ErrorMessages;
import com.fssa.veeblooms.Plant;
import com.fssa.veeblooms.Enum.HybridEnum;

public class PlantValidator {

    public static boolean validatePlant(Plant plant) throws CustomException {
        if (plant == null) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_NULL);
        }
        validatePlantName(plant.getPlantName());
        validatePlantImagesUrl(plant.getPlantImagesUrl());
        validatePrice(plant.getPrice());
        validateRating(plant.getRating());
        validatePlantType(plant.getPlantType());
        validatePlantHeight(plant.getPlantHeight());
        validatePlantingSeason(plant.getPlantingSeason());
        validateHybrid(plant.getHybrid());
        return true; 
    } 

    public static boolean validatePlantName(String plantName) throws CustomException {
        if (plantName == null || plantName.trim().isEmpty()) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_NAME);
        }
        if (plantName.length() < 3) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_NAME_LENGTH);
        }
        String regexPattern = "^[^0-9]*$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(plantName);
        boolean isMatch = matcher.matches();

        if (!isMatch) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_NAME_PATTERN);
        }
        return true;
    }

    public static boolean validatePlantImagesUrl(List<String> plantImagesUrl) throws CustomException {
        if (plantImagesUrl == null || plantImagesUrl.isEmpty()) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_PLANTIMAGESURL);
        }

        for (String imageUrl : plantImagesUrl) {
            if (imageUrl == null || imageUrl.trim().isEmpty()) {
                throw new CustomException(ErrorMessages.INVALID_PLANT_INVALIDPLANTIMAGESURL);
            }
        }

        return true;
    }

    public static boolean validatePrice(double price) throws CustomException {
        if (price <= 0) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_PRICE);
        }
        return true;
    }

    public static boolean validateRating(int rating) throws CustomException {
        if (rating < 0) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_RATING);
        }
        return true;
    }

    public static boolean validatePlantType(String plantType) throws CustomException {
        if (plantType == null || plantType.trim().isEmpty()) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_TYPE);
        }
        if (plantType.length() < 3) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_TYPE);
        }
        String regexPattern = "^[^0-9]*$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(plantType);
        boolean isMatch = matcher.matches();

        if (!isMatch) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_NAME_PATTERN);
        }
        return true;
    }

    public static boolean validatePlantHeight(float plantHeight) throws CustomException {
        if (plantHeight <= 0) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_HEIGHT);
        }
        return true;
    }

    public static boolean validatePlantingSeason(String plantingSeason) throws CustomException {
        if (plantingSeason == null || plantingSeason.trim().isEmpty()) {
            throw new CustomException(ErrorMessages.INVALID_PLANTING_SEASON);
        }
        if (plantingSeason.length() < 5) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_NAME_LENGTH);
        }
        String regexPattern = "^[^0-9]*$";
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(plantingSeason);
        boolean isMatch = matcher.matches();

        if (!isMatch) {
            throw new CustomException(ErrorMessages.INVALID_PLANTING_SEASON);
        }
        return true;
    }

    public static boolean validateHybrid(HybridEnum hybrid) throws CustomException {
        if (hybrid == null) {
            throw new CustomException(ErrorMessages.INVALID_HYBRID);
        }
        return true;
    }
}
