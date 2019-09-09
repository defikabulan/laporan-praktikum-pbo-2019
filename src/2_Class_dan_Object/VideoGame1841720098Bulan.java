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
public class VideoGame1841720098Bulan 
{
    public int idPinjam;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaPinjam;
    
    public int hargaBayarBulan()
    {
        int  Total = harga*lamaPinjam;
        return Total;
    }
      void tampilDataBulan()
    {
        System.out.println("ID Peminjam : "+idPinjam);
        System.out.println("Nama Member : "+namaMember);
        System.out.println("Nama Game   : "+namaGame);
        System.out.println("Lama Pinjam : "+lamaPinjam);
        System.out.println();
        System.out.println("Harga Total :"+hargaBayarBulan());
    }
      
}
