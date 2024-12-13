/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

/**
 *
 * @author ASUS
 */
public class Produk {
    private int idBarang;
    private int kodeBarang;
    private String namaBarang;
    private String jenisBarang;
    private double hargaBarang;
    private int stok;

    // Konstruktor
    public Produk(int idBarang, int kodeBarang, String namaBarang, String jenisBarang, double hargaBarang, int stok) {
        this.idBarang = idBarang;
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.jenisBarang = jenisBarang;
        this.hargaBarang = hargaBarang;
        this.stok = stok;
    }

    void setNama(String namaBaru) {
        this.namaBarang = namaBaru;
    }

    void setHarga(double hargaBaru) {
        this.hargaBarang = hargaBaru;
    }

    int getId() {
        return idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    public void setKodeBarang(int kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
}
