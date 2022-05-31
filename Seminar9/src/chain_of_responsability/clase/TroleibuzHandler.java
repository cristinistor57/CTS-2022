package chain_of_responsability.clase;

public class TroleibuzHandler extends Handler {

    public TroleibuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afiseazaMijlocTransport(int distanta) {

        if (distanta < super.limita) {
            System.out.println("Poti calatori cu troleibuzul.");
        }
        else {
            handler.afiseazaMijlocTransport(distanta);
        }
    }
}
