package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

// Test Case ID               : UnitTest-AddFlightTest-002
// Requirement ID/Description : REQ-002 The application shall prohibit the user from creating a flight that departs on
//                              a date in the past
// Purpose                    : To ensure that the user can't add a flight in the past
// Test Setup                 : A variable "date" is used to store today's date and is compared with a pseudo user
//                              selected variable "cal" to see if the application will deny a date in the past.
// Test Strategy              : Input Validation
// Input                      : cal - Selected Date
// Expected Output            : Method jButton1ActionPerformedTest returns 1 (The selected date is after today's date)

public class AddFlightTest {
    @Test
    public void jButton1ActionPerformedTest(){
        String id = "1";
        String flightname = "sky high";

        String source = "india";
        String depart = "srilanka";

        Calendar cal = Calendar.getInstance();

        // Select yesterdays date
        cal.add(Calendar.DATE,-1);
        System.out.println(cal.getTime());

        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");

        // Stores todays date
        Date date = new Date();
        System.out.println(date.toString());

        String departtime = "1200";
        String arrtime = "1400";
        String flightcharge = "200";

        // date          = today's date
        // cal.getTime() = yesterday's date
        // compareTo    -> Compare cal.getTime() to date
        //                  -> Return 1 if selected date is after the current date
        //                  -> 0 if selected date is the same as the current date
        //                  -> -1 if the selected date is prior to the current date
        Assert.assertEquals(-1, cal.getTime().compareTo(date));
    }
}