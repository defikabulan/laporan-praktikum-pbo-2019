/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.OVERLOADINGOVERRIDDINGLatihan_1841720098Bulan;

/**
 *
 * @author acer
 */
public class PerkalianKu1841720098Bulan {
    void perkalianBulan(int a, int b){
        System.out.println(a*b);
    }
    void perkalianBulan(int a, int b, int c){
        System.out.println(a*b*c);
    }
    
    public static void main(String[] args) {
        PerkalianKu1841720098Bulan objek = new PerkalianKu1841720098Bulan();
        objek.perkalianBulan(25,43);
        objek.perkalianBulan(34, 23, 56);
    }
    
}
