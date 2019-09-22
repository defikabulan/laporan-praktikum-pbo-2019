/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasclasspercobaan3_1841720098Bulan;

/**
 *
 * @author acer
 */
public class Pegawai1841720098Bulan {

    private String mNip;
    private String mNama;

    public Pegawai1841720098Bulan(String mNip, String mNama) {
        this.mNip = mNip;
        this.mNama = mNama;
    }

    public void setmNipBulan(String mNip) {
        this.mNip = mNip;
    }

    public void setmNamaBulan(String mNama) {
        this.mNama = mNama;
    }

    public String getmNipBulan() {
        return mNip;
    }

    public String getmNamaBulan() {
        return mNama;
    }

    String infoBulan() {
        String infoBulan = "";
        infoBulan += "Nip : " + this.mNip + "\n";
        infoBulan += "Nama : " + this.mNama + "\n";
        return infoBulan;

    }
}
