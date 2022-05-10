package facade_ex1;

import facade_ex1.clase.Autobuz;
import facade_ex1.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        Facade.deschideUsi(autobuz);
        Facade.inchideUsi(autobuz);
    }
}
