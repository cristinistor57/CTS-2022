package factoryMethod;

import factoryMethod.MijlocTransport;

public class AutobuzFactory implements Factory{
    @Override
    public MijlocTransport createObject(String nrInmatriculare){
        return new Autobuz(nrInmatriculare);
    }
}
