package facade_ex1.clase;

public class Facade {
    public static void deschideUsi(Autobuz autobuz){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaSpate();
    }
    public static void inchideUsi(Autobuz autobuz){
        autobuz.inchideUsaFata();
        autobuz.inchideUsaSpate();
    }

}
