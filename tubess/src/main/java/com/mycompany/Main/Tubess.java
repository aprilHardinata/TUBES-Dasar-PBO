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
        System.out.println("1. lihat barang sebelum checkout");
        System.out.println("2. checkout");
        System.out.print("Masukkan pilihan: ");
    }
}

class menuPenjual{
    public static void menu(){
        System.out.println("-----------------E-commerce-----------------");
        System.out.println("1. lihat barang sebelum checkout");
        System.out.println("2. checkout");
        System.out.print("Masukkan pilihan: ");
    }
}

public class Tubess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Produk> dataProduk = new ArrayList<>();
        
        Pembeli pembeli = new Pembeli("Angga", "anggaKetua", "Sukabirus", 1111, "Angga@gmail.com");
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
                                case 1 -> pembeli.lihatBarang(dataProduk);
                                case 2 -> pembeli.checkout(dataProduk);
                                case 3 -> System.out.println("Logout sebagai pembeli.");
                                default -> System.out.println("Pilihan tidak valid.");
                            }
                        }
                    }
                    case 2 -> {
                        int pilihanPenjual = -1;
                        while (pilihanPenjual != 3) { 
                            menuPenjual.menu(); 
                            pilihanPenjual = scanner.nextInt();

                            switch (pilihanPenjual) {
                                case 1 -> penjual.tambahBarang(); 
                                case 2 -> penjual.lihatBarang();
                                case 3 -> System.out.println("Logout sebagai penjual."); 
                                default -> System.out.println("Pilihan tidak valid.");
                            }
                        }
                    }
                    case 3 -> System.out.println("Keluar dari aplikasi."); // Keluar dari aplikasi
                    default -> System.out.println("Pilihan tidak valid.");
                }
            }

    }
}

