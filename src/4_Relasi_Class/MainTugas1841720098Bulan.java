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
public class MainTugas1841720098Bulan {

    public static void main(String[] args) {
        Penjual1841720098Bulan p = new Penjual1841720098Bulan();
        p.setNama("Adriani");
        p.setKode(1234);
        p.info();

        Barang1841720098Bulan b = new Barang1841720098Bulan();
        b.setNama("Rinso Sabun Cuci");
        b.setHarga(20000);
        b.setStok(5);
        b.info();

        Kode1841720098Bulan kb = new Kode1841720098Bulan();
        kb.setKode("RSC001");

        Pembeli1841720098Bulan pm = new Pembeli1841720098Bulan();
        pm.setTotalBarang(2);
        pm.setTotalHarga(20000);
        pm.info();
        System.out.println("Total bayar : " + pm.hitungBiaya());

    }
}
