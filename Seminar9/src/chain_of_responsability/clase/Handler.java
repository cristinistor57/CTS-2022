package chain_of_responsability.clase;

public abstract class Handler {

    protected Handler handler;

    protected int limita;

    public Handler(int limita) {
        this.handler = null;
        this.limita = limita;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public void setLimita(int limita) {
        this.limita = limita;
    }

    public abstract void afiseazaMijlocTransport(int distanta);

}
