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
public class Owner1841720098Bulan {
    public void pay(Payable1841720098Bulan p){
        System.out.println("Total payment = "+p.getPaymentAmountBulan());
        if(p instanceof ElectricityBill1841720098Bulan){
            ElectricityBill1841720098Bulan eb = (ElectricityBill1841720098Bulan)p;
            System.out.println(""+eb.getBillInfoBulan());
        } else if(p instanceof PermanentEmployee1841720098Bulan){
            PermanentEmployee1841720098Bulan pe = (PermanentEmployee1841720098Bulan)p;
            pe.getEmployeeInfoBulan();
            System.out.println(""+pe.getEmployeeInfoBulan());
        }
    }
    
    public void showMyEmployee(Employee1841720098Bulan e){
        System.out.println(" "+e.getEmployeeInfoBulan());
        if(e instanceof PermanentEmployee1841720098Bulan)
            System.out.println("you have to pa her/him monthly!!");
        else
            System.out.println("no need to pay him/her");
            
        
    }
    
}
