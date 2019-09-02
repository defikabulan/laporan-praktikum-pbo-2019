/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SepedaDemo2;

/**
 *
 * @author acer
 */
public class Tiket1841720098Bulan 
{
    private String mNamaKereta;
    private String mJenis;
    private int mHarga;
    
    void setNamaKeretaBulan(String newValue)
    {
        mNamaKereta = newValue;
    }
    
    void pilihKeretaBulan(String newValue)
    {
        mJenis = newValue;
    }
    
    void totalHarga(int increment)
    {
        mHarga = mHarga + increment;
    }
    
    void cetakStatus()
    {
        System.out.println("Tiket Kereta Api Statsiun Malang");
        System.out.println("Nama Kereta \t\t : "+mNamaKereta);
        System.out.println("Jenis Kereta \t\t : "+mJenis);
        System.out.println("Harga\t\t\t : "+mHarga);
    }
}
