/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme;

/**
 *
 * @author acer
 */
public class IntershipEmployee1841720098Bulan extends Employee1841720098Bulan{
    private int mLength;
    
    IntershipEmployee1841720098Bulan(String name, int length){
        this.name = name;
        this.mLength = length;
    }

    public int getmLengthBulan() {
        return mLength;
    }

    public void setmLengthBulan(int mLength) {
        this.mLength = mLength;
    }
    
    @Override
    public String getEmployeeInfoBulan(){
        String info = super.getEmployeeInfoBulan()+"\n";
        info += "Terdaftar sebagai pegawai intership untuk "+mLength+"bulan/s\n";
        return info;
    }

      
    
    
    
    
    
    
    
}
