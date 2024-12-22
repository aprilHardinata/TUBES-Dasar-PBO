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
   private Kurir kurirTerpilih;
   private ArrayList<Produk> dataProduk;

    public Penjual(String idUser, String User_name, String password, ArrayList<Produk> dataProduk) {
        super(User_name, password);
        this.idUser = idUser;
        this.dataProduk = dataProduk;
    }
    

    public ArrayList<Produk> getDataProduk() {
        return dataProduk;
    }

    @Override
    public void login(String username, String password) {
        if (getUser_name().equals(username) && getPassword().equals(password)) {
            System.out.println(super.toString());
        } else {
            throw new SecurityException("Username atau password salah!");
        }
    }

    @Override
    public void logout() {
        System.out.println("Logout berhasil sebagai Pembeli: " + getUser_name());
    }
    
   public void tambahBarang() { 
    Scanner scanner = new Scanner(System.in);

    // Generate ID produk secara otomatis berdasarkan ID yang belum ada
    int idBarang = 1; 
    // Cari ID yang belum digunakan
    for (Produk p : dataProduk) {
        if (p.getId() == idBarang) {
            idBarang++;
        }
    }

    System.out.print("Masukkan kode barang: ");
    int kodeBarang = Integer.parseInt(scanner.nextLine()); // Gunakan nextLine() dan parsing untuk menghindari masalah newline

    System.out.print("Masukkan nama barang: ");
    String namaBarang = scanner.nextLine();

    System.out.print("Masukkan jenis barang: ");
    String jenisBarang = scanner.nextLine();

    System.out.print("Masukkan harga barang: ");
    double hargaBarang = Double.parseDouble(scanner.nextLine()); // Parsing harga barang

    System.out.print("Masukkan stok barang: ");
    int stok = Integer.parseInt(scanner.nextLine()); // Parsing stok barang

    // Membuat objek produk baru
    Produk produkBaru = new Produk(idBarang, kodeBarang, namaBarang, jenisBarang, hargaBarang, stok);

    // Menambahkan produk baru ke daftar produk
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
            System.out.println("Harga: " + String.format("%.0f", produk.getHargaBarang()));
            System.out.println("Stok: "+ produk.getStok());
            System.out.println("----------------------------");
        }
    }
}

