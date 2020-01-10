/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittest.database.Kategori1841720098BulanTest;
import unittest.database.Anggota1841720098BulanTest;

public class TestRunner1841720098Bulan {

    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest1841720098Bulan.class);
        showMessageResultBulan(mResult, MessageProcessorTest1841720098Bulan.class.getSimpleName());

        mResult = new JUnitCore().runClasses(Kategori1841720098BulanTest.class);
        showMessageResultBulan(mResult, Kategori1841720098BulanTest.class.getSimpleName());

        mResult = new JUnitCore().runClasses(Anggota1841720098BulanTest.class);
        showMessageResultBulan(mResult, Anggota1841720098BulanTest.class.getSimpleName());
    }

    private static void showMessageResultBulan(Result mResult, String mClassName) {
        if (mResult.wasSuccessful()) {
            System.out.format("The Result Test from %s : %s\n", mClassName, mResult.wasSuccessful());
        } else {
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}

