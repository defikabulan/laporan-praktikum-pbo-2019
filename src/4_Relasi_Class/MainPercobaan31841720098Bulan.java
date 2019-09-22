/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasclasspercobaan3_1841720098Bulan;

/**
 *
 * @author acer
 */
public class MainPercobaan31841720098Bulan {
    public static void main(String[] args) {
        Pegawai1841720098Bulan masinis = new Pegawai1841720098Bulan("1234", "Spongebob Squarepants");
        Pegawai1841720098Bulan asisten = new Pegawai1841720098Bulan("4567", "Patrick Star"); 
    
        KeretaApi1841720098Bulan keretaApi = new KeretaApi1841720098Bulan("Gaya Baru", "Bisnis", masinis, asisten); 
 
        System.out.println(keretaApi.infoBulan());
    }
    
}
