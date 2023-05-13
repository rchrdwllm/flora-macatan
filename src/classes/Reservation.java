/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.UUID;
import java.util.Date;

/**
 *
 * @author William
 */
public class Reservation {
    public static String checkInDate;
    public static String checkOutDate;
    public static String roomType;
    public static String duration;
    public static String roomNo;
    public static int basePrice = 0;
    public static int totalPrice = 0;
    public static String reservationId;
    
    public Reservation(Date checkInDate, Date checkOutDate, String roomType, String duration) {
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd yyyy");
            
        String formattedCheckIn = formatter.format(checkInDate);
        String formattedCheckOut = formatter.format(checkOutDate);
        
        Reservation.checkInDate = formattedCheckIn;
        Reservation.checkOutDate = formattedCheckOut;
        Reservation.roomType = roomType;
        Reservation.duration = duration;
        Reservation.reservationId = UUID.randomUUID().toString();
    }
    
    public static void addToDb() {
        try {
            String st = "INSERT INTO reservation (checkInDate, checkOutDate, roomType, roomNo, duration, basePrice, totalPrice, userId, reservationId) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = Database.sqlConnection.prepareStatement(st);
            
            pstmt.setString(1, checkInDate);
            pstmt.setString(2, checkOutDate);
            pstmt.setString(3, roomType);
            pstmt.setString(4, roomNo);
            pstmt.setString(5, duration);
            pstmt.setInt(6, basePrice);
            pstmt.setInt(7, totalPrice);
            pstmt.setString(8, User.userId);
            pstmt.setString(9, reservationId);
            
            pstmt.executeUpdate();
            
            System.out.println("Reservation with reservationId " + reservationId + " added successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
