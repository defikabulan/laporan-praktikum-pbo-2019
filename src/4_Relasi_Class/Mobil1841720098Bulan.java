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
public class Mobil1841720098Bulan {

    private String mMerk;
    private int mBiaya;

    public Mobil1841720098Bulan() {
    }

    public void setmMerkBulan(String mMerk) {
        this.mMerk = mMerk;
    }

    public void setmBiayaBulan(int mBiaya) {
        this.mBiaya = mBiaya;
    }

    public String getmMerkBulan() {
        return mMerk;
    }

    public int getmBiayaBulan() {
        return mBiaya;
    }
    
    int hitungBiayaMobilBulan(int hari){
        return mBiaya*hari;
    }

}
