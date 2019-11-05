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
public class Tester21842720098Bulan {
    public static void main(String[] args) {
        PermanentEmployee1841720098Bulan pEmp = new PermanentEmployee1841720098Bulan("Dedik",500);
        Employee1841720098Bulan e;
        
        e = pEmp;
        System.out.println(" "+e.getEmployeeInfoBulan());
        System.out.println("----------------------");
        System.out.println(""+pEmp.getEmployeeInfoBulan());
    }
    
}
