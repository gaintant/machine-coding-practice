package com.machine_practice.parking_lot_system;

import com.machine_practice.parking_lot_system.cars.VechicleType;
import lombok.Getter;

import java.util.*;

@Getter
public class ParkingLot {
    Map<String, Floor> floors = new HashMap<>();

    public ParkingSpot getAvaliableSpot(VechicleType vechicleType) {
        ParkingSpot parkingSpot = floors.values().stream()
                .flatMap(floor -> Optional.ofNullable(floor.getParkingSpotMap().get(vechicleType))
                        .map(Map::values)
                        .orElse(Collections.emptyList())
                        .stream())
                .filter(ps -> !ps.getBooked() )
                .findFirst()
                .orElseThrow();
        parkingSpot.setBooked(true);
        return parkingSpot;
    }
}
