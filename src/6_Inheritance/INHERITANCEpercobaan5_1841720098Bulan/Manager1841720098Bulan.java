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
public class Manager1841720098Bulan extends Karyawan1841720098Bulan {

    public int tunjangan;

    public Manager1841720098Bulan() {
    }

    void tampilDataManagerBulan() {
        super.tampilDataKaryawanBulan();
        System.out.println("Tunjangan  : " + tunjangan);
        System.out.println("Total Gaji : " + (super.gaji + tunjangan));
    }
}
