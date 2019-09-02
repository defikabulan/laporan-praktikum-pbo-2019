/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SepedaDemo2;

/**
 *
 * @author acer
 */
public class SepedaGunung1841720098Bulan extends Sepeda1841720098Bulan
{
    private String mTipeSuspensi;
    
    void setTipeSuspensiBulan(String newValue)
    {
        mTipeSuspensi = newValue;
    }
    
    void cetakStatusBulan()
    {
        super.cetakStatusBulan();
        System.out.println("Tipe Suspensi : "+ mTipeSuspensi);
    }
    
}
