/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import java.awt.Toolkit;
import java.awt.Font;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import classes.User;
import classes.Database;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import utilities.ReadexProLoader;

/**
 *
 * @author William
 */
public class ReservationLog extends javax.swing.JFrame {
    Font readexPro;
    Font readexProSemiBold;
    
    /**
     * Creates new form ReservationLog
     */
    public ReservationLog() {
        setIconImage();
        setFonts();
        initComponents();
        fetchData();
        stylizeTable();
    }
    
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../assets/Flora_Logo_20x20.png")));
    }
    
    private void setFonts() {
        ReadexProLoader loader = new ReadexProLoader();
        
        readexPro = loader.readexPro(12);
        readexProSemiBold = loader.readexProSemiBold(20);
    }
    
    private void fetchData() {
        try {
            String query = "SELECT * from floramacatan.reservation WHERE userId = ?";
            PreparedStatement pstmt = Database.sqlConnection.prepareStatement(query);

            pstmt.setString(1, User.userId);
            
            ResultSet rs = pstmt.executeQuery();
            ResultSetMetaData rsMetaData = rs.getMetaData();
            
            int tableCount = rsMetaData.getColumnCount();
            
            DefaultTableModel recordTable = (DefaultTableModel) tblReservations.getModel();
            
            recordTable.setRowCount(0);
            
            while (rs.next()) {
                Vector columnData = new Vector();
                
                for (int i = 1; i < tableCount; i++) {
                    String roomType = rs.getString("roomType");
                    
                    columnData.add(rs.getString("reservationId"));
                    columnData.add(rs.getString("checkInDate"));
                    columnData.add(rs.getString("checkOutDate"));
                    columnData.add(roomType.substring(0, 1).toUpperCase() + roomType.substring(1).toLowerCase());
                    columnData.add("PHP " + rs.getInt("totalPrice"));
                }
                
                recordTable.addRow(columnData);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private void stylizeTable() {
        tblReservations.getTableHeader().setFont(readexPro);
        tblReservations.getTableHeader().setForeground(new java.awt.Color(58, 50, 44));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservations = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flora Macatan");

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(readexProSemiBold);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>Your <font color=\"#5b3700\"> reservations</font></html>");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(64, 0, 64, 0));
        pnlMain.add(jLabel1, java.awt.BorderLayout.NORTH);

        pnlTable.setBackground(new java.awt.Color(255, 255, 255));
        pnlTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 64, 32, 64));
        pnlTable.setLayout(new java.awt.BorderLayout());

        tblReservations.setFont(readexPro);
        tblReservations.setForeground(new java.awt.Color(58, 50, 44));
        tblReservations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Booking no.", "Check in", "Check out", "Room Type", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReservations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReservationsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReservations);

        pnlTable.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnlMain.add(pnlTable, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 64, 64, 64));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(246, 246, 246));
        jButton1.setFont(readexPro);
        jButton1.setForeground(new java.awt.Color(58, 50, 44));
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, java.awt.BorderLayout.PAGE_END);

        pnlMain.add(jPanel1, java.awt.BorderLayout.SOUTH);

        getContentPane().add(pnlMain, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblReservationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReservationsMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) tblReservations.getModel();
        int selectedRows = tblReservations.getSelectedRow();
          
        String reservationId = RecordTable.getValueAt(selectedRows,0).toString();
        
        new PaymentConfirmation(reservationId).setVisible(true);
    }//GEN-LAST:event_tblReservationsMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Home().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReservationLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTable;
    private javax.swing.JTable tblReservations;
    // End of variables declaration//GEN-END:variables
}
