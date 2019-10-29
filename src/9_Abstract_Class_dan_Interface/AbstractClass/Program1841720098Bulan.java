/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

/**
 *
 * @author acer
 */
public class Program1841720098Bulan {
    public static void main(String[] args) {
        Kucing1841720098Bulan kucingKampung = new Kucing1841720098Bulan();
        Ikan1841720098Bulan lumbalumba = new Ikan1841720098Bulan();
        
        Orang1841720098Bulan ani = new Orang1841720098Bulan("Ani");
        Orang1841720098Bulan budi = new Orang1841720098Bulan("Budi");
        
        ani.peliharaHewanBulan(kucingKampung);
        budi.peliharaHewanBulan(lumbalumba);
        
        ani.ajakPeliharaanJalanJalanBulan();
        budi.ajakPeliharaanJalanJalanBulan();

    }
    
}
