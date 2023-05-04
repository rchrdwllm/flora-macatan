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
    public static String age;
    public static String address;
    public static String contact;
    public static String email;
    public static String userId;
    
    public User(String uName, String uAge, String uAddress, String uContact, String uEmail) {
        name = uName;
        age = uAge;
        address = uAddress;
        contact = uContact;
        email = uEmail;
        userId = UUID.randomUUID().toString();
    }
    
    public User getDetails() {
        return this;
    }
    
    public static void addUser(String name, String age, String address, String contact, String email, String userId) {
        try {
            String st = "INSERT INTO user (name, age, address, contact, email, userId) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = Database.sqlConnection.prepareStatement(st);
            
            pstmt.setString(1, name);
            pstmt.setString(2, age);
            pstmt.setString(3, address);
            pstmt.setString(4, contact);
            pstmt.setString(5, email);
            pstmt.setString(6, userId);
            
            pstmt.executeUpdate();
            
            System.out.println("User with userId " + userId + " added successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(String age) {
        this.age = age;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setContact(String contact) {
        this.contact = contact;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
