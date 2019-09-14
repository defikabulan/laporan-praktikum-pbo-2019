/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoperasiGetterSetter;

/**
 *
 * @author acer
 */
public class KoperasiDemo1841720098Bulan {
    public static void main(String[] args) {
        Anggota1841720098Bulan anggota1 = new Anggota1841720098Bulan("Iwan","Jalan Mawar");
        System.out.println("Simpanan "+anggota1.getNamaBulan()+" : Rp "+anggota1.getSimpananBulan());
        
        anggota1.setNamaBulan("Iwan Setiawan");
        anggota1.setAlamatBulan("Jl.Soekarno Hatta no 10");
        anggota1.setorBulan(100000);
        System.out.println("Simpanan "+anggota1.getNamaBulan()+" : Rp "+anggota1.getSimpananBulan());
        
        anggota1.pinjamBulan(5000);
        System.out.println("Simpanan "+anggota1.getNamaBulan()+" : Rp "+anggota1.getSimpananBulan());
    }
}
