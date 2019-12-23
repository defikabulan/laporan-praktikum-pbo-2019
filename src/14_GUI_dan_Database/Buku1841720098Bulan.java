/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend1841720098Bulan;
import java.util.ArrayList;
import java.sql.*;

public class Buku1841720098Bulan {
    private int idbuku;
    private Kategori1841720098Bulan kategori = new Kategori1841720098Bulan();
    private String judul;
    private String penerbit;
    private String penulis;
    
    public Buku1841720098Bulan(){
        
    }
    
    public Buku1841720098Bulan(Kategori1841720098Bulan kategori, String judul, String penerbit, String penulis){
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }

    public int getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
    }
    
    public void setKategori(Kategori1841720098Bulan kategori){
        this.kategori = kategori;
    }
    
    public Kategori1841720098Bulan getKategori(){
        return kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public Buku1841720098Bulan getById(int id){
        Buku1841720098Bulan buku = new Buku1841720098Bulan();
     
        ResultSet rs = DBHelper1841720098Bulan.selectQuery("SELECT "
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul, "
                                        + "     b.penerbit AS penerbit, "
                                        + "     b.penulis AS penulis, "
                                        + "     k.idkategori AS idkategori, "
                                        + "     k.nama AS nama, "
                                        + "     k.keterangan AS keterangan "
                                        + "     FROM buku b "
                                        + "     LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        + "     WHERE b.idbuku = '" + id + "'");

        try {
            while (rs.next()) {                
                buku = new Buku1841720098Bulan();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategoriBulan(rs.getInt("idkategori"));
                buku.getKategori().setNamaBulan(rs.getString("nama"));
                buku.getKategori().setKeteranganBulan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         return buku;
    }
    
    public ArrayList<Buku1841720098Bulan> getAll(){
        ArrayList<Buku1841720098Bulan> ListBuku = new ArrayList();
        
//        ResultSet rs = DBHelper.selectQuery("SELECT * FROM buku");

        ResultSet rs = DBHelper1841720098Bulan.selectQuery("SELECT "
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul, "
                                        + "     b.penerbit AS penerbit, "
                                        + "     b.penulis AS penulis, "
                                        + "     k.idkategori AS idkategori, "
                                        + "     k.nama AS nama, "
                                        + "     k.keterangan AS keterangan "
                                        + "     FROM buku b "
                                        + "     LEFT JOIN kategori k ON b.idkategori = k.idkategori ");
        
        try {
            while (rs.next()) {                
                Buku1841720098Bulan buku = new Buku1841720098Bulan();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategoriBulan(rs.getInt("idkategori"));
                buku.getKategori().setNamaBulan(rs.getString("nama"));
                buku.getKategori().setKeteranganBulan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public ArrayList<Buku1841720098Bulan> search(String keyword){
        
        ArrayList<Buku1841720098Bulan> ListBuku = new ArrayList();
        

        ResultSet rs = DBHelper1841720098Bulan.selectQuery("SELECT "
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul, "
                                        + "     b.penerbit AS penerbit, "
                                        + "     b.penulis AS penulis, "
                                        + "     k.idkategori AS idkategori, "
                                        + "     k.nama AS nama, "
                                        + "     k.keterangan AS keterangan "
                                        + "     FROM buku b "
                                        + "     LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        + "     WHERE b.judul LIKE '%" + keyword + "%' "
                                        + "     OR b.penerbit LIKE '%" + keyword + "%' "
                                        + "     OR b.penulis LIKE '%" + keyword + "%' ");
        
        try {
            while (rs.next()) {                
                Buku1841720098Bulan buku = new Buku1841720098Bulan();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdkategoriBulan(rs.getInt("idkategori"));
                buku.getKategori().setNamaBulan(rs.getString("nama"));
                buku.getKategori().setKeteranganBulan(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    
    public void save(){
        if (getById(idbuku).getIdbuku()== 0) {
            
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                    + "     '" + this.judul + "', "
                    + "     '" + this.getKategori().getIdkategoriBulan() + "', "
                    + "     '" + this.penulis + "', "
                    + "     '" + this.penerbit + "' "
                    + "     )";
            this.idbuku = DBHelper1841720098Bulan.insertQueryGetIdBulan(SQL);
        } else {
            Kategori1841720098Bulan kategori = new Kategori1841720098Bulan();
            
//            String SQL = "UPDATE buku SET idbuku = '"+ this.idbuku +"', "
//                    + "     idkategori='" + this.getKategori().getIdkategori() + "', "
//                    + "     judul='" + this.judul + "', "
//                    + "     penerbit='" + this.penerbit + "', "
//                    + "     penulis='" + this.penulis +"' "
//                    + "     WHERE idbuku = '" + this.idbuku +"'";
    
            String SQL = "UPDATE buku SET "
                    + "     judul='" + this.judul + "', "
                    + "     idkategori='" + this.getKategori().getIdkategoriBulan() + "', "
                    + "     penulis='" + this.penulis + "', "
                    + "     penerbit='" + this.penerbit +"' "
                    + "     WHERE idbuku = '" + this.idbuku +"'";
            DBHelper1841720098Bulan.executeQueryBulan(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idbuku + "'";
        DBHelper1841720098Bulan.executeQueryBulan(SQL);
    }
}
