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
public class Sopir1841720098Bulan {
    private String mNama;
    private int mBiaya;

    public Sopir1841720098Bulan() {
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public void setmBiaya(int mBiaya) {
        this.mBiaya = mBiaya;
    }

    public String getmNama() {
        return mNama;
    }

    public int getmBiaya() {
        return mBiaya;
    }
    
    
    int hitungBiayaSopirBulan(int hari){
        return mBiaya*hari;
    }
}
