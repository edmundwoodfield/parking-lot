package com.example.parkinglot;

import java.text.ParseException;
import java.util.ArrayList;

//The parking lot receives the duration of the stay (Day, Hour, Minute) and calculates the fee based on the rules contained in the parking lot
//        1.  $2 per hour
//        2.  Always round up (even 1 minute rounds up to the next hour!)
//        3.  Maximum charge per day is $15.  (ie, if you are there for 10 hours you are billed $15, not $20)
//        4.  On the first day, if you leave within half an hour of arriving there is no charge
public class ParkingLot {
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
            else fee += (2 * hour);
            return fee;

        }
        else fee += (2 * hour);

        if (minute> 0) {
            fee += 2 ;
        }

        return fee;

    }








}

