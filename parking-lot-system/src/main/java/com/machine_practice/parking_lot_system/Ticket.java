package com.machine_practice.parking_lot_system;

import lombok.ToString;

import java.sql.Timestamp;
import java.time.LocalDateTime;


public class Ticket {
    Customer customer;

    ParkingSpot parkingSpot;

    LocalDateTime entryTime;

    boolean paid;

    @Override
    public String toString() {
        return "Ticket{" +
                "paid=" + paid +
                ", entryTime=" + entryTime +
                ", parkingSpot=" + parkingSpot +
                '}';
    }

    public Ticket(Customer customer, ParkingSpot parkingSpot) {
        this.customer = customer;
        this.parkingSpot = parkingSpot;
        this.entryTime = LocalDateTime.now();
        this.paid = false;
    }
}
