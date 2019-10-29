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
public class Rektor1841720098Bulan {
    void beriSertifikatCumlaudeBulan(ICumlaude1841720098Bulan mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude");
        System.out.println("Selamat! silahkan perkenalkan diri anda..");
        
        mahasiswa.lulusBulan();
        mahasiswa.meraihIPKTinggiBulan();
        
        System.out.println("-----------------------------------------------");
    }
    
    void beriSertifikatMawapresBulan(IBerprestasi1841720098Bulan mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana Anda Bisa Berprestasi ?");
        
        mahasiswa.menjuaraiKompetisiBulan();
        mahasiswa.membuatPublikasiIlmiahBulan();
        
        System.out.println("-----------------------------------------------");
    }
    
}
