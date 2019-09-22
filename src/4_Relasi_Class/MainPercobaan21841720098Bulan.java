/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasclasspercobaan2_1841720098Bulan;

/**
 *
 * @author acer
 */
public class MainPercobaan21841720098Bulan {
    public static void main(String[] args) {
        
        Mobil1841720098Bulan m = new Mobil1841720098Bulan();
        m.setmMerkBulan("Avanza");
        m.setmBiayaBulan(350000);
        
        Sopir1841720098Bulan s = new Sopir1841720098Bulan();
        s.setmNama("John Doe");
        s.setmBiaya(200000);
        
        Pelanggan1841720098Bulan p = new Pelanggan1841720098Bulan();
        p.setmNamaBulan("Jane Doe");
        p.setmMobilBulan(m);
        p.setmSopirBulan(s);
        p.setmHariBulan(2);
        System.out.println("Biaya Total : "+p.hitungBiayaTotalBulan());
        
        System.out.println(p.getmMobilBulan().getmMerkBulan()); 
    } 
}
