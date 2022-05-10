package proxy2.clase;

public class BiletAnulareGratuita implements Bilet{

    BiletRezervat biletRezervat;

    public BiletAnulareGratuita(BiletRezervat biletRezervat) {
        this.biletRezervat = biletRezervat;
    }

    @Override
    public void anulareRezervare() {
        if (biletRezervat.getValoareBilet() < 100)
        {
            biletRezervat.anulareRezervare();
        }
        else {
            System.out.println("Anularea biletului in valoare de " + biletRezervat.getValoareBilet() + " lei va costa 50 lei!");
        }
    }
}
