/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.UUID;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author William
 */
public class Payment {
    public static String type;
    public static int total;
    public static String email = "";
    public static String password = "";
    public static String cardNumber = "";
    public static String phoneNumber = "";
    public static String paymentId;
    
    public Payment(String type, int total, String cardNumber, String phoneNumber) {
        Payment.type = type;
        Payment.total = total;
        Payment.cardNumber = cardNumber.equals("xxxx xxxx xxxx xxxx") ? "" : cardNumber;
        Payment.phoneNumber = phoneNumber;
        Payment.paymentId = UUID.randomUUID().toString();
    }
    
    public Payment(String type, String email, String password, int total) {
        Payment.type = type;
        Payment.total = total;
        Payment.email = email;
        Payment.password = password;
        Payment.paymentId = UUID.randomUUID().toString();
    }
    
    public static void addToDb() {
        try {
            String st = "INSERT INTO payment (type, total, email, password, cardNumber, phoneNumber, reservationId, paymentId) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = Database.sqlConnection.prepareStatement(st);
            
            pstmt.setString(1, type);
            pstmt.setInt(2, total);
            pstmt.setString(3, email);
            pstmt.setString(4, password);
            pstmt.setString(5, cardNumber);
            pstmt.setString(6, phoneNumber);
            pstmt.setString(7, Reservation.reservationId);
            pstmt.setString(8, paymentId);
            
            pstmt.executeUpdate();
            
            System.out.println("Payment with paymentId " + paymentId + " added successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
