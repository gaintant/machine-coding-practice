package com.flipkart.machine.ride_sharing_application;

import java.util.Comparator;
import java.util.List;

public interface SelectionStatergy {
    VechicleDetails selectVechicle(List<VechicleDetails> vechicleDetails);
}

class MostVacant implements SelectionStatergy{

    @Override
    public VechicleDetails selectVechicle(List<VechicleDetails> vechicleDetails) {

        return vechicleDetails.stream().max(Comparator.comparingInt(VechicleDetails::getAvaliableSeat))
                .orElseThrow();
    }
}

class SelectiveCar implements SelectionStatergy{

    String carModel;

    public SelectiveCar(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public VechicleDetails selectVechicle(List<VechicleDetails> vechicleDetails) {

        return vechicleDetails.stream().filter(v -> v.getModelName().equals(carModel)).findFirst()
                .orElseThrow();
    }
}