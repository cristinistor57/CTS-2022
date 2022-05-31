package chain_of_responsability.clase;

public class TramvaiHandler extends Handler {

    public TramvaiHandler(int limita) {
        super(limita);
    }

    @Override
    public void afiseazaMijlocTransport(int distanta) {

        if (distanta < super.limita) {
            System.out.println("Poti calatori cu tramvaiul.");
        }
        else {
            handler.afiseazaMijlocTransport(distanta);
        }
    }
}
