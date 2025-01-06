package com.machine_practice.parking_lot_system;

import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Setter
public class EntryGate {
    String gateNumber = UUID.randomUUID().toString();

    ParkingLot parkingLot;
    public void entry(Customer customer){
        ParkingSpot parkingSpot = parkingLot.getAvaliableSpot(customer.vehicle.getVechicleType());
        customer.setTicket(new Ticket(customer, parkingSpot));
    }
}
