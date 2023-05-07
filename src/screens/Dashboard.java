/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;

import java.awt.Font;
import utilities.ReadexProLoader;
import java.awt.Toolkit;

/**
 *
 * @author William
 */
public class Dashboard extends javax.swing.JFrame {
    Font readexPro;
    Font readexProSemiBold;
    
    public Dashboard() {
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
        pnlHeadings = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pnlBtns = new javax.swing.JPanel();
        btnBook = new javax.swing.JButton();
        btnSeeRooms = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        btnSignOut = new javax.swing.JButton();
        pnlCopyright = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flora Macatan");
        setFont(readexPro);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(64, 192, 64, 192));
        mainPanel.setLayout(new java.awt.BorderLayout());

        pnlHeadings.setBackground(new java.awt.Color(255, 255, 255));
        pnlHeadings.setLayout(new java.awt.GridLayout(3, 1));

        jLabel1.setFont(readexProSemiBold);
        jLabel1.setForeground(new java.awt.Color(58, 50, 44));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to");
        pnlHeadings.add(jLabel1);

        jLabel2.setFont(jLabel1.getFont());
        jLabel2.setForeground(new java.awt.Color(91, 55, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Flora Macatan");
        pnlHeadings.add(jLabel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 0, 0, 0));
        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        jLabel5.setFont(readexPro);
        jLabel5.setForeground(new java.awt.Color(171, 171, 171));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Say goodbye to long wait times and complicated booking");
        jPanel1.add(jLabel5);

        jLabel6.setFont(readexPro);
        jLabel6.setForeground(new java.awt.Color(171, 171, 171));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" procedures, and reserve your dream stay with ease today!");
        jPanel1.add(jLabel6);

        pnlHeadings.add(jPanel1);

        mainPanel.add(pnlHeadings, java.awt.BorderLayout.NORTH);

        pnlBtns.setBackground(new java.awt.Color(255, 255, 255));
        pnlBtns.setBorder(javax.swing.BorderFactory.createEmptyBorder(32, 1, 32, 1));
        pnlBtns.setLayout(new java.awt.GridLayout(4, 0, 0, 16));

        btnBook.setBackground(new java.awt.Color(91, 55, 0));
        btnBook.setFont(readexPro);
        btnBook.setForeground(new java.awt.Color(255, 255, 255));
        btnBook.setText("Book now!");
        btnBook.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 1, 16, 1));
        btnBook.setBorderPainted(false);
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        pnlBtns.add(btnBook);

        btnSeeRooms.setBackground(new java.awt.Color(246, 246, 246));
        btnSeeRooms.setFont(btnBook.getFont());
        btnSeeRooms.setForeground(new java.awt.Color(58, 50, 44));
        btnSeeRooms.setText("See our rooms");
        btnSeeRooms.setToolTipText("");
        btnSeeRooms.setBorder(btnBook.getBorder());
        btnSeeRooms.setBorderPainted(false);
        pnlBtns.add(btnSeeRooms);

        btnAbout.setBackground(new java.awt.Color(246, 246, 246));
        btnAbout.setFont(btnBook.getFont());
        btnAbout.setForeground(new java.awt.Color(58, 50, 44));
        btnAbout.setText("About us");
        btnAbout.setToolTipText("");
        btnAbout.setBorder(btnBook.getBorder());
        btnAbout.setBorderPainted(false);
        pnlBtns.add(btnAbout);

        btnSignOut.setBackground(new java.awt.Color(246, 246, 246));
        btnSignOut.setFont(btnBook.getFont());
        btnSignOut.setForeground(new java.awt.Color(58, 50, 44));
        btnSignOut.setText("Sign out");
        btnSignOut.setToolTipText("");
        btnSignOut.setBorder(btnBook.getBorder());
        btnSignOut.setBorderPainted(false);
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });
        pnlBtns.add(btnSignOut);

        mainPanel.add(pnlBtns, java.awt.BorderLayout.CENTER);

        pnlCopyright.setBackground(new java.awt.Color(255, 255, 255));
        pnlCopyright.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(readexPro);
        jLabel3.setForeground(new java.awt.Color(171, 171, 171));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Flora Macatan. Copyright 2023. All Rights Reserved.");
        pnlCopyright.add(jLabel3, java.awt.BorderLayout.CENTER);

        mainPanel.add(pnlCopyright, java.awt.BorderLayout.SOUTH);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        new Home().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnSignOutActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        new RoomSelection().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnBookActionPerformed

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../assets/Flora_Logo_20x20.png")));
    }
    
    private void setFonts() {
        ReadexProLoader loader = new ReadexProLoader();
        
        readexPro = loader.readexPro(12);
        readexProSemiBold = loader.readexProSemiBold(32);
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnSeeRooms;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pnlBtns;
    private javax.swing.JPanel pnlCopyright;
    private javax.swing.JPanel pnlHeadings;
    // End of variables declaration//GEN-END:variables
}
