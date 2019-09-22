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
public class Laptop1841720098Bulan {
    private String mMerk;
    private Processor1841720098Bulan mProc;

    public Laptop1841720098Bulan() {
    }

    public Laptop1841720098Bulan(String mMerk, Processor1841720098Bulan mProc) {
        this.mMerk = mMerk;
        this.mProc = mProc;
    }
    
    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }
    
    public void setmProc(Processor1841720098Bulan mProc) {
        this.mProc = mProc;
    }
    
    public String getmMerk() {
        return mMerk;
    }
    
    public Processor1841720098Bulan getmProc() {
        return mProc;
    }
    
    void infoBulan(){
        System.out.println("Merk Laptop : "+mMerk);
        mProc.infoBulan();
    }
}
