/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.INHERITANCEtugas_1841720098Bulan;

/**
 *
 * @author acer
 */
public class Tugas1841720098Bulan {
    public static void main(String[] args) {
        
        Pc1841720098Bulan pc = new Pc1841720098Bulan();
        pc.merk = "Acer";
        pc.kecProsesor = 20;
        pc.sizeMemory = 32;
        pc.jnsProsesor = "Intel";
        pc.ukuranMonitor = 24;
        pc.tampilPcBulan();
        
        System.out.println();
        
        Windows1841720098Bulan w = new Windows1841720098Bulan();
        w.merk = "Windows";
        w.kecProsesor = 20;
        w.sizeMemory = 32;
        w.jnsProsesor = "Intel";
        w.jnsBatrei = "Tanam";
        w.fitur = "Keynote";
        w.tampilWindowsBulan();
        
        System.out.println();
        Mac1841720098Bulan m = new Mac1841720098Bulan();
        m.merk = "Mac Pro";
        m.kecProsesor = 20;
        m.sizeMemory = 64;
        m.jnsProsesor = "IOS";
        m.jnsBatrei = "Tanam";
        m.security = "Password";
        m.tampilMacBulan();
        
    }
    
}
