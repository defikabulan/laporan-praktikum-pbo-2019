/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

/**
 *
 * @author acer
 */
public abstract class Hewan1841720098Bulan {
    private int umur;
    
    protected Hewan1841720098Bulan(){
        this.umur = 0;
    }
    
    void bertambahUmurBulan(){
        this.umur += 1;
    }
    abstract void bergerakBulan();
    
}
