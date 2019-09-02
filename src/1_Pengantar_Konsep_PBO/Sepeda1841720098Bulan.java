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
public class Sepeda1841720098Bulan{
    private String mMerek;
    private int mKecepatan;
    private int mGear;
    private String mWarna;
    
    void setMerekBulan(String newValue)
    {
        mMerek = newValue;
    }
    
    void gantiGearBulan(int newValue)
    {
        mGear = newValue;
    }
    
    void tambahKecepatanBulan(int increment)
    {
        mKecepatan = mKecepatan + increment;
    }
    
    void remBulan(int decrement)
    {
        mKecepatan = mKecepatan - decrement;
    }
    
    void setWarnaBulan(String newValue)
    {
        mWarna = newValue;
    }
    
    void cetakStatusBulan()
    {
        System.out.println("Merek : "+mMerek);
        System.out.println("Kecepatan : "+mKecepatan);
        System.out.println("Gear : "+mGear);
        System.out.println("Warna : "+mWarna);
    }
}
