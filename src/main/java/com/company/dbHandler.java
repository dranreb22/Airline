package com.company;

import java.sql.*;

public class dbHandler {
    Connection conn = null;

    public static Connection initDB() {
        final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://mysql.nicspe9.dreamhosters.com/softwaretesting";
        final String USER = "bernard123";
        final String PASS = "SoftwareTesting";

        try{
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            return conn;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void close(ResultSet rs) {
        try {
            rs.close();
            System.out.println("ResultSet closed.");
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(PreparedStatement ps) {
        try {
            ps.close();
            System.out.println("Prepared Statement closed.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close (Connection conn) {
        try {
            conn.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
