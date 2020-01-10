package unittest;

import java.util.ArrayList;
import java.sql.*;

public class Kategori1841720098Bulan {

    private int mIdkategori;
    private String mNama;
    private String mKeterangan;

    public Kategori1841720098Bulan() {
    }

    public Kategori1841720098Bulan(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public int getIdkategoriBulan() {
        return mIdkategori;
    }

    public void setIdkategoriBulan(int mIdkategori) {
        this.mIdkategori = mIdkategori;
    }

    public String getNamaBulan() {
        return mNama;
    }

    public void setNamaBulan(String mNama) {
        this.mNama = mNama;
    }

    public String getKeteranganBulan() {
        return mKeterangan;
    }

    public void setKeteranganBulan(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }

    public Kategori1841720098Bulan getByIdBulan(int id) {
        Kategori1841720098Bulan kat = new Kategori1841720098Bulan();
        ResultSet rs = DBHelper1841720098Bulan.selectQueryBulan("SELECT * FROM kategori " + " WHERE idkategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori1841720098Bulan();
                kat.setIdkategoriBulan(rs.getInt("idkategori"));
                kat.setNamaBulan(rs.getString("nama"));
                kat.setKeteranganBulan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720098Bulan> getAllBulan() {
        ArrayList<Kategori1841720098Bulan> ListKategori = new ArrayList();

        ResultSet rs = DBHelper1841720098Bulan.selectQueryBulan("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1841720098Bulan kat = new Kategori1841720098Bulan();
                kat.setIdkategoriBulan(rs.getInt("idkategori"));
                kat.setNamaBulan(rs.getString("nama"));
                kat.setKeteranganBulan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720098Bulan> searchBulan(String keyword) {
        ArrayList<Kategori1841720098Bulan> ListKategori = new ArrayList();

        String sql = "SELECT * FROM kategori WHERE " + " nama LIKE '%" + keyword + "%' " + " OR keterangan LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720098Bulan.selectQueryBulan(sql);

        try {
            while (rs.next()) {
                Kategori1841720098Bulan kat = new Kategori1841720098Bulan();
                kat.setIdkategoriBulan(rs.getInt("idkategori"));
                kat.setNamaBulan(rs.getString("nama"));
                kat.setKeteranganBulan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720098Bulan> getByNamaAndKeteranganBulan(String nama, String keterangan) {
        ArrayList<Kategori1841720098Bulan> ListKategori = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length() > 0) && (keterangan.trim().length() > 0)) {
            rs = DBHelper1841720098Bulan.selectQueryBulan(
                    "SELECT * FROM kategori "
                    + "WHERE nama = '" + nama + "'  AND keterangan = '" + keterangan + "'  ");

        } else if ((nama.trim().length() > 0) && (keterangan.trim().length() == 0)) {
            rs = DBHelper1841720098Bulan.selectQueryBulan("SELECT * FROM kategori WHERE nama = '" + nama + "'");
        } else {
            rs = DBHelper1841720098Bulan.selectQueryBulan(
                    "SELECT * FROM kategori "
                    + "WHERE keterangan = '" + keterangan + "'  ");

        }
        try {
            while (rs.next()) {
                Kategori1841720098Bulan kat = new Kategori1841720098Bulan();
                kat.setIdkategoriBulan(rs.getInt("idkategori"));
                kat.setNamaBulan(rs.getString("nama"));
                kat.setKeteranganBulan(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveBulan() {
        if (getByIdBulan(mIdkategori).getIdkategoriBulan() == 0) {
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES(" + " '" + this.mNama + "', " + " '" + this.mKeterangan + "' " + " )";
            this.mIdkategori = DBHelper1841720098Bulan.insertQueryGetIdBulan(SQL);
        } else {
            String SQL = "UPDATE kategori SET " + " nama = '" + this.mNama + "', " + " keterangan = '" + this.mKeterangan + "' " + " WHERE idkategori = '" + this.mIdkategori + "'";
            DBHelper1841720098Bulan.executeQueryBulan(SQL);
        }
    }

    public void deleteBulan() {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.mIdkategori + "'";
        DBHelper1841720098Bulan.executeQueryBulan(SQL);
    }

    public String toString() {
        return mNama;
    }
}
