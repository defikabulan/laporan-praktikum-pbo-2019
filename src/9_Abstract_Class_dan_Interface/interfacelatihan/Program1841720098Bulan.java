/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author acer
 */
public class Program1841720098Bulan {
    public static void main(String[] args) {
        
        Rektor1841720098Bulan pakRektor = new Rektor1841720098Bulan();
        
        Mahasiswa1841720098Bulan mahasiswaBiasa = new Mahasiswa1841720098Bulan("Charlie");
        Sarjana1841720098Bulan sarjanaCumlaude = new Sarjana1841720098Bulan("Dini");
        PascaSarjana1841720098Bulan masterCumlaude = new PascaSarjana1841720098Bulan("Elok");
        
       
       //pakRektor.beriSertifikatCumlaudeBulan(mahasiswaBiasa);
       pakRektor.beriSertifikatCumlaudeBulan(sarjanaCumlaude);
       pakRektor.beriSertifikatCumlaudeBulan(masterCumlaude);
      
       //pakRektor.beriSertifikatMawapresBulan(masterCumlaude);
       //pakRektor.beriSertifikatMawapresBulan(sarjanaCumlaude);
       
       
        
    
    }
    
}
