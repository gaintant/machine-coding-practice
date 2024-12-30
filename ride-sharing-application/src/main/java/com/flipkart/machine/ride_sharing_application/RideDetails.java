package com.flipkart.machine.ride_sharing_application;

public class RideDetails {
    String user;

    String vechicleNo;

    String source;

    public RideDetails(String user, String vechicleNo, String source, String destination, int avaiableSeat) {
        this.user = user;
        this.vechicleNo = vechicleNo;
        this.source = source;
        this.destination = destination;
        this.avaiableSeat = avaiableSeat;
    }

    public int getAvaiableSeat() {
        return avaiableSeat;
    }

    String destination;

    int avaiableSeat;
    public String getUser() {
        return user;
    }

    public String getVechicleNo() {
        return vechicleNo;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public RideDetails(String user, String vechicleNo, String source, String destination) {
        this.user = user;
        this.vechicleNo = vechicleNo;
        this.source = source;
        this.destination = destination;
    }
}
