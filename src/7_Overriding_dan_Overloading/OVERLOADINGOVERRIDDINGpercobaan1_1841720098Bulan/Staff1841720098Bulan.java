/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.OVERLOADINGOVERRIDDINGpercobaan1_1841720098Bulan;

/**
 *
 * @author acer
 */
public class Staff1841720098Bulan extends Karyawan1841720098Bulan {

    private int mLembur;
    private double mGajiLembur;

    public void setmLemburBulan(int mLembur) {
        this.mLembur = mLembur;
    }

    public int getmLemburBulan() {
        return mLembur;
    }

    public void setmGajiLemburBulan(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }

    public double getmGajiLemburBulan() {
        return mGajiLembur;
    }

    double getmGajiBulan(int lembur, double gajiLembur) {
        return super.getmGajiBulan() + lembur * gajiLembur;
    }

    @Override
    public double getmGajiBulan() {
        return super.getmGajiBulan() + mLembur * mGajiLembur;
    }

    void lihatInfoBulan() {
        System.out.println("NIP : "+this.getmNipBulan());
        System.out.println("Nama : "+this.getmNamaBulan());
        System.out.println("Golongan : "+this.getmGolonganBulan());
        System.out.println("Jml Lembur : "+this.getmLemburBulan());
        System.out.printf("Gaji Lembur :%.0f\n",this.getmGajiLemburBulan());
        System.out.printf("Gaji :%.0f\n",this.getmGajiBulan());
    }

}
