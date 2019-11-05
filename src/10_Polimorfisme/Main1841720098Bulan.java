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
public class Main1841720098Bulan {
    public static void main(String[] args) {
        WalkingZombie1841720098Bulan wz = new WalkingZombie1841720098Bulan(100,1);
        JumpingZombie1841720098Bulan jz = new JumpingZombie1841720098Bulan(100,2);
        Barrier1841720098Bulan b = new Barrier1841720098Bulan (100);
        Plant1841720098Bulan p = new Plant1841720098Bulan();
        System.out.println(""+wz.getZombieInfoBulan());
        System.out.println(""+jz.getZombieInfoBulan());
        System.out.println(""+b.getBarrierInfoBulan());
        System.out.println("---------------------");
        for (int i = 0; i<4; i++){
            p.doDestroyBulan(wz);
            p.doDestroyBulan(jz);
            p.doDestroyBulan(b);
        }
        System.out.println(""+wz.getZombieInfoBulan());
        System.out.println(""+jz.getZombieInfoBulan());
        System.out.println(""+b.getBarrierInfoBulan());
    } 
    
}
