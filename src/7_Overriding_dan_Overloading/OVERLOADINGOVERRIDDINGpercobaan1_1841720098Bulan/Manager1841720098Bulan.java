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
public class Manager1841720098Bulan extends Karyawan1841720098Bulan {

    private double mTunjangan;
    private String mBagian;
    private Staff1841720098Bulan st[];

    public void setmTunjanganBulan(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public double getmTunjanganBulan() {
        return mTunjangan;
    }

    public void setmBagianBulan(String mBagian) {
        this.mBagian = mBagian;
    }

    public String getmBagianBulan() {
        return mBagian;
    }

    public void setStBulan(Staff1841720098Bulan[] st) {
        this.st = st;
    }

    void viewStaff1841720098Bulan() {
        int i;
        System.out.println("------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfoBulan();
        }
        System.out.println("------------");
    }

    void lihatInfoBulan() {
        System.out.println("Manager : " + this.getmBagianBulan());
        System.out.println("NIP : " + this.getmNipBulan());
        System.out.println("Nama : " + this.getmNamaBulan());
        System.out.println("Golongan : " + this.getmGolonganBulan());
        System.out.printf("Tunjangan :%.0f\n", this.getmTunjanganBulan());
        System.out.printf("Gaji : %.0f\n", this.getmGajiBulan());
        System.out.println("Bagian : " + this.getmBagianBulan());
        this.viewStaff1841720098Bulan();
    }

    double getGajiBulan() {
        return super.getmGajiBulan() + mTunjangan;
    }

}
