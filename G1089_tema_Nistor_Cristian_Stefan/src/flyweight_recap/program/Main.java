package flyweight_recap.program;

import flyweight_recap.clase.Autobuz;
import flyweight_recap.clase.FabricaLinie;
import flyweight_recap.clase.Linie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("Mercedes", 1990, 40);
        Autobuz autobuz2 = new Autobuz("BMW", 2000, 70);
        Autobuz autobuz3 = new Autobuz("Otokar", 21000, 60);
        Autobuz autobuz4 = new Autobuz("Man", 2333, 50);

        FabricaLinie fabricaLinie = new FabricaLinie();
        fabricaLinie.getLinie(133).afiseazaDetaliiAutobuzLinie(autobuz1);
        fabricaLinie.getLinie(133).afiseazaDetaliiAutobuzLinie(autobuz2);
        fabricaLinie.getLinie(33).afiseazaDetaliiAutobuzLinie(autobuz3);
        fabricaLinie.getLinie(300).afiseazaDetaliiAutobuzLinie(autobuz4);
    }
}
