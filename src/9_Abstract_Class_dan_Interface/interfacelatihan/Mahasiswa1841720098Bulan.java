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
public class Mahasiswa1841720098Bulan  {
    protected String nama;
    
    Mahasiswa1841720098Bulan(String nama){
        this.nama = nama;
    }
    
    void kuliahDiKampusBulan(){
        System.out.println("Aku Mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di Kampus");
    }
    
}
