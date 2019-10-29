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
public class Sarjana1841720098Bulan extends Mahasiswa1841720098Bulan implements ICumlaude1841720098Bulan {
    
    Sarjana1841720098Bulan(String nama){
        super(nama);
    }
    @Override
    public void lulusBulan() {
        super.kuliahDiKampusBulan();
        System.out.println("Aku Sudah menyelesaikan Skripsi");
    }

    @Override
    public void meraihIPKTinggiBulan() {
        System.out.println("IPK-ku lebih dari 3,51");
        
    }
    
}
