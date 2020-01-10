package unittest;

import java.util.ArrayList;
import java.sql.*;


public class Anggota1841720098Bulan {

    private int mIdanggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720098Bulan() {
    }

    public Anggota1841720098Bulan(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public int getIdanggotaBulan() {
        return mIdanggota;
    }

    public void setIdanggotaBulan(int mIdanggota) {
        this.mIdanggota = mIdanggota;
    }

    public String getNamaBulan() {
        return mNama;
    }

    public void setNamaBulan(String mNama) {
        this.mNama = mNama;
    }

    public String getAlamatBulan() {
        return mAlamat;
    }

    public void setAlamatBulan(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getTeleponBulan() {
        return mTelepon;
    }

    public void setTeleponBulan(String mTelepon) {
        this.mTelepon = mTelepon;
    }

    public Anggota1841720098Bulan getByIdBulan(int id) {
        Anggota1841720098Bulan agt = new Anggota1841720098Bulan();
        ResultSet rs = DBHelper1841720098Bulan.selectQueryBulan("SELECT * FROM anggota " + " WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                agt = new Anggota1841720098Bulan();
                agt.setIdanggotaBulan(rs.getInt("idanggota"));
                agt.setNamaBulan(rs.getString("nama"));
                agt.setAlamatBulan(rs.getString("alamat"));
                agt.setTeleponBulan(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }

    public ArrayList<Anggota1841720098Bulan> getAllBulan() {
        ArrayList<Anggota1841720098Bulan> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper1841720098Bulan.selectQueryBulan("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720098Bulan agt = new Anggota1841720098Bulan();
                agt.setIdanggotaBulan(rs.getInt("idanggota"));
                agt.setNamaBulan(rs.getString("nama"));
                agt.setAlamatBulan(rs.getString("alamat"));
                agt.setTeleponBulan(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota1841720098Bulan> searchBulan(String keyword) {
        ArrayList<Anggota1841720098Bulan> ListAnggota = new ArrayList();

        String sql = "SELECT * FROM anggota WHERE " + " nama LIKE '%" + keyword + "%' " + " OR alamat LIKE '%" + keyword + "%' " + " OR telepon LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720098Bulan.selectQueryBulan(sql);

        try {
            while (rs.next()) {
                Anggota1841720098Bulan agt = new Anggota1841720098Bulan();
                agt.setIdanggotaBulan(rs.getInt("idanggota"));
                agt.setNamaBulan(rs.getString("nama"));
                agt.setAlamatBulan(rs.getString("alamat"));
                agt.setTeleponBulan(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota1841720098Bulan> getByNamaAndAlamatAndTeleponBulan(String nama, String alamat, String telepon) {
        ArrayList<Anggota1841720098Bulan> ListAnggota = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper1841720098Bulan.selectQueryBulan("SELECT * FROM anggota WHERE nama = '" + nama + "'  AND alamat = '" + alamat + "'  AND telepon = '" + telepon + "'");

        } else if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper1841720098Bulan.selectQueryBulan("SELECT * FROM anggota WHERE nama = '" + nama + "'  AND alamat = '" + alamat + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() == 0)) {
            rs = DBHelper1841720098Bulan.selectQueryBulan("SELECT * FROM anggota WHERE nama = '" + nama + "'");

        } else {
            rs = DBHelper1841720098Bulan.selectQueryBulan(
                    "SELECT * FROM anggota "
                    + "WHERE alamat = '" + alamat + "'  ");
        }
        try {
            while (rs.next()) {
                Anggota1841720098Bulan ang = new Anggota1841720098Bulan();
                ang.setIdanggotaBulan(rs.getInt("idanggota"));
                ang.setNamaBulan(rs.getString("nama"));
                ang.setAlamatBulan(rs.getString("alamat"));
                ang.setTeleponBulan(rs.getString("telepon"));
                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public void saveBulan() {
        if (getByIdBulan(mIdanggota).getIdanggotaBulan() == 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES(" + " '" + this.mNama + "', " + " '" + this.mAlamat + "', " + " '" + this.mTelepon + "' " + " )";
            this.mIdanggota = DBHelper1841720098Bulan.insertQueryGetIdBulan(SQL);
        } else {
            String SQL = "UPDATE anggota SET " + " nama = '" + this.mNama + "', " + " alamat = '" + this.mAlamat + "', " + " telepon = '" + this.mTelepon + "' " + " WHERE idanggota = '" + this.mIdanggota + "'";
            DBHelper1841720098Bulan.executeQueryBulan(SQL);
        }
    }

    public void deleteBulan() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.mIdanggota + "'";
        DBHelper1841720098Bulan.executeQueryBulan(SQL);
    }
}
