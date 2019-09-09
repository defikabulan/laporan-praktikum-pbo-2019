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
public class TestBarang1841720098Bulan 
{
     public static void main(String[] args) 
     {
        Barang1841720098Bulan brg1 = new Barang1841720098Bulan();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = " ATK";
        brg1.stok = 10;
        brg1.tampilBarangBulan();
        
        System.out.println("Stok baru adalah "+brg1.tambahStokBulan(20));
    }
    
}
