package com.fssa.veeblooms.validator;

import com.fssa.veeblooms.ErrorMessages;

import java.util.List;

import com.fssa.veeblooms.CustomException;
import com.fssa.veeblooms.Plant;
import com.fssa.veeblooms.Enum.HybridEnum;

public class PlantValidator {

    public  boolean validate(Plant plant) throws CustomException {
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

    public static void validatePlantName(String plantName) throws CustomException {
        if (plantName == null || plantName.trim().isEmpty()) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_NAME);
        }
        if (plantName.length() < 3) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_NAME_LENGTH);
        }
    }

    public void validatePlantImagesUrl(List<String> plantImagesUrl) throws CustomException {
        if (plantImagesUrl == null || plantImagesUrl.isEmpty()) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_PLANTIMAGESURL);
        }
    }

    public void validatePrice(double price) throws CustomException {
        if (price < 0) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_PRICE);
        }
    }

    public void validateRating(int rating) throws CustomException {
        if (rating < 0) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_RATING);
        }
    }

    public void validatePlantType(String plantType) throws CustomException {
        if (plantType == null || plantType.trim().isEmpty()) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_TYPE);
        }
    }

    public void validatePlantHeight(float plantHeight) throws CustomException {
        if (plantHeight <= 0) {
            throw new CustomException(ErrorMessages.INVALID_PLANT_HEIGHT);
        }
    }

    public void validatePlantingSeason(String plantingSeason) throws CustomException {
        if (plantingSeason == null || plantingSeason.trim().isEmpty()) {
            throw new CustomException(ErrorMessages.INVALID_PLANTING_SEASON);
        }
    }

    public void validateHybrid(HybridEnum hybrid) throws CustomException {
        if (hybrid == null) {
            throw new CustomException(ErrorMessages.INVALID_HYBRID);
        }
    }
}
