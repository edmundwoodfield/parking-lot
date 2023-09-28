package com.example.parkinglot;

public class ParkingLotFactory {
    public IParkingLot createParkingLot(String parkingType) {
        switch (parkingType) {
            case "Daily parking":
                return new ParkingLotDailyParking();

            default:
                return new ParkingLot();




        }

    }
}
