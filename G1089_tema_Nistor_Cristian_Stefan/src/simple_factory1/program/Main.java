package simple_factory1.program;

import simple_factory1.clase.Bilet;
import simple_factory1.clase.TipBilet;
import simple_factory1.factory.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Bilet bilet1 = null;
        Bilet bilet2 = null;
        Bilet bilet3 = null;
        try {
            bilet1 =factory.createBilet(TipBilet.BUSINESS, "Nistor", "Cristian");
            bilet2 =factory.createBilet(TipBilet.ECONOMIC, "Andrei", "Stefan");
            bilet3 =factory.createBilet(TipBilet.BUSINESS, "Popescu", "Maria");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(bilet1);
        System.out.println(bilet2);
        System.out.println(bilet3);
    }
}
