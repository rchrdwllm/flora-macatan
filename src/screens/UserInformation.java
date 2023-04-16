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
 * @author William
 */
public class UserInformation extends javax.swing.JFrame {
    Home home;
    Font readexPro;
    Font readexProSemiBold;
    
    public User user;

    /**
     * Creates new form UserInformationEntry
     */
    public UserInformation() {
        setIconImage();
        setFonts();
        initComponents();
        focus();
    }
    
    public UserInformation(Home home) {
        this.home = home;
        
        setIconImage();
        setFonts();
        initComponents();
        focus();
    }
    
    private void focus() {
        pnlMain.requestFocus();
    }
    
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../assets/Flora_Logo_20x20.png")));
    }
    
    private void setFonts() {
        ReadexProLoader loader = new ReadexProLoader();
        
        readexPro = loader.readexPro(12);
        readexProSemiBold = loader.readexProSemiBold(32);
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
        pnlHeadings = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlForms = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtConNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        pnlBtns = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flora Macatan");

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setLayout(new java.awt.BorderLayout());

        pnlHeadings.setBackground(new java.awt.Color(255, 255, 255));
        pnlHeadings.setBorder(javax.swing.BorderFactory.createEmptyBorder(64, 192, 0, 192));
        pnlHeadings.setLayout(new java.awt.GridLayout(3, 0));

        jLabel1.setFont(readexProSemiBold);
        jLabel1.setForeground(new java.awt.Color(58, 50, 44));
        jLabel1.setText("<html><head><style>body { font-family: \"Readex Pro\"; font-weight: 700; }</style></head>Guest <font color=\"#5B3700\">information</font></html>");
        pnlHeadings.add(jLabel1);

        jLabel2.setFont(readexPro);
        jLabel2.setForeground(new java.awt.Color(171, 171, 171));
        jLabel2.setText("Provide your booking information");
        pnlHeadings.add(jLabel2);

        jSeparator1.setBackground(new java.awt.Color(246, 246, 246));
        jSeparator1.setForeground(new java.awt.Color(246, 246, 246));
        pnlHeadings.add(jSeparator1);

        pnlMain.add(pnlHeadings, java.awt.BorderLayout.NORTH);

        pnlForms.setBackground(new java.awt.Color(255, 255, 255));
        pnlForms.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 192, 0, 192));
        pnlForms.setLayout(new java.awt.GridLayout(5, 0, 0, 16));

        txtName.setBackground(new java.awt.Color(246, 246, 246));
        txtName.setFont(readexPro);
        txtName.setForeground(new java.awt.Color(171, 171, 171));
        txtName.setText("Name");
        txtName.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 201, 201), 1, true), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        pnlForms.add(txtName);

        txtAge.setBackground(new java.awt.Color(246, 246, 246));
        txtAge.setFont(readexPro);
        txtAge.setForeground(new java.awt.Color(171, 171, 171));
        txtAge.setText("Age");
        txtAge.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 201, 201), 1, true), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
        txtAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAgeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAgeFocusLost(evt);
            }
        });
        pnlForms.add(txtAge);

        txtAddress.setBackground(new java.awt.Color(246, 246, 246));
        txtAddress.setFont(readexPro);
        txtAddress.setForeground(new java.awt.Color(171, 171, 171));
        txtAddress.setText("Address");
        txtAddress.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 201, 201), 1, true), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });
        pnlForms.add(txtAddress);

        txtConNo.setBackground(new java.awt.Color(246, 246, 246));
        txtConNo.setFont(readexPro);
        txtConNo.setForeground(new java.awt.Color(171, 171, 171));
        txtConNo.setText("Contact number");
        txtConNo.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 201, 201), 1, true), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
        txtConNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConNoFocusLost(evt);
            }
        });
        pnlForms.add(txtConNo);

        txtEmail.setBackground(new java.awt.Color(246, 246, 246));
        txtEmail.setFont(readexPro);
        txtEmail.setForeground(new java.awt.Color(171, 171, 171));
        txtEmail.setText("Email");
        txtEmail.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(201, 201, 201), 1, true), javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16)));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        pnlForms.add(txtEmail);

        pnlMain.add(pnlForms, java.awt.BorderLayout.CENTER);

        pnlBtns.setBackground(new java.awt.Color(255, 255, 255));
        pnlBtns.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 192, 64, 192));
        pnlBtns.setLayout(new java.awt.GridLayout(1, 0, 16, 0));

        btnBack.setBackground(new java.awt.Color(246, 246, 246));
        btnBack.setFont(readexPro);
        btnBack.setForeground(new java.awt.Color(58, 50, 44));
        btnBack.setText("Back");
        btnBack.setToolTipText("");
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));
        btnBack.setBorderPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        pnlBtns.add(btnBack);

        btnConfirm.setBackground(new java.awt.Color(91, 55, 0));
        btnConfirm.setFont(readexPro);
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm");
        btnConfirm.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 16, 16, 16));
        btnConfirm.setBorderPainted(false);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        pnlBtns.add(btnConfirm);

        pnlMain.add(pnlBtns, java.awt.BorderLayout.SOUTH);

        getContentPane().add(pnlMain, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.home.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        if (txtName.getText().equals("Name")) {
            txtName.setText("");
            txtName.setForeground(new java.awt.Color(58,50,44));
        }
    }//GEN-LAST:event_txtNameFocusGained

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        String name = txtName.getText();
        String age = txtAge.getText();
        String address = txtAddress.getText();
        String contact = txtConNo.getText();
        String email = txtEmail.getText();
        
        this.user = new User(name, age, address, contact, email);
        
        new DateSelection(this).setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        if (txtName.getText().equals("")) {
            txtName.setText("Name");
            txtName.setForeground(new java.awt.Color(171, 171, 171));
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtAgeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAgeFocusGained
        if (txtAge.getText().equals("Age")) {
            txtAge.setText("");
            txtAge.setForeground(new java.awt.Color(58,50,44));
        }
    }//GEN-LAST:event_txtAgeFocusGained

    private void txtAgeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAgeFocusLost
        if (txtAge.getText().equals("")) {
            txtAge.setText("Age");
            txtAge.setForeground(new java.awt.Color(171, 171, 171));
        }
    }//GEN-LAST:event_txtAgeFocusLost

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        if (txtAddress.getText().equals("Address")) {
            txtAddress.setText("");
            txtAddress.setForeground(new java.awt.Color(58,50,44));
        }
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost
        if (txtAddress.getText().equals("")) {
            txtAddress.setText("Address");
            txtAddress.setForeground(new java.awt.Color(171, 171, 171));
        }
    }//GEN-LAST:event_txtAddressFocusLost

    private void txtConNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConNoFocusGained
        if (txtConNo.getText().equals("Contact number")) {
            txtConNo.setText("");
            txtConNo.setForeground(new java.awt.Color(58,50,44));
        }
    }//GEN-LAST:event_txtConNoFocusGained

    private void txtConNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConNoFocusLost
        if (txtConNo.getText().equals("")) {
            txtConNo.setText("Contact number");
            txtConNo.setForeground(new java.awt.Color(171, 171, 171));
        }
    }//GEN-LAST:event_txtConNoFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        if (txtEmail.getText().equals("Email")) {
            txtEmail.setText("");
            txtEmail.setForeground(new java.awt.Color(58,50,44));
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if (txtEmail.getText().equals("")) {
            txtEmail.setText("Email");
            txtEmail.setForeground(new java.awt.Color(171, 171, 171));
        }
    }//GEN-LAST:event_txtEmailFocusLost

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
            java.util.logging.Logger.getLogger(UserInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlBtns;
    private javax.swing.JPanel pnlForms;
    private javax.swing.JPanel pnlHeadings;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtConNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
