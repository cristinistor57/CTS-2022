package decorator.program;

import decorator.clse.PachetCazare;
import decorator.clse.PachetTuristic;
import decorator.decorator.OfertaPachetCazare;
import decorator.decorator.OfertaPachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetCazare();
        pachetTuristic.descriere();

        OfertaPachetTuristic ofertaPachetTuristic = new OfertaPachetCazare(pachetTuristic);
        ofertaPachetTuristic.descriere();
        System.out.println("Acest pachet poate fi anulat");
        ofertaPachetTuristic.anulareRezervar();
    }
}
