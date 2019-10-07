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
public class Windows1841720098Bulan extends Laptop1841720098Bulan {

    public String fitur;

    public Windows1841720098Bulan() {
    }

    public Windows1841720098Bulan(String fitur, String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(jnsBatrei, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.fitur = fitur;
    }

    void tampilWindowsBulan() {
        super.tampilLaptopBulan();
        System.out.println("Fitur : " + fitur);
    }

}
