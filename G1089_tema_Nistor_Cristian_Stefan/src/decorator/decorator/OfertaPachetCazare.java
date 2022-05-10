package decorator.decorator;

import decorator.clse.PachetTuristic;

public class OfertaPachetCazare extends OfertaPachetTuristic{

    public OfertaPachetCazare(PachetTuristic pachetTuristic) {
        super(pachetTuristic);
    }

    @Override
    public void anulareRezervar() {
        System.out.println("Rezervarea de cazare a fost anulata.");
    }
}
