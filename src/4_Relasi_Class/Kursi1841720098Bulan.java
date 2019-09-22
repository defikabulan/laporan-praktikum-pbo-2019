/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasclasspercobaan4_1841720098Bulan;

/**
 *
 * @author acer
 */
public class Kursi1841720098Bulan {

    private String mNomer;
    private Penumpang1841720098Bulan mPenumpang;

    public Kursi1841720098Bulan(String mNomer) {
        this.mNomer = mNomer;
    }

    public void setmNomerBulan(String mNomer) {
        this.mNomer = mNomer;
    }

    public void setmPenumpangBulan(Penumpang1841720098Bulan mPenumpang) {
        this.mPenumpang = mPenumpang;
    }

    public String getmNomerBulan() {
        return mNomer;
    }

    public Penumpang1841720098Bulan getmPenumpang() {
        return mPenumpang;
    }

    String infoBulan() {
        String info = "";
        info += "Nomor: " + mNomer + "\n";
        if (this.mPenumpang != null) {
            info += "Penumpang: " + mPenumpang.infoBulan() + "\n";
        }
        return info;
    }

}
