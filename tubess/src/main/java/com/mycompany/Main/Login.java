/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

/**
 *
 * @author ASUS
 */
public abstract class Login {
    private String User_name;
    private String password;
    
    public Login(String User_name,String password){
        this.User_name = User_name;
        this.password = password;
    }

    public String getUser_name() {
        return User_name;
    }
    public String getPassword() {
        return password;
    }

    
    public void setUser_name(String User_name) {
        this.User_name = User_name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void cek(){
        this.User_name = User_name;
        this.password = password;
        
        if (this.User_name.equals(User_name) && this.password.equals(password)) {
            System.out.println("Password sudah benar");
        } else {
            System.out.println("Password salah, silahkan coba lagi");
        }
    }

    @Override
    public String toString() {
        return User_name + "User Name" + password + "Password" ;
    }
        
}

