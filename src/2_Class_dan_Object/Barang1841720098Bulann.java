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
public class Barang1841720098Bulann 
{
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    int hitungHargaJualBulan()
    {
        return (int) (hargaDasar-((diskon*hargaDasar)/100));
    }
    
    void tampilDataBulan()
    {
        System.out.println("Kode : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Dasar : "+hargaDasar);
        System.out.println("Diskon : "+diskon);
        System.out.println("Harga Jual : "+hitungHargaJualBulan());
    }
}
