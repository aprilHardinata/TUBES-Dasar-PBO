/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

/**
 *
 * @author ASUS
 */
public class Kurir extends Login implements IUserActions {

    private String nomorTelephone;
    public Kurir(String User_name, String password, String nomorTelephone) {
        super(User_name, password);
        this.nomorTelephone = nomorTelephone;
    }

    public void pilihKurir(){
       
    }
    
    @Override
    public void login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNomorTelephone() {
        return nomorTelephone;
    }
    
}
