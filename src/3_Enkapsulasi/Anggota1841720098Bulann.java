/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author acer
 */
public class Anggota1841720098Bulann {
    private String mNama;
    private String mNomorKtp;
    private int mLimitPinjam;
    private int mJumlahPinjam;

    Anggota1841720098Bulann (String nomorKtp, String nama, int limitPinjam) {
        this.mNama = nama;
        this.mNomorKtp = nomorKtp;
        this.mLimitPinjam = limitPinjam;
    }

    String getNamaBulan() {
        return mNama;
    }

    int getLimitPinjamBulan() {
        return mLimitPinjam;
    }

    int getJumlahPinjamanBulan() {
        return mJumlahPinjam;
    }
    
    void pinjamBulan(int pinjam){
        if(pinjam>mLimitPinjam){
            System.out.println("Maaf Pinjaman Melebihi Limit");
        } else {
            mJumlahPinjam += pinjam;
        }
    }
    
    void AngsuranBulan(int Angsuran ){
        if(Angsuran<(mJumlahPinjam*0.1)){
            System.out.println("Maaf, Angsuran harus 10% dari jumlah pinjam");
        }else{
            mJumlahPinjam-=Angsuran;
        }
    }
    
}
