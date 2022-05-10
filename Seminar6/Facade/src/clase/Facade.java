package clase;

public class Facade {
    public static void deschideUsi(Autobuz autobuz){ //fiind functie nu putem sa punem inauntru un param asa ca il trimitem noi
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public static void lasaLibereUsi(Autobuz autobuz){
        autobuz.lasaLiberaUsaFata();
        autobuz.lasaLiberaUsaMijloc();
        autobuz.lasaLiberaUsaSpate();
    }
}
