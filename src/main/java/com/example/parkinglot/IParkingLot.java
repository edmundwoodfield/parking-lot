package com.example.parkinglot;

import java.text.ParseException;

public interface IParkingLot {
    public void assignDuration(String dateEntry, String timeEntry, String dateExit, String timeExit) throws ParseException;
    public  int generateFee();

}
