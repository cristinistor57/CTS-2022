package observer3.program;

import observer3.clase.Calator;
import observer3.clase.Observer;
import observer3.clase.Pilot;
import observer3.clase.Subject;

public class Main {
    public static void main(String[] args) {
        Subject pilot = new Pilot("Boeing777 ");

        Observer calator1 = new Calator("Radu", true);
        Observer calator2 = new Calator("Andrei", false);
        Observer calator3 = new Calator("Maria", true);
        Observer calator4 = new Calator("Irina", false);
        Observer calator5 = new Calator("Andreea", true);

        pilot.adaugaCalator(calator1);
        pilot.adaugaCalator(calator2);
        pilot.adaugaCalator(calator3);
        pilot.transmiteMesaj1();
        pilot.stergeCalator(calator2);
        pilot.stergeCalator(calator3);
        pilot.transmiteMesaj2();
        pilot.adaugaCalator(calator4);
        pilot.adaugaCalator(calator5);
        pilot.transmiteMesaj3();

    }
}
