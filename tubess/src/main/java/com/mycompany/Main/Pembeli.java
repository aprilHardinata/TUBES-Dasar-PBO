/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Pembeli extends Login implements IUserActions{
    private String alamat;
    private int no_telp;
    private String email;

    public Pembeli(String User_name, String password, String alamat, int no_telp, String email) {
        super(User_name, password);
        this.alamat = alamat;
        this.no_telp = no_telp;
        this.email = email;
    }
    

    @Override
    public void login(String username, String password) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void lihatBarang(ArrayList<Produk> dataProduk) {
        if (dataProduk.isEmpty()) {
            System.out.println("Tidak ada produk yang tersedia.");
        } else {
            System.out.println("Daftar Produk: ");
            for (Produk produk : dataProduk) {
                System.out.println("ID: " + produk.getId());
                System.out.println("Nama: " + produk.getNamaBarang());
                System.out.println("Jenis: " + produk.getJenisBarang());
                System.out.println("Harga: " + produk.getHargaBarang());
                System.out.println("----------------------------");
            }
        }
    }
    public void checkout(ArrayList<Produk> dataProduk) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan ID produk yang ingin dibeli: ");
        int idProduk = scanner.nextInt();
        
        // Menemukan produk yang dipilih oleh pembeli
        boolean found = false;
        for (Produk produk : dataProduk) {
            if (produk.getId() == idProduk) {
                found = true;
                
                System.out.print("Masukkan jumlah yang ingin dibeli: ");
                int jumlahBeli = scanner.nextInt();
                
                // Mengecek apakah stok mencukupi
                if (produk.getStok() >= jumlahBeli) {

                    produk.setStok(produk.getStok() - jumlahBeli);
                    System.out.println("Berhasil membeli " + jumlahBeli + " " + produk.getNamaBarang());
                    System.out.println("Sisa stok: " + produk.getStok());
                } else {
                    System.out.println("Stok tidak mencukupi untuk jumlah yang diminta.");
                }
                break;
            }
        }
        
        if (!found) {
            System.out.println("Produk dengan ID tersebut tidak ditemukan.");
        }
    }
}
