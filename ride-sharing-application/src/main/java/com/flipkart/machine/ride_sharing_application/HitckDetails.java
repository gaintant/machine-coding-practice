package com.flipkart.machine.ride_sharing_application;

public class HitckDetails {
    String user;
    String source;

    String destination;

    int seatReq;

    public String getUser() {
        return user;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getSeatReq() {
        return seatReq;
    }

    public SelectionStatergy getSelectionStatergy() {
        return selectionStatergy;
    }

    SelectionStatergy selectionStatergy;
    public HitckDetails(String user, String source, String destination, int seatReq) {
        this.user = user;
        this.source = source;
        this.destination = destination;
        this.seatReq = seatReq;
        this.selectionStatergy = new MostVacant();
    }

    public HitckDetails(String user, String source, String destination, int seatReq, String carModel) {
        this.user = user;
        this.source = source;
        this.destination = destination;
        this.seatReq = seatReq;
        this.selectionStatergy = new SelectiveCar(carModel);
    }
}
