/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.INHERITANCEpercobaan3_1841720098Bulan;

/**
 *
 * @author acer
 */
public class Tabungg1841720098Bulan extends Bangun1841720098Bulan {

    protected int t;

    void setSuperPhiBulan(double phi) {
        super.phi = phi;
    }

    void setSuperRBulan(int r) {
        super.r = r;
    }

    void setTBulan(int t) {
        this.t = t;
    }

    void volumeBulan() {
        System.out.println("Volume Tabung Adalah : " + (super.phi * super.r * super.r * this.t));
    }

}
