package chain_of_responsability.clase;

public class AutobuzHandler extends Handler {

    public AutobuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afiseazaMijlocTransport(int distanta) {

        if (distanta < super.limita) {
            System.out.println("Poti calatori cu autobuzul.");
        }
        else {
            handler.afiseazaMijlocTransport(distanta);
        }
    }
}
