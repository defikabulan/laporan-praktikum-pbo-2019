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
public class StaffHarian1841720098Bulan extends Staff1841720098Bulan {

    public int jmlJamKerja;

    public StaffHarian1841720098Bulan() {
    }

    public StaffHarian1841720098Bulan(int jmlJamKerja, int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.jmlJamKerja = jmlJamKerja;
    }

    void tampilStaffHarianBulan() {
        System.out.println("=================== Data Staff Harian ===================");
        super.tampilDataStaffBulan();
        System.out.println("Jumlah Jam Kerja : " + jmlJamKerja);
        System.out.println("Gaji Bersih      : " + (gaji * jmlJamKerja + lembur - potongan));

    }

}
