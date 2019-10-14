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
public class PerkalianKu1841720098Bulann {
    void perkalianBulan(int a, int b){
        System.out.println(a*b);
    }
    void perkalianBulan(double a, double b){
        System.out.println(a*b);
    }
    
    public static void main(String[] args) {
        PerkalianKu1841720098Bulann objek = new PerkalianKu1841720098Bulann();
        objek.perkalianBulan(25,43);
        objek.perkalianBulan(34.56,23.7);
    }
    
    
}
