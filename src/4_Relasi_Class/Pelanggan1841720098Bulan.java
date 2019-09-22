/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasclasspercobaan2_1841720098Bulan;

/**
 *
 * @author acer
 */
public class Pelanggan1841720098Bulan {
    private String mNama;
    private Mobil1841720098Bulan mMobil;
    private Sopir1841720098Bulan mSopir;
    private int mHari;

    public Pelanggan1841720098Bulan() {
    }

    public void setmHariBulan(int mHari) {
        this.mHari = mHari;
    }

    public void setmNamaBulan(String mNama) {
        this.mNama = mNama;
    }

    public void setmMobilBulan(Mobil1841720098Bulan mMobil) {
        this.mMobil = mMobil;
    }

    public void setmSopirBulan(Sopir1841720098Bulan mSopir) {
        this.mSopir = mSopir;
    }

    public String getmNamaBulan() {
        return mNama;
    }

    public Mobil1841720098Bulan getmMobilBulan() {
        return mMobil;
    }

    public Sopir1841720098Bulan getmSopirBulan() {
        return mSopir;
    }

    public int getmHariBulan() {
        return mHari;
    }
    
    
    int hitungBiayaTotalBulan(){
        return mSopir.hitungBiayaSopirBulan(mHari) +
               mMobil.hitungBiayaMobilBulan(mHari);
    }
  
    
}
