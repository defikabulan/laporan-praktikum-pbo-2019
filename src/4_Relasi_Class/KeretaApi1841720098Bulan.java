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
public class KeretaApi1841720098Bulan {

    private String mNama;
    private String mKelas;
    private Pegawai1841720098Bulan mMasinis;
    private Pegawai1841720098Bulan mAsisten;

    public KeretaApi1841720098Bulan(String mNama, String mKelas, Pegawai1841720098Bulan mMasinis) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
    }

    public KeretaApi1841720098Bulan(String mNama, String mKelas, Pegawai1841720098Bulan mMasinis, Pegawai1841720098Bulan mAsisten) {
        this.mNama = mNama;
        this.mKelas = mKelas;
        this.mMasinis = mMasinis;
        this.mAsisten = mAsisten;
    }

    public void setmNamaBulan(String mNama) {
        this.mNama = mNama;
    }

    public void setmKelasBulan(String mKelas) {
        this.mKelas = mKelas;
    }

    public void setmMasinisBulan(Pegawai1841720098Bulan mMasinis) {
        this.mMasinis = mMasinis;
    }

    public void setmAsistenBulan(Pegawai1841720098Bulan mAsisten) {
        this.mAsisten = mAsisten;
    }

    public String getmNamaBulan() {
        return mNama;
    }

    public String getmKelasBulan() {
        return mKelas;
    }

    public Pegawai1841720098Bulan getmMasinisBulan() {
        return mMasinis;
    }

    public Pegawai1841720098Bulan getmAsistenBulan() {
        return mAsisten;
    }

    String infoBulan() {
        String info = " ";
        info += "Nama : " + this.mNama + "\n";
        info += "Kelas : " + this.mKelas + "\n";
        info += "Masinis : " + this.mMasinis.infoBulan() + "\n";
        if(mAsisten != null){
             info += "Asisten : " + this.mAsisten.infoBulan() + "\n";
        }
        return info;
    }

}
