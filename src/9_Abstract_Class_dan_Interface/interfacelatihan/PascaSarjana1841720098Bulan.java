/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author acer
 */
public class PascaSarjana1841720098Bulan extends Mahasiswa1841720098Bulan implements ICumlaude1841720098Bulan,IBerprestasi1841720098Bulan
{
    
    PascaSarjana1841720098Bulan(String nama){
        super(nama);
    }

    @Override
    public void lulusBulan() {
        super.kuliahDiKampusBulan();
        System.out.println("Aku sudah menyelesaikan Tesis");
    }

    @Override
    public void meraihIPKTinggiBulan() {
        System.out.println("IPK-ku lebih dari 3,71");
        
    }

    @Override
    public void menjuaraiKompetisiBulan() {
        System.out.println("Saya telah menjuarai kompetisi Internasional");
    }

    @Override
    public void membuatPublikasiIlmiahBulan() {
        System.out.println("Saya menerbitkan artikel di jurnal Internasional");
    }
    
}
