/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Motorencapsulation;

/**
 *
 * @author acer
 */
public class Motor1841720098Bulan {

    private int mKecepatan = 95;
    private boolean mKontakOn = false;
    
    void nyalakanMesinBulan(){
        mKontakOn = true;
    }
    void matikanMesinBulan(){
        mKontakOn = false;
        mKecepatan = 0;
    }
    void tambahKecepatanBulan(){
        if(mKontakOn == true){
            if(mKecepatan<100){
                 mKecepatan += 5;
            }
            else{
               System.out.println("Kecepatan Maksimal");
           }
        }
        else{
            System.out.println("Kecepatan Tidak Dapat ditambah Karna Mesin Off!! \n");
        }
    }
    void kurangiKecepatanBulan(){
        if(mKontakOn == true){
            mKecepatan -= 5;
        }
        else {
            System.out.println("Kecepatan Tidak Dapat ditambah Karna Mesin Off!! \n");
        }
    }
    void printStatusBulan() {
        if (mKontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan : " + mKecepatan + "\n");
    }
}
