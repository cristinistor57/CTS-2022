package testare.testing;

import org.junit.Test;
import testare.clase.Matematica;

import static org.junit.Assert.*;

public class MatematicaTest {

    @Test
    public void testeazaSuma() {
        Matematica mate = new Matematica();
        int rezultatObtinut = mate.suma(8, 6);
        assertEquals(14, rezultatObtinut);
    }

    @Test
    public void testeazaRaport() {
        Matematica mate = new Matematica();
        double rezultatObtinut = mate.raport(10, 2);
        assertEquals(5, rezultatObtinut, 0.001);
    }

    @Test
    public void testeazaRaportShouldThrowException() {

        Matematica mate = new Matematica();
        try {
            mate.raport(45, 0);
            fail("Nu trebuie sa se ajunga la pasul acesta!");
        }
        catch (IllegalArgumentException exception) {

        }
    }
}