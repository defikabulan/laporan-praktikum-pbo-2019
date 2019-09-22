/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jti.polinema.relasclasspercobaan4_1841720098Bulan;

/**
 *
 * @author acer
 */
public class Gerbong1841720098Bulan {

    private String mKode;
    private Kursi1841720098Bulan arrayKursi[];

    public Gerbong1841720098Bulan(String mKode, int mJumlah) {
        this.mKode = mKode;
        this.arrayKursi = new Kursi1841720098Bulan[mJumlah];
        this.initKursiBulan();
    }

    public void setmKodeBulan(String mKode) {
        this.mKode = mKode;
    }

    public void setArrayKursiBulan(Kursi1841720098Bulan[] arrayKursi, int mNomor) {
        this.arrayKursi[mNomor] = arrayKursi[mNomor];
    }

    public String getmKodeBulan() {
        return mKode;
    }

    public Kursi1841720098Bulan[] getArrayKursiBulan() {
        return arrayKursi;
    }

    private void initKursiBulan() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi1841720098Bulan(String.valueOf(i + 1));
        }
    }

    String infoBulan() {
        String info = "";
        info += "Kode: " + mKode + "\n";
        for (Kursi1841720098Bulan kursi : arrayKursi) {
            info += kursi.infoBulan();
        }
        return info;
    }

    public void setPenumpang(Penumpang1841720098Bulan penumpang, int mNomor) {
        if (arrayKursi[mNomor - 1].getmPenumpang() == null) {
            this.arrayKursi[mNomor - 1].setmPenumpangBulan(penumpang);
        } else {
            System.out.println("Tidak Mendapat Tempat : ");
            System.out.println(penumpang.infoBulan());
            System.out.println("Nomer : " + mNomor);
        }
        this.arrayKursi[mNomor - 1].setmPenumpangBulan(penumpang);
    }
}
