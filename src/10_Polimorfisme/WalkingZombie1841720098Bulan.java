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
public class WalkingZombie1841720098Bulan extends Zombie1841720098Bulan {
    
    public WalkingZombie1841720098Bulan(int health, int level){
        this.health = health;
        this.level = level;
    }
    @Override
    public void healBulan(){
        if (level == 1){
            health += health*0.2;
        }else if (level == 2){
            health += health*0.3;
        }else if (level == 3){
            health += health*0.4;
        }
    }   
    @Override
    public void destroyedBulan(){
        health -= health*0.19;
    }
    @Override
    public String getZombieInfoBulan(){
        String info = "Walking Zombie Data = ";
        info += super.getZombieInfoBulan()+"\n";
        return info;
    }

    
}
