/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.INHERITANCEtugas_1841720098Bulan;

/**
 *
 * @author acer
 */
public class Pc1841720098Bulan extends Komputer1841720098Bulan {

    public int ukuranMonitor;

    public Pc1841720098Bulan() {
    }

    public Pc1841720098Bulan(int ukuranMonitor, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    void tampilPcBulan() {
        super.tampilDataBulan();
        System.out.println("Ukuran Monitor : " + ukuranMonitor);
    }

}
