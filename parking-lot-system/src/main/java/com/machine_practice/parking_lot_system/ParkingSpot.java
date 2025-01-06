package com.machine_practice.parking_lot_system;

import com.machine_practice.parking_lot_system.cars.VechicleType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

//@Builder
@Getter
@Setter
@ToString
public class ParkingSpot {
    Boolean booked;
    String spotID;
    String floorID;

    public ParkingSpot(){
        this.booked = false;
        this.spotID = UUID.randomUUID().toString();
    }
}
