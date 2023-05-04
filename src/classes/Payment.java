/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.UUID;

/**
 *
 * @author William
 */
public class Payment {
    public static String type;
    public static int total;
    public static String cardNumber;
    public static String phoneNumber;
    public static String paymentId;
    
    public Payment(String uType, int uTotal, String uCardNumber, String uPhoneNumber) {
        type = uType;
        total = uTotal;
        cardNumber = !uCardNumber.equals("") ? uCardNumber : "";
        phoneNumber = !uPhoneNumber.equals("") ? uPhoneNumber : "";
        paymentId = UUID.randomUUID().toString();
    }
}
