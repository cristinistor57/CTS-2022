package observer.program;



import observer.clase.Autobuz;
import observer.clase.Calator;
import observer.clase.Subiect;
import observer.clase.Observer;

public class Main {

    public static void main(String[] args) {
        Subiect autobuz=new Autobuz(32);
        Observer calator1=new Calator("Alex");
        Observer calator2=new Calator("Cristi");
        Observer calator3=new Calator("Maria");

        autobuz.adaugaCalatori(calator1);
        autobuz.adaugaCalatori(calator2);
        autobuz.notificareCalatori();
        autobuz.adaugaCalatori(calator3);
        autobuz.stergeCalatori(calator2);
        autobuz.notificareCalatori();

    }

}