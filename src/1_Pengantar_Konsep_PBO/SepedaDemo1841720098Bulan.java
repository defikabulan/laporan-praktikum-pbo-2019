/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SepedaDemo2;

/**
 *
 * @author acer
 */
public class SepedaDemo1841720098Bulan { 
    public static void main(String[] args) {
        Sepeda1841720098Bulan spd1 = new Sepeda1841720098Bulan();
        Sepeda1841720098Bulan spd2 = new Sepeda1841720098Bulan();
        SepedaGunung1841720098Bulan spd3 = new SepedaGunung1841720098Bulan();
        
        spd1.setMerekBulan("Polygone");
        spd1.tambahKecepatanBulan(10);
        spd1.gantiGearBulan(2);
        spd1.setWarnaBulan("Hitam");
        spd1.cetakStatusBulan();
        
        spd2.setMerekBulan("Wiim Cycle");
        spd2.tambahKecepatanBulan(10);
        spd2.gantiGearBulan(2);
        spd2.tambahKecepatanBulan(10);
        spd2.gantiGearBulan(3);
        spd2.setWarnaBulan("Biru");
        spd2.cetakStatusBulan();
        
        spd3.setMerekBulan("Klinee");
        spd3.tambahKecepatanBulan(5);
        spd3.gantiGearBulan(7);
        spd3.setTipeSuspensiBulan("Gas Suspensi");
        spd3.setWarnaBulan("Pink");
        spd3.cetakStatusBulan();
        
    }
}
