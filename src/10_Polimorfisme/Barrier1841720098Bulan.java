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
public class Barrier1841720098Bulan implements Destroyable1841720098Bulan{
    
    private int strength;
    
    public Barrier1841720098Bulan (int strength){
        this.strength = strength;
    }
    public void setStrengthBulan(int strength){
        this.strength = strength;
    }
    public int getStrengthBulan (){
        return strength;
    } 
    public void destroyBulan(){
        strength -= strength*0.1;
    }  
    @Override
    public void destroyedBulan(){
        destroyBulan();
    }
    public String getBarrierInfoBulan(){
        return "Barrier Strength = "+strength+"\n";
    }
    
   
    
}
