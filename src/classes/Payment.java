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
    public static String email;
    public static String password;
    public static String cardNumber;
    public static String phoneNumber;
    public static String paymentId;
    
    public Payment(String type, int total, String cardNumber, String phoneNumber) {
        Payment.type = type;
        Payment.total = total;
        Payment.cardNumber = !cardNumber.equals("") ? cardNumber : "";
        Payment.phoneNumber = !phoneNumber.equals("") ? phoneNumber : "";
        Payment.paymentId = UUID.randomUUID().toString();
    }
    
    public Payment(String type, String email, String password, int total) {
        Payment.type = type;
        Payment.total = total;
        Payment.email = email;
        Payment.password = password;
        Payment.cardNumber = !cardNumber.equals("") ? cardNumber : "";
        Payment.phoneNumber = !phoneNumber.equals("") ? phoneNumber : "";
        Payment.paymentId = UUID.randomUUID().toString();
    }
}
