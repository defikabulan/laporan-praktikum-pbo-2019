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
public class Penumpang1841720098Bulan {

    private String mKtp;
    private String mNama;

    public Penumpang1841720098Bulan(String mKtp, String mNama) {
        this.mKtp = mKtp;
        this.mNama = mNama;
    }

    public void setmKtpBulan(String mKtp) {
        this.mKtp = mKtp;
    }

    public void setmNamaBulan(String mNama) {
        this.mNama = mNama;
    }

    public String getmKtpBulan() {
        return mKtp;
    }

    public String getmNamaBulan() {
        return mNama;
    }

    String infoBulan() {
        String info = "";
        info += "Ktp: " + mKtp + "\n";
        info += "Nama: " + mNama + "\n";
        return info;
    }

}
