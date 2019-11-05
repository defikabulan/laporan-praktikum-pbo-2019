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
public class Tester31841720098Bulan {
    public static void main(String[] args) {
        PermanentEmployee1841720098Bulan pEmp = new PermanentEmployee1841720098Bulan("Dedik",500);
        IntershipEmployee1841720098Bulan iEmp = new IntershipEmployee1841720098Bulan("Sunarto",5);
        ElectricityBill1841720098Bulan eBill = new ElectricityBill1841720098Bulan(5,"A-1");
        Employee1841720098Bulan e[] = {pEmp,iEmp};
        Payable1841720098Bulan p[] = {pEmp,eBill};
        //Employee1841720098Bulan e2[] = {pEmp,iEmp,eBill};
        
    }
    
}
