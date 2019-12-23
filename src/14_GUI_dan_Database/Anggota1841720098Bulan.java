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
public class Anggota1841720098Bulan {

    private int idanggota;
    private String nama;
    private String alamat;
    private String telepon;

    public Anggota1841720098Bulan() {

    }

    public Anggota1841720098Bulan(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public int getIdanggotaBulan() {
        return idanggota;
    }

    public void setIdanggotaBulan(int idanggota) {
        this.idanggota = idanggota;
    }

    public String getNamaBulan() {
        return nama;
    }

    public void setNamaBulan(String nama) {
        this.nama = nama;
    }

    public String getAlamatBulan() {
        return alamat;
    }

    public void setAlamatBulan(String alamat) {
        this.alamat = alamat;
    }

    public String getTeleponBulan() {
        return telepon;
    }

    public void setTeleponBulan(String telepon) {
        this.telepon = telepon;
    }

    public Anggota1841720098Bulan getById(int id) {
        Anggota1841720098Bulan anggota = new Anggota1841720098Bulan();
        ResultSet rs = DBHelper1841720098Bulan.selectQuery("SELECT * FROM anggota " + " WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                anggota = new Anggota1841720098Bulan();
                anggota.setIdanggotaBulan(rs.getInt("idanggota"));
                anggota.setNamaBulan(rs.getString("nama"));
                anggota.setAlamatBulan(rs.getString("alamat"));
                anggota.setTeleponBulan(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return anggota;
    }

    public ArrayList<Anggota1841720098Bulan> getAll() {
        ArrayList<Anggota1841720098Bulan> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper1841720098Bulan.selectQuery("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720098Bulan anggota = new Anggota1841720098Bulan();
                anggota.setIdanggotaBulan(rs.getInt("idanggota"));
                anggota.setNamaBulan(rs.getString("nama"));
                anggota.setAlamatBulan(rs.getString("alamat"));
                anggota.setTeleponBulan(rs.getString("telepon"));

                ListAnggota.add(anggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota1841720098Bulan> search(String keyword) {

        ArrayList<Anggota1841720098Bulan> ListAnggota = new ArrayList();

        String sql = "SELECT * FROM anggota WHERE " + "    nama LIKE '%" + keyword + "%' " + "    OR alamat LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720098Bulan.selectQuery(sql);

        try {
            while (rs.next()) {
                Anggota1841720098Bulan anggota = new Anggota1841720098Bulan();
                anggota.setIdanggotaBulan(rs.getInt("idanggota"));
                anggota.setNamaBulan(rs.getString("nama"));
                anggota.setAlamatBulan(rs.getString("alamat"));
                anggota.setTeleponBulan(rs.getString("telepon"));

                ListAnggota.add(anggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public void saveBulan() {
        if (getById(idanggota).getIdanggotaBulan() == 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES(" + "     '" + this.nama + "', "
                    + "     '" + this.alamat + "', "
                    + "     '" + this.telepon + "' "
                    + "     )";
            this.idanggota = DBHelper1841720098Bulan.insertQueryGetIdBulan(SQL);
        } else {
            String SQL = "UPDATE anggota SET idanggota = '" + this.idanggota + "', "
                    + "     nama='" + this.nama + "', "
                    + "     alamat='" + this.alamat + "', "
                    + "     telepon='" + this.telepon + "' "
                    + "     WHERE idanggota = '" + this.idanggota + "'";

            DBHelper1841720098Bulan.executeQueryBulan(SQL);
        }
    }

    public void deleteBulan() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.idanggota + "'";
        DBHelper1841720098Bulan.executeQueryBulan(SQL);
    }
}
