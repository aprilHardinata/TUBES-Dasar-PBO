/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Main;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Penjual extends Login implements IUserActions{
    
    private String idUser;
    ArrayList<Produk> dataProduk = new ArrayList<>();

    public Penjual(String idUser, Produk dataProduk, String User_name, String password) {
        super(User_name, password);
        this.idUser = idUser;
    }
    

    public ArrayList<Produk> getDataProduk() {
        return dataProduk;
    }

    @Override
    public void login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void logout() {
        
    }
    
    public void tambahBarang() {
        Scanner scanner = new Scanner(System.in);

        int idBarang = dataProduk.size() + 1;

        System.out.println("Masukkan harga produk: ");
        int kodeBarang = scanner.nextInt();

        System.out.println("Masukkan stok produk: ");
        String namaBarang = scanner.nextLine();
        
        System.out.println("Masukkan nama jenis barang: ");
        String jenisBarang = scanner.nextLine();

        System.out.println("Masukkan harga harga: ");
        double hargaBarang = scanner.nextDouble();

        System.out.println("Masukkan harga stok: ");
        int stok = scanner.nextInt();         

        Produk produkBaru = new Produk(idBarang,kodeBarang,namaBarang,jenisBarang,hargaBarang,stok);

        dataProduk.add(produkBaru);

        System.out.println("Produk berhasil ditambahkan!");
    }
    
    public void updateBarang() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan ID produk yang ingin diupdate: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        
        boolean found = false;
        for (Produk produk : dataProduk) {
            if (produk.getId() == id) {
                System.out.println("Masukkan nama baru: ");
                String namaBaru = scanner.nextLine();

                System.out.println("Masukkan harga baru: ");
                double hargaBaru = scanner.nextDouble();

                produk.setNama(namaBaru);
                produk.setHarga(hargaBaru);

                System.out.println("Produk berhasil diupdate!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Produk tidak ditemukan.");
        }
    }
    
    public void deleteBarang() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan ID produk yang ingin dihapus: ");
        int id = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < dataProduk.size(); i++) {
            if (dataProduk.get(i).getId() == id) {
                dataProduk.remove(i);
                System.out.println("Produk berhasil dihapus!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Produk tidak ditemukan.");
        }
    }
    
    public void lihatBarang(){
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

