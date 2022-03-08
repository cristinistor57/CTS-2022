package clase;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        ApplicantsReader angajatiReader = new AngajatiReader();
        try {
            listaAngajati = angajatiReader.citireAplicanti("angajati.txt");
            for(Aplicant angajat:listaAngajati){
                angajat.afisareReturnareSalariuZilnic(1000);
                angajat.afiseazaStatut();
                System.out.println(angajat);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
