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
public class Laptop1841720098Bulan extends Komputer1841720098Bulan {

    public String jnsBatrei;

    public Laptop1841720098Bulan() {
    }

    public Laptop1841720098Bulan(String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }

    void tampilLaptopBulan() {
        super.tampilDataBulan();
        System.out.println("Jenis Batrei : " + jnsBatrei);
    }

}
