/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author acer
 */
public class TestBarang1841720098Bulann 
{
    public static void main(String[] args) 
    {
       Barang1841720098Bulann brg = new Barang1841720098Bulann(); 
       
       brg.namaBarang = "Sepatu Adidas";
       brg.kode = "SA";
       brg.hargaDasar = 500000;
       brg.diskon = 15;
       brg.hitungHargaJualBulan();
        System.out.println("");
        brg.tampilDataBulan();
       
    }
}
