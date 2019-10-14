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
public class Karyawan1841720098Bulan {

    private String mNama;
    private String mNip;
    private String mGolongan;
    private double mGaji;

    public void setmNamaBulan(String mNama) {
        this.mNama = mNama;
    }

    public void setmNipBulan(String mNip) {
        this.mNip = mNip;
    }

    public void setmGolonganBulan(String mGolongan) {
        this.mGolongan = mGolongan;

        switch (mGolongan.charAt(0)) {
            case '1':
                this.mGaji = 5000000;
                break;
            case '2':
                this.mGaji = 3000000;
                break;
            case '3':
                this.mGaji = 2000000;
                break;
            case '4':
                this.mGaji = 1000000;
                break;
            case '5':
                this.mGaji = 750000;
                break;
        }
    }

    public void setmGajiBulan(double mGaji) {
        this.mGaji = mGaji;
    }

    public String getmNamaBulan() {
        return mNama;
    }

    public String getmNipBulan() {
        return mNip;
    }

    public String getmGolonganBulan() {
        return mGolongan;
    }

    public double getmGajiBulan() {
        return mGaji;
    }
    
    

}
