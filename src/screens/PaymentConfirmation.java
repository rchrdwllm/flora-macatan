/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import java.awt.Font;
import java.awt.Toolkit;
import utilities.ReadexProLoader;
import classes.User;
/**
 *
 * @author jejer
 */
public class PaymentConfirmation extends javax.swing.JFrame {
    Font readexPro;
    Font readexProSemiBold;

    /**
     * Creates new form PaymentConfirmed
     */
    public PaymentConfirmation() {
        setIconImage();
        setFonts();
        initComponents();
    }
    
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../assets/Flora_Logo_20x20.png")));
    }
    
    private void setFonts() {
        ReadexProLoader loader = new ReadexProLoader();
        
        readexPro = loader.readexPro(12);
        readexProSemiBold = loader.readexProSemiBold(20);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblBookingNo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblRoom = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblCheckIn = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblCheckIn2 = new javax.swing.JLabel();
        pnlTotal = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flora Macatan");
        setMinimumSize(new java.awt.Dimension(410, 627));

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setBorder(javax.swing.BorderFactory.createEmptyBorder(224, 256, 224, 256));
        pnlMain.setMinimumSize(new java.awt.Dimension(410, 627));
        pnlMain.setPreferredSize(new java.awt.Dimension(410, 627));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(readexPro);
        jLabel2.setForeground(new java.awt.Color(171, 171, 171));
        jLabel2.setText("<html><p>We'll be sending you an email confirmation to <b>" + User.email + "</b> shortly.</p></html>");
        pnlMain.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 260, 42));

        jLabel1.setBackground(new java.awt.Color(88, 96, 106));
        jLabel1.setFont(readexProSemiBold);
        jLabel1.setForeground(new java.awt.Color(58, 50, 44));
        jLabel1.setText("<html><head><style>body { font-family: \"Readex Pro\"; font-weight: 700; }</style></head>Booking <font color=\"#5B3700\">confirmed!</font></html>");
        pnlMain.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        lblImage.setFont(readexPro);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/key-checkmark.png"))); // NOI18N
        pnlMain.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 100, 100));

        lblBookingNo.setFont(readexPro);
        lblBookingNo.setText("#4D5K98L");
        pnlMain.add(lblBookingNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabel4.setFont(readexPro);
        jLabel4.setForeground(new java.awt.Color(171, 171, 171));
        jLabel4.setText("Booking no.");
        pnlMain.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jLabel5.setFont(readexPro);
        jLabel5.setForeground(new java.awt.Color(171, 171, 171));
        jLabel5.setText("Name");
        pnlMain.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        lblName.setFont(readexPro);
        lblName.setText("Lore Una");
        pnlMain.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        lblEmail.setFont(readexPro);
        lblEmail.setText("4J");
        pnlMain.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jLabel7.setFont(readexPro);
        jLabel7.setForeground(new java.awt.Color(171, 171, 171));
        jLabel7.setText("Room");
        pnlMain.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        lblRoom.setFont(readexPro);
        lblRoom.setText("Suite");
        pnlMain.add(lblRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        jLabel8.setFont(readexPro);
        jLabel8.setForeground(new java.awt.Color(171, 171, 171));
        jLabel8.setText("Check in");
        pnlMain.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        lblCheckIn.setFont(readexPro);
        lblCheckIn.setText("April 5, 2023");
        pnlMain.add(lblCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        jLabel9.setFont(readexPro);
        jLabel9.setForeground(new java.awt.Color(171, 171, 171));
        jLabel9.setText("Check in");
        pnlMain.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, -1));

        jLabel10.setFont(readexPro);
        jLabel10.setForeground(new java.awt.Color(171, 171, 171));
        jLabel10.setText("Room no.");
        pnlMain.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        lblCheckIn2.setFont(readexPro);
        lblCheckIn2.setText("April 15, 2023");
        pnlMain.add(lblCheckIn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        pnlTotal.setBackground(new java.awt.Color(255, 255, 255));
        pnlTotal.setLayout(new java.awt.GridLayout());

        jLabel6.setFont(readexPro);
        jLabel6.setForeground(new java.awt.Color(171, 171, 171));
        jLabel6.setText("Total");
        pnlTotal.add(jLabel6);

        lblTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblTotal.setFont(readexProSemiBold);
        lblTotal.setForeground(new java.awt.Color(91, 55, 0));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTotal.setText("PHP 50,000");
        pnlTotal.add(lblTotal);

        pnlMain.add(pnlTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 250, 40));

        btnBack.setBackground(new java.awt.Color(91, 55, 0));
        btnBack.setFont(readexPro);
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back to home");
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 8, 16, 8));
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        pnlMain.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 250, -1));

        getContentPane().add(pnlMain, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Dashboard().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentConfirmation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBookingNo;
    private javax.swing.JLabel lblCheckIn;
    private javax.swing.JLabel lblCheckIn2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTotal;
    // End of variables declaration//GEN-END:variables
}
