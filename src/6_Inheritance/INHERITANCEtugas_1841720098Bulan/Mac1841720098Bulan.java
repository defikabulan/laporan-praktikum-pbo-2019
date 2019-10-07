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
public class Mac1841720098Bulan extends Laptop1841720098Bulan {

    public String security;

    public Mac1841720098Bulan() {
    }

    public Mac1841720098Bulan(String security, String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(jnsBatrei, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.security = security;
    }
    
    void tampilMacBulan(){
        super.tampilLaptopBulan();
        System.out.println("Security : "+security);
    }

}
