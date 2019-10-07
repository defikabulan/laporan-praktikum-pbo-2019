/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.INHERITANCEpercobaan5_1841720098Bulan;

/**
 *
 * @author acer
 */
public class Staff1841720098Bulan extends Karyawan1841720098Bulan {

    public int lembur, potongan;

    public Staff1841720098Bulan() {
    }

    public Staff1841720098Bulan(int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }

    void tampilDataStaffBulan() {
        super.tampilDataKaryawanBulan();
        System.out.println("Lembur      : " + lembur);
        System.out.println("Potongan    : " + potongan);
        System.out.println("Total Gaji  : " + (gaji + lembur - potongan));

    }

}
