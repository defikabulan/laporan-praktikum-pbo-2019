/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class TestLingkaran1841720098Bulan 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      Lingkaran1841720098Bulan l = new Lingkaran1841720098Bulan();
      
        System.out.print("Masukkan Nilai r : ");
        l.r = sc.nextDouble();
        System.out.println("Luas Lingkaran : "+l.hitungLuasBulan());
        System.out.println("Keliling Lingkaran : "+l.hitungKelilingBulan());
    }
}
