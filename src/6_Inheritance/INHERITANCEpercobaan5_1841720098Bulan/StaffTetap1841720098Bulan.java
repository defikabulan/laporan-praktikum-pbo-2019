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
public class StaffTetap1841720098Bulan extends Staff1841720098Bulan{
    
    public String golongan;
    public int asuransi;

    public StaffTetap1841720098Bulan() {
    }

    public StaffTetap1841720098Bulan(String golongan, int asuransi, int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    
    void tampilStaffTetapBulan(){
        System.out.println("=================== Data Staff Tetap ===================");
        super.tampilDataStaffBulan();
        System.out.println("Golongan        : "+golongan);
        System.out.println("Jumlah Asuransi : "+asuransi);
        System.out.println("Gaji Bersih     : "+(gaji+lembur-potongan-asuransi));
    }
    
}
