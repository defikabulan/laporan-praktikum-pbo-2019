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
public class Plant1841720098Bulan {
    public void doDestroyBulan (Destroyable1841720098Bulan d){
        if (d instanceof WalkingZombie1841720098Bulan){
            WalkingZombie1841720098Bulan wz = (WalkingZombie1841720098Bulan) d;
            wz.destroyedBulan();
        }else if (d instanceof JumpingZombie1841720098Bulan){
            JumpingZombie1841720098Bulan jz = (JumpingZombie1841720098Bulan) d;
            jz.destroyedBulan();
        }else if (d instanceof Barrier1841720098Bulan){
            Barrier1841720098Bulan b = (Barrier1841720098Bulan) d;
            b.destroyedBulan();
        }
    }
    
}
