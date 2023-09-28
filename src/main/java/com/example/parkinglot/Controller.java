package com.example.parkinglot;

import java.text.ParseException;

// The controller has a constructor which receives the ParkingLot and ParkingLotView and sets up handlers
public class Controller {
    ParkingLot parkingLot;
    ParkingLotView parkingLotView;
   public Controller(ParkingLot parkingLot, ParkingLotView parkingLotView){
       this.parkingLot = parkingLot;
       this.parkingLotView = parkingLotView;
       setUpHandlers();
   }
private void setUpHandlers(){

       parkingLotView.calculateButton.setOnAction(e -> {

           try{
               String entryDate = parkingLotView.getEntryDate();
               String entryTime = parkingLotView.getEntryTime();
               String exitDate = parkingLotView.getExitDate();
               String exitTime = parkingLotView.getExitTime();
               parkingLot.assignDuration(entryDate,entryTime,exitDate,exitTime);
               int fee = parkingLot.generateFee();
               parkingLotView.setDisplayFee(String.valueOf(fee));
           }
           catch (IllegalArgumentException | ParseException dateParseFail){
               parkingLotView.setDisplayFee("Date/time values invalid");
           }
       });
}
}
