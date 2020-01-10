package unittest;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import unittest.database.Kategori1841720098Bulan;


public class Kategori1841720098BulanTest extends TestCase {

    Kategori1841720098Bulan instance;

    public Kategori1841720098BulanTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Kategori1841720098Bulan("Comics", "Comics is combination words and pictures");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    /**
     * Test of searchBulan method, of class Kategori1841720098Bulan.
     */
    @Test
    public void testSearchBulan() {
        System.out.println("save test");
        this.instance.saveBulan();
        ArrayList<Kategori1841720098Bulan> expResult = instance.getByNamaAndKeteranganBulan(instance.getNamaBulan(), instance.getKeteranganBulan());
        assertTrue(expResult.size() > 0);
    }

    /**
     * Test of saveBulan method, of class Kategori1841720098Bulan.
     */
    @Test
    public void testSaveBulan() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720098Bulan> result = instance.searchBulan(keyword);
        ArrayList<Kategori1841720098Bulan> expResult = instance.getByNamaAndKeteranganBulan(keyword, "");
        assertEquals(expResult.size(), result.size());
    }
}
