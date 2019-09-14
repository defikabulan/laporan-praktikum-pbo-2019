/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoperasiGetterSetter;

/**
 *
 * @author acer
 */
public class EncapDemo1841720098Bulan {
    private String mNama;
    private int mAge;
    
    String getNamaBulan(){
        return mNama;
    }
    void setNamaBulan(String newNama){
        mNama = newNama;
    }
    int getAgeBulan(){
        return mAge;
    } 
    void setAgeBulan(int newAge){
        if(newAge>18 && newAge<30){
            mAge = newAge;
        }
        else{
            System.out.println("Umur kurang dari 18 atau lebih dari 30");
            mAge = newAge;
        }
    }
}
