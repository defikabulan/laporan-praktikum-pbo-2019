/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class TestKoperasi1841720098Bulan2 {

    static Scanner sc = new Scanner(System.in);
    static String mNama;
    static String mNomorKtp;
    static int mLimitPinjam;
    static Anggota1841720098Bulann member;

    public static void main(String[] args) {
        System.out.print("Input Nama : ");
        mNama = sc.next();
        System.out.print("Input Nomor KTP : ");
        mNomorKtp = sc.next();
        System.out.print("Limit Pinjaman : ");
        mLimitPinjam = sc.nextInt();
        member = new Anggota1841720098Bulann(mNama, mNomorKtp, mLimitPinjam);

        while (true) {
            menu();
        }
    }

    private static void menu() {
        int input = 0;
        System.out.println("    Menu    ");
        System.out.println("============");
        System.out.println("1. Data Diri");
        System.out.println("2. Pinjam");
        System.out.println("3. Angsur");
        System.out.println("4. Keluar");
        System.out.println("============");
        System.out.print("Masukkan Pilihan : ");
        input = sc.nextInt();
        int uang = 0;

        switch (input) {
            case 1:
                System.out.println("Nama : " + member.getNamaBulan());
                System.out.println("Nomor KTP : " + mNomorKtp);
                System.out.println("Limit Pinjaman : " + member.getLimitPinjamBulan());
                System.out.println("Jumlah Pinjaman : " + member.getJumlahPinjamanBulan());
                break;
            case 2:
                System.out.println("Input Nominal yang Dipinjam : ");
                uang = sc.nextInt();
                member.pinjamBulan(uang);
                System.out.println("Jumlah Pinjaman : " + member.getJumlahPinjamanBulan());
                break;
            case 3:
                System.out.println("Input Nominal yang Diangsur : ");
                uang = sc.nextInt();
                member.AngsuranBulan(uang);
                System.out.println("Jumlah Pinjaman : " + member.getJumlahPinjamanBulan());
                break;
            case 4:
                System.exit(0);

            default:
                System.out.println("Input Salah!!");
        }
    }

}
