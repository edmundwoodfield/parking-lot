package com.example.parkinglot;

import java.text.ParseException;
import java.util.ArrayList;

public class ParkingLotDailyParking implements IParkingLot{
    private int day;
    private int hour;
    private int minute;

    //    public ParkingLot(Ticket ticket) {
//        this.ticket = ticket;
//    }
    private Ticket ticket = new Ticket();

    public void assignDuration(String dateEntry, String timeEntry, String dateExit, String timeExit) throws ParseException {

        ArrayList<Integer> arrayList =ticket.findDifference(dateEntry,timeEntry,dateExit,timeExit);
        day = arrayList.get(0);
        hour = arrayList.get(1);
        minute =arrayList.get(2);
    }


    public int generateFee(){

        int fee = 0 ;

        if ( day== 0 && hour ==0  && minute <30 ) {
            return fee;
        }


        if (day >=1) {
            fee += (15 * day);
        }
        if (hour > 7){
            fee += 15;
            return fee;
        }
        else if (hour == 7 ) {
            if (minute> 0) {
                fee += 15 ;
                return fee;
            }
            else fee += (3 * hour);
            return fee;

        }
        else fee += (3 * hour);

        if (minute> 0) {
            fee += 3 ;
        }

        return fee;

    }

}
