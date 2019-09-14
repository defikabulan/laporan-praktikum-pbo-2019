/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;
/**
 *
 * @author acer
 */
public class TestKoperasi1841720098Bulan {
    
    public static void main(String[] args) {
       Anggota1841720098Bulann donny = new Anggota1841720098Bulann("111333444","Donny",5000000);
       
        System.out.println("Nama Anggota : "+donny.getNamaBulan());
        System.out.println("Limit Pinjaman  : "+donny.getLimitPinjamBulan());
        
        System.out.println("\nMeminjam Uang 10.0000.000...");
        donny.pinjamBulan(10000000);
        System.out.println("Jumlah Pinjaman Saat ini : "+donny.getJumlahPinjamanBulan());
        
        
        System.out.println("\nMeminjam Uang 4.000.000");
        donny.pinjamBulan(4000000);
        System.out.println("Jumlah Pinjaman Saat ini : "+donny.getJumlahPinjamanBulan());
        
        System.out.println("\nMembayar Angsuran Sebesar 1.000.000 ");
        donny.AngsuranBulan(1000000);
        System.out.println("Jumlah Pinjaman Saat ini : "+donny.getJumlahPinjamanBulan());
        
        System.out.println("\nMembayar Angsuran Sebesar 200.000 ");
        donny.AngsuranBulan(200000);
        
        System.out.println("Jumlah Pinjaman Saat ini : "+donny.getJumlahPinjamanBulan());
    }
}
