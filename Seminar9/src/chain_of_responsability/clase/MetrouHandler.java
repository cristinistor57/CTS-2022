package chain_of_responsability.clase;

public class MetrouHandler extends Handler {

    public MetrouHandler(int limita) {
        super(limita);
    }

    @Override
    public void afiseazaMijlocTransport(int distanta) {

        if (distanta < super.limita) {
            System.out.println("Poti calatori cu metroul.");
        }
        else {
            handler.afiseazaMijlocTransport(distanta);
        }
    }
}
