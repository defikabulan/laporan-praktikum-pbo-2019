/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend1841720098Bulan;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author acer
 */
public class Kategori1841720098Bulan {
    private int idkategori;
    private String nama;
    private String keterangan;

    public Kategori1841720098Bulan() {
    }

    public Kategori1841720098Bulan(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }
    

    public void setIdkategoriBulan(int idkategori) {
        this.idkategori = idkategori;
    }

    public void setNamaBulan(String nama) {
        this.nama = nama;
    }

    public void setKeteranganBulan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getIdkategoriBulan() {
        return idkategori;
    }

    public String getNamaBulan() {
        return nama;
    }

    public String getKeteranganBulan() {
        return keterangan;
    }
    
    public Kategori1841720098Bulan getById(int id){
        
        Kategori1841720098Bulan kat = new Kategori1841720098Bulan();
        ResultSet rs = DBHelper1841720098Bulan.selectQuery("SELECT * FROM kategori "+"WHERE idkategori = '"+id+ "'" );
        
        try {
            while(rs.next()){
                kat = new Kategori1841720098Bulan();
                kat.setIdkategoriBulan(rs.getInt("idkategori"));
                kat.setNamaBulan(rs.getString("nama"));
                kat.setKeteranganBulan(rs.getString("keterangan"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return kat;
    }
    
    public ArrayList<Kategori1841720098Bulan> getAllBulan(){
        ArrayList<Kategori1841720098Bulan> ListKategori = new ArrayList();
        
        ResultSet rs = DBHelper1841720098Bulan.selectQuery("SELECT * FROM kategori");
        
        try {
            while(rs.next()){
                Kategori1841720098Bulan kat = new Kategori1841720098Bulan();
                kat.setIdkategoriBulan(rs.getInt("idkategori"));
                kat.setNamaBulan(rs.getString("nama"));
                kat.setKeteranganBulan(rs.getString("keterangan"));
                
                ListKategori.add(kat);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListKategori;
    }
    
    public ArrayList<Kategori1841720098Bulan>searcBulan(String keyword){
        ArrayList<Kategori1841720098Bulan> ListKategori = new ArrayList();
        
        String sql = "SELECT * FROM kategori WHERE  "
                +" nama LIKE '%"+keyword+"%'"
                +" OR keterangan LIKE '%"+keyword+"%'";
        
        ResultSet rs = DBHelper1841720098Bulan.selectQuery(sql);
        
        try {
            while(rs.next()){
                Kategori1841720098Bulan kat = new Kategori1841720098Bulan();
                kat.setIdkategoriBulan(rs.getInt("idkategori"));
                kat.setNamaBulan(rs.getString("nama"));
                kat.setKeteranganBulan(rs.getString("keterangan"));
                
                ListKategori.add(kat);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListKategori;
    }
    
    public void saveBulan(){
        if(getById(idkategori).getIdkategoriBulan() == 0){
            String SQL = "INSERT INTO kategori (nama,keterangan) VALUES("
                    +" '"+this.nama+"',"
                    +" '"+this.keterangan+"' "
                    +")";
            this.idkategori = DBHelper1841720098Bulan.insertQueryGetIdBulan(SQL);
        }else{
            String SQL = "UPDATE kategori SET "
                    + "     nama='" + this.nama + "', "
                    + "     keterangan='" + this.keterangan +"' "
                    + "     WHERE idkategori = '" + this.idkategori +"'";
            DBHelper1841720098Bulan.executeQueryBulan(SQL);
        }  
    }
    public void deleteBulan(){
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.idkategori + "'";
        DBHelper1841720098Bulan.executeQueryBulan(SQL);
    }
    
}
