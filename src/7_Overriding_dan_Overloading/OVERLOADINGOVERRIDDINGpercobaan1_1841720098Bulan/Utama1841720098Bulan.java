/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.OVERLOADINGOVERRIDDINGpercobaan1_1841720098Bulan;

/**
 *
 * @author acer
 */
public class Utama1841720098Bulan {

    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        Manager1841720098Bulan man[] = new Manager1841720098Bulan[2];
        Staff1841720098Bulan staff1[] = new Staff1841720098Bulan[2];
        Staff1841720098Bulan staff2[] = new Staff1841720098Bulan[3];
        
        System.out.println();
        man[0] = new Manager1841720098Bulan();
        man[0].setmNamaBulan("Tedjo");
        man[0].setmNipBulan("101");
        man[0].setmGolonganBulan("1");
        man[0].setmTunjanganBulan(5000000);
        man[0].setmBagianBulan("Administrasi");
        
        System.out.println();
        man[1] = new Manager1841720098Bulan();
        man[1].setmNamaBulan("Atika");
        man[1].setmNipBulan("102");
        man[1].setmGolonganBulan("1");
        man[1].setmTunjanganBulan(2500000);
        man[1].setmBagianBulan("Pemasran");
        
        System.out.println();
        staff1[0] = new Staff1841720098Bulan();
        staff1[0].setmNamaBulan("Usman");
        staff1[0].setmNipBulan("0003");
        staff1[0].setmGolonganBulan("2");
        staff1[0].setmLemburBulan(10);
        staff1[0].setmGajiLemburBulan(10000);
        
        System.out.println();
        staff1[1] = new Staff1841720098Bulan();
        staff1[1].setmNamaBulan("Anugrah");
        staff1[1].setmNipBulan("0005");
        staff1[1].setmGolonganBulan("2");
        staff1[1].setmLemburBulan(10);
        staff1[1].setmGajiLemburBulan(55000);
        man[0].setStBulan(staff1);
        
        System.out.println();
        staff2[0] = new Staff1841720098Bulan();
        staff2[0].setmNamaBulan("Hendra");
        staff2[0].setmNipBulan("0004");
        staff2[0].setmGolonganBulan("3");
        staff2[0].setmLemburBulan(15);
        staff2[0].setmGajiLemburBulan(5500);
        
        System.out.println();
        staff2[1] = new Staff1841720098Bulan();
        staff2[1].setmNamaBulan("Arie");
        staff2[1].setmNipBulan("0006");
        staff2[1].setmGolonganBulan("4");
        staff2[1].setmLemburBulan(5);
        staff2[1].setmGajiLemburBulan(100000);
        
        System.out.println();
        staff2[2] = new Staff1841720098Bulan();
        staff2[2].setmNamaBulan("Mentari");
        staff2[2].setmNipBulan("0007");
        staff2[2].setmGolonganBulan("3");
        staff2[2].setmLemburBulan(6);
        staff2[2].setmGajiLemburBulan(20000);
        man[1].setStBulan(staff2);
        
        System.out.println();
        man[0].lihatInfoBulan();
        man[1].lihatInfoBulan();

    }

}
