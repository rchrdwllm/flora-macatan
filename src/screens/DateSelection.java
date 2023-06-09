/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import java.awt.Font;
import java.awt.Toolkit;
import java.util.Date;
import javax.swing.JOptionPane;
import utilities.ReadexProLoader;
import classes.Reservation;

/**
 *
 * @author William
 */
public class DateSelection extends javax.swing.JFrame {
    RoomSelection roomSelection;
    Font readexPro;
    Font readexProSemiBold;
    long duration;
    String errorMssg = "";
    
    public Date checkIn;
    public Date checkOut;
    
    /**
     * Creates new form DateSelection
     */
    public DateSelection() {
        setIconImage();
        setFonts();
        initComponents();
    }
    
    public DateSelection(RoomSelection roomSelection) {
        this.roomSelection = roomSelection;
        
        setIconImage();
        setFonts();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        pnlHeading = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlDates = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        checkInDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        checkOutDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        pnlBtns = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblDateDiff = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flora Macatan");

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(64, 64, 64, 64));
        mainPanel.setLayout(new java.awt.BorderLayout());

        pnlHeading.setBackground(new java.awt.Color(255, 255, 255));
        pnlHeading.setLayout(new javax.swing.BoxLayout(pnlHeading, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel1.setFont(readexProSemiBold);
        jLabel1.setForeground(new java.awt.Color(58, 50, 44));
        jLabel1.setText("<html><head><style>body { font-family: \"Readex Pro\"; font-weight: 700; }</style></head><font color=\"#5B3700\">Dates</font></html>");
        pnlHeading.add(jLabel1);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setAlignmentX(0.0F);
        jPanel6.setMaximumSize(new java.awt.Dimension(100, 6));
        jPanel6.setMinimumSize(new java.awt.Dimension(100, 6));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 6));
        pnlHeading.add(jPanel6);

        jLabel2.setFont(readexPro);
        jLabel2.setForeground(new java.awt.Color(125, 124, 131));
        jLabel2.setText("When would you like to stay?");
        pnlHeading.add(jLabel2);

        mainPanel.add(pnlHeading, java.awt.BorderLayout.NORTH);

        pnlDates.setBackground(new java.awt.Color(255, 255, 255));
        pnlDates.setLayout(new java.awt.GridLayout(2, 0, 16, -50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(48, 0, 48, 0));
        jPanel4.setLayout(new java.awt.BorderLayout());

        checkInDate.setForeground(new java.awt.Color(94, 94, 94));
        checkInDate.setFont(readexPro);
        checkInDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                checkInDatePropertyChange(evt);
            }
        });
        jPanel4.add(checkInDate, java.awt.BorderLayout.CENTER);

        jLabel3.setFont(readexPro);
        jLabel3.setForeground(new java.awt.Color(171, 171, 171));
        jLabel3.setText("Check-in date:");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 8, 0));
        jPanel4.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        pnlDates.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(48, 0, 48, 0));
        jPanel5.setLayout(new java.awt.BorderLayout());

        checkOutDate.setForeground(new java.awt.Color(94, 94, 94));
        checkOutDate.setFont(readexPro);
        checkOutDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                checkOutDatePropertyChange(evt);
            }
        });
        jPanel5.add(checkOutDate, java.awt.BorderLayout.CENTER);

        jLabel4.setFont(readexPro);
        jLabel4.setForeground(new java.awt.Color(171, 171, 171));
        jLabel4.setText("Check-out date:");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 8, 0));
        jPanel5.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        pnlDates.add(jPanel5);

        mainPanel.add(pnlDates, java.awt.BorderLayout.CENTER);

        pnlBtns.setBackground(new java.awt.Color(255, 255, 255));
        pnlBtns.setLayout(new java.awt.GridLayout(1, 2));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 160));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel3.setLayout(new java.awt.BorderLayout());

        lblDateDiff.setFont(readexPro);
        lblDateDiff.setForeground(new java.awt.Color(58, 50, 44));
        lblDateDiff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDateDiff.setText("0 days");
        lblDateDiff.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 32, 16, 32));
        lblDateDiff.setMaximumSize(new java.awt.Dimension(130, 48));
        lblDateDiff.setMinimumSize(new java.awt.Dimension(130, 48));
        lblDateDiff.setPreferredSize(new java.awt.Dimension(130, 48));
        jPanel3.add(lblDateDiff, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        pnlBtns.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 16, 0));

        btnBack.setBackground(new java.awt.Color(246, 246, 246));
        btnBack.setFont(readexPro);
        btnBack.setForeground(new java.awt.Color(58, 50, 44));
        btnBack.setText("Back");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack);

        btnNext.setBackground(new java.awt.Color(91, 55, 0));
        btnNext.setFont(readexPro);
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next");
        btnNext.setBorder(null);
        btnNext.setBorderPainted(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel2.add(btnNext);

        pnlBtns.add(jPanel2);

        mainPanel.add(pnlBtns, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        if (errorMssg.isEmpty()) {
            new Reservation(this.checkIn, this.checkOut, this.roomSelection.selectedRoom, Long.toString(this.duration));
            new ReservationConfirmation(this).setVisible(true);

            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, errorMssg);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void checkInDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_checkInDatePropertyChange
        try {
            calculateDateInterval();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_checkInDatePropertyChange

    private void checkOutDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_checkOutDatePropertyChange
        try {
            calculateDateInterval();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_checkOutDatePropertyChange

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.roomSelection.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void calculateDateInterval() throws Exception {
        Date date1 = checkInDate.getDate() == null ? new Date() : checkInDate.getDate();
        Date date2 = checkOutDate.getDate() == null ? new Date() : checkOutDate.getDate();
        
        if (date1 != null || date2 != null) {
            long diffInMilliseconds = (date2.getTime() - date1.getTime());

            if (diffInMilliseconds < 0) {
                errorMssg = "Selected date range is invalid.";
                
                JOptionPane.showMessageDialog(null, errorMssg);
            } else {
                errorMssg = "";
                
                duration = (diffInMilliseconds / (24 * 60 * 60 * 1000)) + 1;
            
                lblDateDiff.setText(Long.toString(duration) + (duration != 1 ? " days" : " day"));

                this.checkIn = checkInDate.getDate();
                this.checkOut = checkOutDate.getDate();
            }
        }
    }
    
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../assets/Flora_Logo_20x20.png")));
    }
    
    private void setFonts() {
        ReadexProLoader loader = new ReadexProLoader();
        
        readexPro = loader.readexPro(12);
        readexProSemiBold = loader.readexProSemiBold(24);
    }
    
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
            java.util.logging.Logger.getLogger(DateSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DateSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DateSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DateSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch (Exception e) {
            System.out.println("UIManager Exception : "+e);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DateSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private com.toedter.calendar.JDateChooser checkInDate;
    private com.toedter.calendar.JDateChooser checkOutDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblDateDiff;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pnlBtns;
    private javax.swing.JPanel pnlDates;
    private javax.swing.JPanel pnlHeading;
    // End of variables declaration//GEN-END:variables
}
