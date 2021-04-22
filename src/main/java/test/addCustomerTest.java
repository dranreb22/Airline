package test;

import com.company.addCustomer;
import com.toedter.calendar.JCalendar;
import org.junit.Test;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

// Test Case ID               : UnitTest-AddFlightTest-003
// Requirement ID/Description : REQ-003 The application shall handle an error connecting to the database gracefully
// Purpose                    : To ensure that an error encountered while connecting to or querying the database is
//                              handled gracefully using proper error handling.
// Test Setup                 : The userimage variable of the sql query is initialized as null before attempting to
//                              insert a record into the database.
// Test Strategy              : Negative Testing
// Input                      : id, firstname, lastname, nic, passport, address, date, gender, contact
// Expected Output            : Method jButton2ActionPerformed() should produce a java.sql.SQLException

public class addCustomerTest {
    @Test
    public void jButton2ActionPerformed() {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String id = "test";
        String firstname = "first";
        String lastname = "last";
        String nic = "nic";
        String passport = "passport";
        String address = "address";
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        JCalendar txtdob = new JCalendar();
        String date = da.format(new Date());
        String Gender = "Male";
        String contact = "test";

        try {
            byte[] userimage = null;

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager
                    .getConnection("jdbc:mysql://mysql.nicspe9.dreamhosters.com/softwaretesting", "bernard123", "SoftwareTesting");
            PreparedStatement pst = con.prepareStatement(
                    "insert into customer(id,firstname,lastname,nic,passport,address,dob,gender,contact,photo)values(?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, id);
            pst.setString(2, firstname);
            pst.setString(3, lastname);
            pst.setString(4, nic);
            pst.setString(5, passport);
            pst.setString(6, address);
            pst.setString(7, date);
            pst.setString(8, Gender);
            pst.setString(9, contact);
            pst.setBytes(10, userimage);
            pst.executeUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
