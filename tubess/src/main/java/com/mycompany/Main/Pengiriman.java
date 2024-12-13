/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

/**
 *
 * @author ASUS
 */
public class Pengiriman {
    private int id_pengiriman;
    private int id_pesanan;
    private int id_kurir;
    private int alamat_pengiriman;

    public Pengiriman(int id_pengiriman, int id_pesanan, int id_kurir, int alamat_pengiriman) {
        this.id_pengiriman = id_pengiriman;
        this.id_pesanan = id_pesanan;
        this.id_kurir = id_kurir;
        this.alamat_pengiriman = alamat_pengiriman;
    }
}
