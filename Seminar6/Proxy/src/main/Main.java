package main;

import clase.Autobuz;
import clase.AutobuzDeNoapte;
import clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz1 = new Autobuz("Gigel", 30, 50);
        autobuz1.opresteInStatie();
        MijlocTransport autobuzDeNoapte = new AutobuzDeNoapte((Autobuz)autobuz1);
        autobuzDeNoapte.opresteInStatie();
        autobuz1.setNrCalatori(0);
        autobuzDeNoapte.opresteInStatie();
    }
}
