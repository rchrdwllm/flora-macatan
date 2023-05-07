/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

/**
 *
 * @author William
 */
public class User {
    public static String name;
    public static String address;
    public static String contact;
    public static String email;
    public static String password;
    public static String userId;
    
    public User(String name, String address, String contact, String email, String password) {
        User.name = name;
        User.address = address;
        User.contact = contact;
        User.email = email;
        User.userId = UUID.randomUUID().toString();
    }
    
    public static void addUser(String name, String address, String contact, String email, String password, String userId) {
        try {
            String st = "INSERT INTO user (name, address, contact, email, password, userId) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = Database.sqlConnection.prepareStatement(st);
            
            pstmt.setString(1, name);
            pstmt.setString(2, address);
            pstmt.setString(3, contact);
            pstmt.setString(4, email);
            pstmt.setString(5, password);
            pstmt.setString(6, userId);
            
            pstmt.executeUpdate();
            
            System.out.println("User with userId " + userId + " added successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public User getDetails() {
        return this;
    }
    
    public void setName(String name) {
        User.name = name;
    }
    
    public void setAddress(String address) {
        User.address = address;
    }
    
    public void setContact(String contact) {
        User.contact = contact;
    }
    
    public void setEmail(String email) {
        User.email = email;
    }
}
