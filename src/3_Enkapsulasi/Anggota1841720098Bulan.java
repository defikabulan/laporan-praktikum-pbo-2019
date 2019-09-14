/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoperasiGetterSetter;

/**
 *
 * @author acer
 */
public class Anggota1841720098Bulan {
    private String mNama;
    private String mAlamat;
    private float mSimpanan;
    
    Anggota1841720098Bulan(String nama, String alamat){
        this.mNama = nama;
        this.mAlamat = alamat;
        this.mSimpanan = 0;
    }
    void setNamaBulan(String nama){
        this.mNama = nama;
    }
    void setAlamatBulan(String alamat){
        this.mAlamat = alamat;
    }
    String getNamaBulan(){
        return mNama;
    }
    String getAlamatBulan(){
        return mAlamat;
    }
    float getSimpananBulan(){
        return mSimpanan;
    }
    void setorBulan(float uang){
        mSimpanan += uang;
    }
    void pinjamBulan(float uang){
        mSimpanan -= uang;
    }
}
