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
public class Tester41841720098Bulan {
    public static void main(String[] args) {
        Owner1841720098Bulan ow = new Owner1841720098Bulan();
        ElectricityBill1841720098Bulan eBill = new ElectricityBill1841720098Bulan(5,"R-1");
        ow.pay(eBill);
        System.out.println("-----------------------------");
        
        PermanentEmployee1841720098Bulan pEmp = new PermanentEmployee1841720098Bulan("Dedik",500);
        ow.pay(pEmp);
        System.out.println("-----------------------------");
        
        IntershipEmployee1841720098Bulan iEmp = new IntershipEmployee1841720098Bulan("Sunarto",5);
        ow.showMyEmployee(pEmp);
        System.out.println("-----------------------------");
        ow.showMyEmployee(iEmp);
        
        
        
        
        

    }
    
}
