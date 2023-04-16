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
public class User {
    public String name;
    public String age;
    public String address;
    public String contact;
    public String email;
    public String userId;
    
    public User(String name, String age, String address, String contact, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contact = contact;
        this.email = email;
        this.userId = UUID.randomUUID().toString();
    }
    
    private User getDetails() {
        return this;
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
