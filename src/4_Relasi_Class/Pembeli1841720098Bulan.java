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
public class Pembeli1841720098Bulan {

    private Barang1841720098Bulan[] barang;
    private Kode1841720098Bulan[] kode;
    private int totalBarang;
    private int totalHarga;

    public Pembeli1841720098Bulan() {
    }

    public Pembeli1841720098Bulan(int totalBarang, int totalHarga) {
        this.totalBarang = totalBarang;
        this.totalHarga = totalHarga;
    }

    public Barang1841720098Bulan[] getBarang() {
        return barang;
    }

    public void setBarang(Barang1841720098Bulan[] barang) {
        this.barang = barang;
    }

    public Kode1841720098Bulan[] getKode() {
        return kode;
    }

    public void setKode(Kode1841720098Bulan[] kode) {
        this.kode = kode;
    }

    public int getTotalBarang() {
        return totalBarang;
    }

    public void setTotalBarang(int totalBarang) {
        this.totalBarang = totalBarang;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    public int hitungBiaya() {
        return totalBarang * totalHarga;
    }

    public void info() {
        System.out.println("Total Barang : " + totalBarang);
    }

}
