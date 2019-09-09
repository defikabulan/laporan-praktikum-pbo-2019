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
public class Barang1841720098Bulan 
{
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    void tampilBarangBulan()
    {
        System.out.println("Nama Barang : "+namaBrg);
        System.out.println("Jenis Barang : "+jenisBrg);
        System.out.println("Stok : "+stok);
    }
    
    public int tambahStokBulan(int brgMasuk)
    {
        int stokBaru = brgMasuk+stok;
        return stokBaru;
    }
}
