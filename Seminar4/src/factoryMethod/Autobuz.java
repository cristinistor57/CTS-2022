package factoryMethod;

import factoryMethod.MijlocTransport;

public class Autobuz extends MijlocTransport {
    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        String result = "Autobuz " + nrInmatriculare;
        return result;
    }
}
