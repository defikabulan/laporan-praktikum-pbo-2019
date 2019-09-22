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
public class Penjual1841720098Bulan {

    private String nama;
    private int kode;

    public Penjual1841720098Bulan() {
    }

    public Penjual1841720098Bulan(String nama, int kode) {
        this.nama = nama;
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public void info() {
        System.out.println("Nama Penjual : " + nama);
        System.out.println("Kode Penjual : " + kode);
    }

}
