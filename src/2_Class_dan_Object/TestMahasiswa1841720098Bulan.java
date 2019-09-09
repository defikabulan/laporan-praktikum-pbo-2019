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
public class TestMahasiswa1841720098Bulan 
{
    public static void main(String[] args) 
    {
        Mahasiswa1841720098Bulan mhs1 = new Mahasiswa1841720098Bulan();
        Mahasiswa1841720098Bulan mhs2 = new Mahasiswa1841720098Bulan();
        Mahasiswa1841720098Bulan mhs3 = new Mahasiswa1841720098Bulan();
        
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl.Vinolia no 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodataBulan();
        System.out.println("");
        mhs2.nim = 202;
        mhs2.nama = "Rahma";
        mhs2.alamat = "Jl.Bunga Mawar no 10";
        mhs2.kelas = "2C";
        mhs2.tampilBiodataBulan();
        System.out.println("");
        mhs3.nim = 303;
        mhs3.nama = "Risti";
        mhs3.alamat = "Jl.Soekarno Hatta no 9";
        mhs3.kelas = "2B";
        mhs3.tampilBiodataBulan();
    }
}
