package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class ticketreport extends javax.swing.JInternalFrame {

  /**
   * Creates new form ticketreport
   */
  public ticketreport() {
    initComponents();
    LoadData();
  }

  Connection con;
  PreparedStatement pst;

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    jButton1 = new javax.swing.JButton();

    jTable1.setModel(new DefaultTableModel(
        new Object[][]{

        },
        new String[]{
            "TicketNo", "Flight No", "Customer ID", "Class", "Price", "Seats", "Date"
        }
    ));
    jScrollPane1.setViewportView(jTable1);

    jButton1.setText("Cancel");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155,
                            javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(
      java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    this.hide();
  }//GEN-LAST:event_jButton1ActionPerformed


  public void LoadData() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager
          .getConnection("jdbc:mysql://localhost/airlinereservationsystem", "root", "12345678");
      pst = con.prepareStatement("SELECT * from ticket");
      ResultSet rs = pst.executeQuery();

      ResultSetMetaData rsm = rs.getMetaData();
      int c;
      c = rsm.getColumnCount();

      DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
      Df.setRowCount(0);

      while (rs.next()) {
        Vector v2 = new Vector();

        for (int i = 1; i <= c; i++) {
          v2.add(rs.getString("id"));
          v2.add(rs.getString("flightid"));
          v2.add(rs.getString("custid"));
          v2.add(rs.getString("class"));
          v2.add(rs.getString("price"));
          v2.add(rs.getString("seats"));
          v2.add(rs.getString("date"));

        }

        Df.addRow(v2);


      }


    } catch (ClassNotFoundException ex) {
      Logger.getLogger(ticket.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
      Logger.getLogger(ticket.class.getName()).log(Level.SEVERE, null, ex);
    }


  }


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  // End of variables declaration//GEN-END:variables
}
