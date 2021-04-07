package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

public class addFlightTest {
    @Test
    public void jButton1ActionPerformedTest(){
        String id = "1";
        String flightname = "sky high";

        String source = "india";
        String depart = "srilanka";

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE,-1);;
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();

        String departtime = "1200";
        String arrtime = "1400";
        String flightcharge = "200";
        Assert.assertTrue(0 >= date.compareTo(cal.getTime()));
        Assert.assertFalse(0 < date.compareTo(cal.getTime()));
    }
}
