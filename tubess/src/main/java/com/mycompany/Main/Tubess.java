/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
class menuPembeli{
    public static void menu(){
        System.out.println("-----------------E-commerce-----------------");
        System.out.println("1. lihat barang");
        System.out.println("2. checkout");
        System.out.print("Masukkan pilihan: ");
    }
}

class menuPenjual{
    public static void menu(){
        System.out.println("-----------------E-commerce-----------------");
        System.out.println("1. Tampil barang ");
        System.out.println("2. Tambah barang");
        System.out.println("3. Edit Barang");
        System.out.println("4. Hapus Barang");
        System.out.print("Masukkan pilihan: ");
    }
}

public class Tubess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Produk> dataProduk = new ArrayList<>();
        dataProduk.add(new Produk(1, 101, "Laptop", "Elektronik", 15000000, 10));
        dataProduk.add(new Produk(2, 102, "Smartphone", "Elektronik", 5000000, 20));
        
        ArrayList<Kurir> daftarKurir = new ArrayList<>();
        daftarKurir.add(new Kurir("Kurir1", "password1", "081234567890"));
        daftarKurir.add(new Kurir("Kurir2", "password2", "089876543210"));
        
        Login pembeli = new Pembeli("Angga", "anggaKetua", "Sukabirus", 1111, "Angga@gmail.com");
        Penjual penjual = new Penjual("1001", "admin", "admin", dataProduk);

        int pilihan = -1;
            while (pilihan != 3) {
                System.out.println("-----------------E-commerce-----------------");
                System.out.println("1. Login sebagai pembeli");
                System.out.println("2. Login sebagai penjual");
                System.out.println("3. Keluar");
                System.out.print("Masukkan pilihan: ");
                pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1 -> {
                        int subPilihan = -1;
                        while (subPilihan != 3) {
                            menuPembeli.menu();
                            subPilihan = scanner.nextInt();

                            switch (subPilihan) {
                                case 1 -> ((Pembeli)pembeli).lihatBarang(dataProduk);
                                case 2 -> {
                                    ((Pembeli)pembeli).checkout(dataProduk);
                                    
                                }
                                case 3 -> System.out.println("Logout sebagai pembeli.");
                                default -> System.out.println("Pilihan tidak valid.");
                            }
                        }
                    }
                    case 2 -> {
                        int pilihanPenjual = -1;
                        while (pilihanPenjual != 5) { 
                            menuPenjual.menu(); 
                            pilihanPenjual = scanner.nextInt();

                            switch (pilihanPenjual) {
                                case 1 -> penjual.lihatBarang(); 
                                case 2 -> penjual.tambahBarang();
                                case 3 -> penjual.updateBarang();
                                case 4 -> penjual.deleteBarang();
                                case 5 -> System.out.println("Log out Sebagai penjual.");
                                default -> System.out.println("Pilihan tidak valid.");
                            }
                        }
                    }
                    
                    case 3 -> System.out.println("Keluar dari aplikasi.");
                    default -> System.out.println("Pilihan tidak valid.");
                }
            }

    }
}

