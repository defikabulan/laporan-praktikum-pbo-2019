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
public class PermanentEmployee1841720098Bulan extends Employee1841720098Bulan implements Payable1841720098Bulan {
    private int mSalary;

    public PermanentEmployee1841720098Bulan(String name,int mSalary) {
        this.mSalary = mSalary;
        this.name = name;
    }

    public int getmSalaryBulan() {
        return mSalary;
    }

    public void setmSalaryBulan(int mSalary) {
        this.mSalary = mSalary;
    }
    
    @Override
    public int getPaymentAmountBulan() {
        return(int) (mSalary+0.05*mSalary);
    }
    
    @Override
    public String getEmployeeInfoBulan(){
        String info = super.getEmployeeInfoBulan()+"\n";
        info += "Terdaftar sebagai pegawai tetap dengan gaji"+mSalary+"\n";
        return info;
        
    }
    
}
