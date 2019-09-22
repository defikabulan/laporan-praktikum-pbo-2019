/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasclasstugas_1841720098Bulan;

/**
 *
 * @author acer
 */
public class Barang1841720098Bulan {

    private String nama;
    private int harga;
    private int stok;

    public Barang1841720098Bulan() {
    }

    public Barang1841720098Bulan(String nama, int harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void info() {
        System.out.println("Nama Barang : " + nama);
        System.out.println("Harga       : " + harga);
        System.out.println("Stok        : " + stok);
    }

}
