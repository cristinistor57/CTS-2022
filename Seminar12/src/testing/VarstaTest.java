package testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VarstaTest {

    private Persoana persoana;

    @Before
    public void setUp() throws Exception { }

    @After
    public void tearDown() throws Exception { }

    @Test
    public void getVarsta() {
        persoana = new Persoana("John", "5000101460090");
        int varsta = persoana.getVarsta();
        assertEquals(22, varsta);
    }

    @Test
    public void getVarstaRightBoundary1800() {
        persoana = new Persoana("John", "3000101460090");
        int varsta = persoana.getVarsta();
        assertEquals(222, varsta);
    }

    @Test
    public void getVarstaRightZiuaCurenta() {
        persoana = new Persoana("John", "5220546009000");
        int varsta = persoana.getVarsta();
        assertEquals(0, varsta);
    }

    //    @Test(expected =  IllegalArgumentException.class)
    public void getVarstaRightZiuaUrmatoare() {
        persoana = new Persoana("John", "5220529009000");
        @SuppressWarnings("unused")
        int varsta = persoana.getVarsta();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getVarstaErrorCondition2() {
        persoana = new Persoana("John", null);
        @SuppressWarnings("unused")
        int varsta = persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformance() {
        persoana = new Persoana("John", "6000101263498");
        int varsta = persoana.getVarsta();
    }


    @Test
    public void getVarstaOrder() {
        persoana = new Persoana("John", "5030101263498");
        Persoana persoana2 = new Persoana("Dan", "5001231263498");
        assertTrue(persoana2.getVarsta() > persoana.getVarsta());
    }
}