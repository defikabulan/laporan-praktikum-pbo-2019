/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend1841720098Bulan;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.*;

public class Peminjaman1841720098Bulan {
    private int idpeminjaman;
    private Anggota1841720098Bulan anggota = new Anggota1841720098Bulan();
    private Buku1841720098Bulan buku = new Buku1841720098Bulan();
    private String tanggalpinjam;
    private String tanggalkembali;
    
    public Peminjaman1841720098Bulan(){
        
    }
    
    public  Peminjaman1841720098Bulan(Anggota1841720098Bulan anggota, Buku1841720098Bulan buku, String tanggalpinjam, String tanggalkembali){
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }
    
    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota1841720098Bulan getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota1841720098Bulan anggota) {
        this.anggota = anggota;
    }

    public Buku1841720098Bulan getBuku() {
        return buku;
    }

    public void setBuku(Buku1841720098Bulan buku) {
        this.buku = buku;
    }

    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembali() {
        return tanggalkembali;
    }

    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }
    
    public Peminjaman1841720098Bulan getById(int id){
        Peminjaman1841720098Bulan peminjaman = new Peminjaman1841720098Bulan();
     
        ResultSet rs = DBHelper1841720098Bulan.selectQuery("SELECT "
                                        + "     p.idpeminjaman AS idpeminjaman, "
                                        + "     p.tanggalpinjam AS tanggalpinjam, "
                                        + "     p.tanggalkembali AS tanggalkembali, "
                                        + "     a.idanggota AS idanggota, "
                                        + "     a.nama AS nama,"
                                        + "     b.idbuku AS idbuku,"
                                        + "     b.judul AS judul "
                                        + "     FROM peminjaman p "
                                        + "     INNER JOIN anggota a ON p.idanggota = a.idanggota "
                                        + "     INNER JOIN buku b ON p.idbuku = b.idbuku "
                                        + "     WHERE p.idpeminjaman = '" + id + "'");

        try {
            while (rs.next()) {                
                peminjaman = new Peminjaman1841720098Bulan();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggotaBulan(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNamaBulan(rs.getString("nama"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembali(rs.getString("tanggalkembali"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         return peminjaman;
    }
    
    public ArrayList<Peminjaman1841720098Bulan> getAll(){
        ArrayList<Peminjaman1841720098Bulan> ListPeminjaman = new ArrayList();

        ResultSet rs = DBHelper1841720098Bulan.selectQuery("SELECT "
                                        + "     p.idpeminjaman AS idpeminjaman, "
                                        + "     p.tanggalpinjam AS tanggalpinjam, "
                                        + "     p.tanggalkembali AS tanggalkembali, "
                                        + "     a.idanggota AS idanggota, "
                                        + "     a.nama AS nama,"
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul "
                                        + "     FROM peminjaman p "
                                        + "     INNER JOIN anggota a ON p.idanggota = a.idanggota "
                                        + "     INNER JOIN buku b ON p.idbuku = b.idbuku ");
        
        try {
            while (rs.next()) {                
                Peminjaman1841720098Bulan peminjaman = new Peminjaman1841720098Bulan();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggotaBulan(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNamaBulan(rs.getString("nama"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembali(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }
    
    public ArrayList<Peminjaman1841720098Bulan> search(String keyword){
        
        ArrayList<Peminjaman1841720098Bulan> ListPeminjaman = new ArrayList();
        

        ResultSet rs = DBHelper1841720098Bulan.selectQuery("SELECT "
                                        + "     p.idpeminjaman AS idpeminjaman, "
                                        + "     p.tanggalpinjam AS tanggalpinjam, "
                                        + "     p.tanggalkembali AS tanggalkembali, "
                                        + "     a.idanggota AS idanggota, "
                                        + "     a.nama AS nama,"
                                        + "     b.idbuku AS idbuku, "
                                        + "     b.judul AS judul "
                                        + "     FROM peminjaman p "
                                        + "     INNER JOIN anggota a ON p.idanggota = a.idanggota "
                                        + "     INNER JOIN buku b ON p.idbuku = b.idbuku "
                                        + "     WHERE a.nama IN (SELECT a.nama FROM anggota WHERE a.nama LIKE '%" + keyword + "%') "
                                        + "     OR b.judul IN (SELECT b.judul FROM buku WHERE b.judul LIKE '%" + keyword + "%') ");
                                        
//                                                + "     OR a.idanggota '" + keyword + "' ");
        
        try {
            while (rs.next()) {                
                Peminjaman1841720098Bulan peminjaman = new Peminjaman1841720098Bulan();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggotaBulan(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNamaBulan(rs.getString("nama"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.setTanggalpinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembali(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }
    
    
    public void save(){
        if (getById(idpeminjaman).getIdpeminjaman()== 0) {
            
            String SQL = "INSERT INTO peminjaman (`idanggota`, `idbuku`, `tanggalpinjam`, `tanggalkembali`) VALUES("
                    + "     '" + this.getAnggota().getIdanggotaBulan() + "', "
                    + "     '" + this.getBuku().getIdbuku() + "', "
                    + "     '" + this.tanggalpinjam + "', "
                    + "     '" + this.tanggalkembali + "' "
                    + "     )";
            this.idpeminjaman = DBHelper1841720098Bulan.insertQueryGetIdBulan(SQL);
        } else {
            String SQL = "UPDATE peminjaman SET "
                    + "     idanggota='" + this.getAnggota().getIdanggotaBulan() + "', "
                    + "     idbuku='" + this.getBuku().getIdbuku() + "', "
                    + "     tanggalpinjam='" + this.tanggalpinjam + "', "
                    + "     tanggalkembali='" + this.tanggalkembali +"' "
                    + "     WHERE idpeminjaman = '" + this.idpeminjaman +"'";
            DBHelper1841720098Bulan.executeQueryBulan(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper1841720098Bulan.executeQueryBulan(SQL);
    }
    
}
