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
        User.password = password;
        User.userId = UUID.randomUUID().toString();
    }
    
    public User(String name, String address, String contact, String email, String password, String userId) {
        User.name = name;
        User.address = address;
        User.contact = contact;
        User.email = email;
        User.password = password;
        User.userId = userId;
    }
    
    public void addToDb() {
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
}
