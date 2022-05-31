package testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {

    private Persoana persoana;

    @org.junit.Before
    public void setUp() throws Exception { }

    @org.junit.After
    public void tearDown() throws Exception { }

    @Test
    public void getSexRight() {
        persoana = new Persoana("John","2234567891011");
        String sex =  persoana.getSex();
        assertEquals("F", sex);
    }

    @Test
    public void getSexBoundary() {
        persoana = new Persoana("John", "5000101460090");
        String sex = persoana.getSex();
        assertEquals("M", sex);
    }

    @Test
    public void getSexCrossCheck() {
        persoana = new Persoana("John", "6000101460090");
        int primaCifra = persoana.CNP.charAt(0);
        String sex = persoana.getSex();
        assertEquals(sex, primaCifra % 2 == 1 ? "M" : "F");
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSexErrorCondition() {
        persoana = new Persoana("John", "0000101263498");
        @SuppressWarnings("unused")
        String sex = persoana.getSex();
    }

    @Test(timeout = 10)
    public void getSexPerformance() {
        persoana = new Persoana("John", "6000101263498");
        @SuppressWarnings("unused")
        String sex = persoana.getSex();
    }

    @Test
    public void getSexOutputFormat() {
        persoana = new Persoana("John", "6000101263498");
        String sex = persoana.getSex();
        assertEquals(1,sex.length());
    }

    @Test
    public void getSexRangeBtwn1800and1899() {
        persoana = new Persoana("John", "3780101263498");
        String sex = persoana.getSex();
        assertEquals("M",sex);
    }

    @Test(expected = NullPointerException.class)
    public void getSexExistence() {
        persoana = new Persoana("John", null);
        String sex = persoana.getSex();
        assertEquals("M",sex);
    }
}