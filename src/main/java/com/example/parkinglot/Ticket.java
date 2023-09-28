package com.example.parkinglot;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//The ticket receives an entry and exit datetime and calculates the duration of the stay in day, hour and minute
//We assume that a 'day' is a 24-hour period from arrival regardless of calendar days.
//We need to check that it handles leap years and daylight saving time.
//The input is expected to arrive as four strings of e.g. "28/09/2023" "09:56" "29/09/2023" "10:00"
public class Ticket {
    public ArrayList<Integer> findDifference(String dateEntry, String timeEntry, String dateExit, String timeExit) throws ParseException {
        String space = " ";
        String entry = dateEntry.concat(space).concat(timeEntry);
        String exit = dateExit.concat(space).concat(timeExit);

        // SimpleDateFormat converts the string format to date object
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        sdf.setLenient(false);

        ArrayList<Integer> ticketInfo = new ArrayList<>();


        // Try Block
//        try {
            // parse method is used to parse the text from a string to produce the date
            Date d1 = sdf.parse(entry);
            Date d2 = sdf.parse(exit);

            // Calculate time difference in milliseconds
            long difference_In_Time = (d2.getTime() - d1.getTime());

            // Calculate time difference in seconds, minutes, hours, years, and days
            int difference_In_Minutes = (int) (difference_In_Time / (1000 * 60)) % 60;

            int difference_In_Hours = (int) (difference_In_Time / (1000 * 60 * 60)) % 24;

            int difference_In_Days = (int) (difference_In_Time / (1000 * 60 * 60 * 24));

//            ticketInfo.add(difference_In_Days, difference_In_Hours, difference_In_Minutes)

            // Print the date difference in years, in days, in hours, in minutes, and in seconds

            System.out.print("Difference between two dates is: ");

            System.out.println(difference_In_Days
                    + " days, "
                    + difference_In_Hours
                    + " hours, "
                    + difference_In_Minutes
                    + " minutes");
        ticketInfo.add(difference_In_Days);
        ticketInfo.add(difference_In_Hours);
        ticketInfo.add(difference_In_Minutes);
//        }

        // Catch the Exception
//        catch (ParseException e) {
//            System.err.println("Datetime input is wrong");
//        }

        return ticketInfo;
    }

}
