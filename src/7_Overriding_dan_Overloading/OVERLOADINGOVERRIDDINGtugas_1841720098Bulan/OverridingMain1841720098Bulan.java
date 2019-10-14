/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.OVERLOADINGOVERRIDDINGtugas_1841720098Bulan;

/**
 *
 * @author acer
 */
public class OverridingMain1841720098Bulan {

    public static void main(String[] args) {
        Manusia1841720098Bulan mn = new Manusia1841720098Bulan();
        Dosen1841720098Bulan ds = new Dosen1841720098Bulan();
        Mahasiswa1841720098Bulan mh = new Mahasiswa1841720098Bulan();

        mn.makanBulan();
        mn.bernafasBulan();
        ds.makanBulan();
        ds.lemburBulan();
        mh.makanBulan();
        mh.tidurBulan();

    }
}
