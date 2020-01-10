package unittest;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Anggota1841720098BulanTest extends TestCase {

    Anggota1841720098BulanTest instance;

    public Anggota1841720098BulanTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Anggota1841720098BulanTest("Bulan", "Jl. Abdillah", "085877990684");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    /**
     * Test of searchBulan method, of class Anggota1841720098Bulan.
     */
    @Test
    public void testSearchBulan() {
        System.out.println("save test");
        this.instance.saveBulan();
        ArrayList<Anggota1841720098BulanTest> expResult = instance.getByNamaAndAlamatAndTeleponBulan(instance.getNamaBulan(), instance.getAlamatBulan(), instance.getTeleponBulan());
        assertTrue(expResult.size() > 0);
    }

    /**
     * Test of saveBulan method, of class Anggota1841720098Bulan.
     */
    @Test
    public void testSaveBulan() {
        System.out.println("search test");
        String keyword = "I Zoel";
        ArrayList<Anggota1841720098Bulan> result = instance.searchBulan(keyword);
        ArrayList<Anggota1841720098Bulan> expResult = instance.getByNamaAndAlamatAndTeleponBulan(keyword, "", "");
        assertEquals(expResult.size(), result.size());
    }
}
