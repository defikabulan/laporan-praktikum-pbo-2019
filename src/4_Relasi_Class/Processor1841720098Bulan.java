/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasclasspercobaan1_1841720098Bulan;

/**
 *
 * @author acer
 */
public class Processor1841720098Bulan {
    private String mMerk;
    private double mCache;

    public Processor1841720098Bulan() {
    }
    
    public Processor1841720098Bulan(String mMerk, double mCache) {
        this.mMerk = mMerk;
        this.mCache = mCache;
    }
    
    public void setmMerkBulan(String mMerk) {
        this.mMerk = mMerk;
    }
    
    public void setmCacheBulan(double mCache) {
        this.mCache = mCache;
    }
    
    public double getmCacheBulan() {
        return mCache;
    }
    
    public String getmMerkBulan() {
        return mMerk;
    }
    
    void infoBulan(){
        System.out.printf("Merk Processor = %s\n", mMerk);
        System.out.printf("Cache Memory = %.2f\n",mCache);
    }
}
