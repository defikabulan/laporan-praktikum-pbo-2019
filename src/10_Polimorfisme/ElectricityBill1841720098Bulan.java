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
public class ElectricityBill1841720098Bulan implements Payable1841720098Bulan{
    private int mKwh;
    private String mCategory;

    public ElectricityBill1841720098Bulan(int mKwh, String mCategory) {
        this.mKwh = mKwh;
        this.mCategory = mCategory;
    }

    public int getmKwhBulan() {
        return mKwh;
    }

    public String getmCategoryBulan() {
        return mCategory;
    }

    public void setmKwhBulan(int mKwh) {
        this.mKwh = mKwh;
    }

    public void setmCategoryBulan(String mCategory) {
        this.mCategory = mCategory;
    }
    
    @Override
    public int getPaymentAmountBulan() {
        return mKwh*getBasePriceBulan();
    }

    public int getBasePriceBulan() {
        int bPrice = 0;
        switch(mCategory){
            case "R-1" : bPrice = 100;break;
            case "R-2" : bPrice = 200;break;
        }
        return bPrice;
        
    }
    
    String getBillInfoBulan(){
        return "KWH = "+mKwh+"\n"+"Category = "+mCategory+"("+getBasePriceBulan()+"per kWH)\n";
    }
    
}
