/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend1841720098Bulan;
import backend1841720098Bulan.*;

/**
 *
 * @author acer
 */
public class TestBackend1841720098Bulan {
    public static void main(String[] args) {
        Kategori1841720098Bulan kat1 = new Kategori1841720098Bulan("Novel","Koleksi Buku Novel");
        Kategori1841720098Bulan kat2 = new Kategori1841720098Bulan("Referensi", "Buku referensi ilmiah");
        Kategori1841720098Bulan kat3 = new Kategori1841720098Bulan("Komik", "Komik anak-anak");
        
        kat1.saveBulan();
        kat2.saveBulan();
        kat3.saveBulan();

        kat2.setKeteranganBulan("Koleksi buku referensi ilmiah");
        kat2.saveBulan();
        
        kat3.deleteBulan();
        
        for(Kategori1841720098Bulan k : new Kategori1841720098Bulan().getAllBulan())
        {
        System.out.println("Nama: " + k.getNamaBulan()+ ", Ket: " + k.getKeteranganBulan());
        }

        for(Kategori1841720098Bulan k : new Kategori1841720098Bulan().searcBulan("ilmiah"))
        {
        System.out.println("Nama: " + k.getNamaBulan() + ", Ket: " + k.getKeteranganBulan());
        }
        
    }
    
}
