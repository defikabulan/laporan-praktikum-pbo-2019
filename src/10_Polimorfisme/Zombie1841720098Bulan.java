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
public abstract class Zombie1841720098Bulan implements Destroyable1841720098Bulan {
    protected int health;    
    protected int level;     
    
    public String getZombieInfoBulan(){  
        return "\nHealth = "+health+"\nLevel = "+level;
    }         
    public abstract void healBulan(); 
    
    @Override
    public abstract void destroyedBulan();
    
    
    
    
       
    
    
}
