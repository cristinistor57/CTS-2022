package proxy2.clase;

public class BiletRezervat implements Bilet {
    private String numeCalator;
    private int valoareBilet;

    public BiletRezervat(String numeCalator, int valoareBilet) {
        this.numeCalator = numeCalator;
        this.valoareBilet = valoareBilet;
    }

    public int getValoareBilet() {
        return valoareBilet;
    }

    @Override
    public void anulareRezervare() {
        System.out.println("Anularea biletului in valoare de " + valoareBilet + " lei este gratuita!");
    }
}
