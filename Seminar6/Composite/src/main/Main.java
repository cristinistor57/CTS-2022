package main;

import composite.Autobuz;
import composite.Flota;
import composite.Nod;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("X3", 40, "abcd");
        Autobuz autobuz2 = new Autobuz("444", 40, "efg");
        Autobuz autobuz3 = new Autobuz("555", 40, "abcd");
        Autobuz autobuz4 = new Autobuz("666", 40, "hij");
        Autobuz autobuz5 = new Autobuz("777", 40, "klm");
        Autobuz autobuz6 = new Autobuz("888", 40, "nop");

        Nod flota = new Flota("STB");
        Nod mari = new Flota("Autobuze mari");
        Nod mijlocii = new Flota("Autobuze mijlocii");
        Nod mici = new Flota("Autobuze mici");

        try {
            mici.adaugaNod(autobuz1);
            mici.adaugaNod(autobuz2);

            mijlocii.adaugaNod(autobuz3);
            mijlocii.adaugaNod(autobuz4);

            mari.adaugaNod(autobuz5);
            mari.adaugaNod(autobuz6);

            flota.adaugaNod(mici);
            flota.adaugaNod(mijlocii);
            flota.adaugaNod(mari);

        }catch (Exception e){
            e.printStackTrace();
        }



        System.out.println("Garantie pentru intreaga flota: " + flota.calculeazaSumaGarantie(2));
        System.out.println("Garantie pentru flota mijlocie: " + mijlocii.calculeazaSumaGarantie(20));

    }
}
