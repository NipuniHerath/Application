/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author pc
 */
public class User {
    private String Name;
 
    private String Email;
    private int Id;

    public User(String Name, String Email, int Id) {
        this.Name = Name;
        this.Email = Email;
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "User{" + "Name=" + Name + ", Email=" + Email + ", Id=" + Id + '}';
    }

    public User() {
    }
    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    
    
    
    
    
    
    
}
