package com.machine_practice.parking_lot_system;

import com.machine_practice.parking_lot_system.cars.VechicleType;
import com.machine_practice.parking_lot_system.cars.Vehicle;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
public class Floor {
    Map<VechicleType, Map<String, ParkingSpot>> parkingSpotMap= new HashMap<>();

    public final String floorID = UUID.randomUUID().toString();
    public void addSpot(VechicleType vechicleType, ParkingSpot parkingSpot){
        parkingSpot.setFloorID(floorID);
        parkingSpotMap.putIfAbsent(vechicleType, new HashMap<>());
        parkingSpotMap.get(vechicleType)
                .put(parkingSpot.getSpotID(), parkingSpot);
    }
}
