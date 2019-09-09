/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2;

/**
 *
 * @author acer
 */
public class TestVideoGame1841720098Bulan 
{
    public static void main(String[] args) 
    {
        VideoGame1841720098Bulan gm1 = new VideoGame1841720098Bulan();
        
        gm1.harga = 10000;
        gm1.idPinjam = 16723340;
        gm1.lamaPinjam = 3;
        gm1.namaGame = "Residen Evil";
        gm1.namaMember = "Fariz";
        gm1.hargaBayarBulan();
        
        gm1.tampilDataBulan();
        
    }
}
