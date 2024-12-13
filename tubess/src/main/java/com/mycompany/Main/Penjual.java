/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

/**
 *
 * @author ASUS
 */
public class Penjual {
    // Attributes
    private String idUser;
    private String userName;
    private String password;

    // Reference to Produk
    private Produk dataProduk;

    // Constructor
    public Penjual(String idUser, String userName, String password, Produk dataProduk) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.dataProduk = dataProduk;
    }

    public Produk getDataProduk() {
        return dataProduk;
    }
}
