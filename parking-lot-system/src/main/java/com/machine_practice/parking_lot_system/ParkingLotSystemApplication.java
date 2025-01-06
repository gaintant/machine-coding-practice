package com.machine_practice.parking_lot_system;

import com.machine_practice.parking_lot_system.cars.Sedan;
import com.machine_practice.parking_lot_system.cars.Truck;
import com.machine_practice.parking_lot_system.cars.VechicleType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class ParkingLotSystemApplication {

	public static void main(String[] args) {
		ParkingLot parkingLot = new ParkingLot();

		Floor floor1 = new Floor();
		Floor floor2 = new Floor();

		parkingLot.getFloors().put(floor1.getFloorID(), floor1);
		parkingLot.getFloors().put(floor2.getFloorID(), floor2);

		Customer customer1 = new Customer("cust1", new Truck());
		Customer customer2 = new Customer("cust2", new Sedan());

		EntryGate entryGate = new EntryGate();
		entryGate.setParkingLot(parkingLot);
		floor1.addSpot(VechicleType.CAR, new ParkingSpot());

		floor1.addSpot(VechicleType.CAR, new ParkingSpot());
		floor1.addSpot(VechicleType.CAR, new ParkingSpot());
		floor1.addSpot(VechicleType.CAR, new ParkingSpot());
		floor1.addSpot(VechicleType.TRUCK, new ParkingSpot());

		entryGate.entry(customer1);
		entryGate.entry(customer2);

		entryGate.entry(customer2);
		entryGate.entry(customer2);

//		SpringApplication.run(ParkingLotSystemApplication.class, args);
	}

}
