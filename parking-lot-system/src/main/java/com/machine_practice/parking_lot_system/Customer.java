package com.machine_practice.parking_lot_system;

import com.machine_practice.parking_lot_system.cars.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    String name;
    Vehicle vehicle;
    Ticket ticket;

    public Customer(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

}
