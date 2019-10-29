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
public class Orang1841720098Bulan {
    private String mNama;
    private Hewan1841720098Bulan mHewanPeliharaan;
    
    Orang1841720098Bulan(String nama){
        this.mNama = nama;
    }
    
    void peliharaHewanBulan(Hewan1841720098Bulan mHewanPeliharaan){
        this.mHewanPeliharaan = mHewanPeliharaan;
    }
    
    void ajakPeliharaanJalanJalanBulan(){
        System.out.println("Namaku "+this.mNama);
        System.out.println("Hewan Peliharaan ku menggunakan Cara : ");
        this.mHewanPeliharaan.bergerakBulan();
        System.out.println("--------------------------------------------------");
    }
}
