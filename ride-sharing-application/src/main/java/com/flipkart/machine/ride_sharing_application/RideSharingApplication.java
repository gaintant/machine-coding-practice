package com.flipkart.machine.ride_sharing_application;

import com.flipkart.machine.ride_sharing_application.enums.Gender;

//@SpringBootApplication
public class RideSharingApplication {

	public static void main(String[] args) {
//		SpringApplication.run(RideSharingApplication.class, args);
		UserService userService = new UserService();
		userService.addUser(new UserDetails("me", Gender.Male, 12));

		userService.addVechicle("me",
				new VechicleDetails("wb01a000", "boleno"));
		userService.addVechicle("me",
				new VechicleDetails("wb01a001", "swift"));

		userService.addVechicle("me",
				new VechicleDetails("wb01a002", "nano"));


		userService.offerRide( new RideDetails("me", "wb01a000", "kol", "mumbai", 1));
		userService.offerRide( new RideDetails("me", "wb01a001", "kol", "mumbai", 3));
		userService.offerRide( new RideDetails("me", "wb01a002", "kol", "mumbai", 5));


		System.out.println(userService.selectRide(new HitckDetails("you", "kol", "mumbai", 2)));
		System.out.println(userService.selectRide(new HitckDetails("you", "kol", "mumbai", 2, "swift")));

	}

}
