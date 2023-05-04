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
    public static String reservationId;
    
    public Reservation(Date uCheckInDate, Date uCheckOutDate) {
        checkInDate = uCheckInDate;
        checkOutDate = uCheckOutDate;
        reservationId = UUID.randomUUID().toString();
    }
}
