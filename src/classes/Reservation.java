/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.UUID;
import java.util.Date;

/**
 *
 * @author William
 */
public class Reservation {
    public static Date checkInDate;
    public static Date checkOutDate;
    public static String roomType;
    public static long duration;
    public static int basePrice = 0;
    public static int totalPrice = 0;
    public static String reservationId;
    
    public Reservation(Date checkInDate, Date checkOutDate, String roomType, long duration) {
        Reservation.checkInDate = checkInDate;
        Reservation.checkOutDate = checkOutDate;
        Reservation.roomType = roomType;
        Reservation.duration = duration;
        Reservation.reservationId = UUID.randomUUID().toString();
    }
}
