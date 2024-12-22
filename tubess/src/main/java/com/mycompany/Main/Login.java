/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

/**
 *
 * @author ASUS
 */
public abstract class Login  implements IUserActions{
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
    
    @Override
    public void login(String username, String password) {
        if (this.User_name.equals(username) && this.password.equals(password)) {
            System.out.println("Login berhasil untuk user: " + username);
        } else {
            System.out.println("Login gagal. Username atau password salah.");
            throw new SecurityException("Login gagal");
        }
    }
    
    @Override
    public void logout() {
        System.out.println("Logout berhasil untuk user: " + User_name);
    }

    @Override
    public String toString() {
        return "Login berhasil untuk user: " + User_name;
    }
        
}

