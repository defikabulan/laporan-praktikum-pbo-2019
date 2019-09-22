/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasclasspercobaan1_1841720098Bulan;

/**
 *
 * @author acer
 */
public class MainPercobaan11841720098Bulan {
    public static void main(String[] args) {
        Processor1841720098Bulan p = new Processor1841720098Bulan("Intel i5",3);
        
        Laptop1841720098Bulan L = new Laptop1841720098Bulan("Thinkpad",p);
        
        L.infoBulan();
        
        Processor1841720098Bulan p1 = new Processor1841720098Bulan();
        
        p1.setmMerkBulan("Intel i5");
        p1.setmCacheBulan(4);
        
        Laptop1841720098Bulan L1 = new Laptop1841720098Bulan();
        L1.setmMerk("Thinkpad");
        L1.setmProc(p1);
        L1.infoBulan();
    }
}
