package chain_of_responsability.main;

import chain_of_responsability.clase.*;

public class Main {
    public static void main(String[] args) {

        Handler troleibuzHandler = new TroleibuzHandler(3);
        Handler autobuzHandler  = new AutobuzHandler(5);
        Handler tramvaiHandler = new TramvaiHandler(10);
        Handler metrouHandler = new MetrouHandler(1000);

        troleibuzHandler.setHandler(autobuzHandler);
        autobuzHandler.setHandler(tramvaiHandler);
        tramvaiHandler.setHandler(metrouHandler);

//        troleibuzHandler.afiseazaMijlocTransport(2);
//        troleibuzHandler.afiseazaMijlocTransport(7);
//        troleibuzHandler.afiseazaMijlocTransport(12);

        System.out.println("Pentru Iasi: ");

        Handler troleibuzIasi = new TroleibuzHandler(5);
        Handler autobuzIasi = new AutobuzHandler(1000);
        Handler tramvaiIasi = new TramvaiHandler(2);
        Handler metrouIasi = new MetrouHandler(1);

        metrouIasi.setHandler(tramvaiIasi);
        tramvaiIasi.setHandler(troleibuzIasi);
        troleibuzIasi.setHandler(autobuzIasi);

        metrouIasi.afiseazaMijlocTransport(3);
        metrouIasi.afiseazaMijlocTransport(6);

    }
}
