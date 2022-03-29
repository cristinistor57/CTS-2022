//Trebuie implementat modulul care se ocupa de crearea de obiecte din familia MijlocTransport.
//Compania de transport public detine urmatoarele tipuri de mijl de transport: Autobuz, Troleibuz si Tramvai.
//Tipurile pot fi salvate intr-un enum || nu trebuie folosit enum
//Sa se implementeze modulul care creeaza obiecte din aceasta familie

import factory.Factory;
import familie.MijlocTransport;
import familie.TipTransport;

public class main {
    public static void main(String[] args){
        Factory fabrica = new Factory();
        MijlocTransport mt1 = fabrica.createObject(TipTransport.AUTOBUZ, "B 288 rcd");
        MijlocTransport mt2 = fabrica.createObject(TipTransport.TRAMVAI, "B 55 abc");
        MijlocTransport mt3 = fabrica.createObject(TipTransport.TROLEIBUZ, "B 288 asl");
        MijlocTransport mt4 = fabrica.createObject(TipTransport.TROLEIBUZ, "B 567 ssd");
        MijlocTransport mt5 = fabrica.createObject(TipTransport.TRAMVAI, "B 987 dfd");

        System.out.println(mt1);
        System.out.println(mt2);
        System.out.println(mt3);
        System.out.println(mt4);
        System.out.println(mt5);

    }
}
