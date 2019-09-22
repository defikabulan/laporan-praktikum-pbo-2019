/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasclasspercobaan4_1841720098Bulan;

/**
 *
 * @author acer
 */
public class MainPercobaan41841720098Bulan {

    public static void main(String[] args) {
        Penumpang1841720098Bulan p = new Penumpang1841720098Bulan("12345", "Mr. Krab");
        Penumpang1841720098Bulan budi = new Penumpang1841720098Bulan("12344", "Budi");
        Gerbong1841720098Bulan gerbong = new Gerbong1841720098Bulan("A", 10);
        gerbong.setPenumpang(p, 1);
        gerbong.setPenumpang(budi, 1);
        System.out.println(gerbong.infoBulan());
    }

}
