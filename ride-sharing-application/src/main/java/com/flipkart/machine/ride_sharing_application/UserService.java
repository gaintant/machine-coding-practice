package com.flipkart.machine.ride_sharing_application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserService {
    Map<String, UserDetails> userDetailsList = new HashMap<>();
    Map<String, Map<String, List<VechicleDetails>>> rideMapper = new HashMap<>();
    public void addUser(UserDetails userDetails){
        userDetailsList.put(userDetails.getName(), userDetails);
    }

    public void addVechicle(String userName, VechicleDetails vechicleDetails){
        UserDetails userDetails = userDetailsList.get(userName);
        userDetails.getVechicleDetails().put(vechicleDetails.getRegistrationNo(), vechicleDetails);
        userDetailsList.put(userName, userDetails);
    }


    public void offerRide(RideDetails rideDetails) {
        UserDetails userDetails = userDetailsList.get(rideDetails.getUser());
        VechicleDetails vechicleDetails = userDetails.getVechicleDetails()
                .get(rideDetails.getVechicleNo());
        vechicleDetails.setAvaliableSeat(rideDetails.getAvaiableSeat());
        rideMapper.putIfAbsent(rideDetails.getSource(), new HashMap<>());
        Map<String, List<VechicleDetails>> sourceMapper = rideMapper.get(rideDetails.getSource());
        sourceMapper.putIfAbsent(rideDetails.getDestination(), new ArrayList<>());
        sourceMapper.get(rideDetails.getDestination()).add(vechicleDetails);
    }

    public VechicleDetails selectRide(HitckDetails hitckDetails) {
        List<VechicleDetails> vechicleDetails = rideMapper.get(hitckDetails.getSource())
                .get(hitckDetails.getDestination());
        vechicleDetails = vechicleDetails.stream()
                .filter(v -> v.getAvaliableSeat() >= hitckDetails.getSeatReq())
                .collect(Collectors.toList());
        return hitckDetails.selectionStatergy.selectVechicle(vechicleDetails);
    }
}
