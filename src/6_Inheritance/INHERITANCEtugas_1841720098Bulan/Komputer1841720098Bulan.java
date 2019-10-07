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
public class Komputer1841720098Bulan {

    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;

    public Komputer1841720098Bulan() {
    }

    public Komputer1841720098Bulan(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    void tampilDataBulan() {
        System.out.println("Merk               : " + merk);
        System.out.println("Kecepatan Prosesor : " + kecProsesor);
        System.out.println("Size Memory        : " + sizeMemory);
        System.out.println("Jenis Prosesor     : " + jnsProsesor);
    }

}
