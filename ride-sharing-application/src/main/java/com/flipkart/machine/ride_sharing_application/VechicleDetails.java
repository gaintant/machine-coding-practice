package com.flipkart.machine.ride_sharing_application;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class VechicleDetails {
    String registrationNo;

    String modelName;

    int avaliableSeat;

    public VechicleDetails(String registrationNo, String modelName) {
        this.registrationNo = registrationNo;
        this.modelName = modelName;
        this.avaliableSeat = 0;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    @Override
    public String toString() {
        return "VechicleDetails{" +
                "registrationNo='" + registrationNo + '\'' +
                ", modelName='" + modelName + '\'' +
                ", avaliableSeat=" + avaliableSeat +
                '}';
    }

    public void setAvaliableSeat(int avaliableSeat) {
        this.avaliableSeat = avaliableSeat;
    }

    public int getAvaliableSeat() {
        return avaliableSeat;
    }

    public String getModelName() {
        return modelName;
    }


}
