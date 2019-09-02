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
public class TiketDemo1841720098Bulan {
    public static void main(String[] args) {
        Tiket1841720098Bulan tkt1 = new Tiket1841720098Bulan();
        Tiket1841720098Bulan tkt2 = new Tiket1841720098Bulan();
        
        tkt1.setNamaKeretaBulan("Gajayana");
        tkt1.pilihKeretaBulan("Executive");
        tkt1.totalHarga(500000);
        tkt1.cetakStatus();
        
        System.out.println();
        
        tkt2.setNamaKeretaBulan("Malioboro");
        tkt2.pilihKeretaBulan("Economy");
        tkt2.totalHarga(145000);
        tkt2.cetakStatus();
    }
}
