package factoryMethod;

import factoryMethod.MijlocTransport;

public class MainFactoryMethod {
    public static void main(String[] args)
    {
        MijlocTransport autobuz = new AutobuzFactory().createObject("b 233 dfs");
        MijlocTransport tramvai = new TramvaiFactory().createObject("b 577 kuu");
        MijlocTransport troleibuz = new TroleibuzFactory().createObject("b 766 dff");

        System.out.println(autobuz);
        System.out.println(tramvai);
        System.out.println(troleibuz);
    }
}

// de facut fabrica singleton
