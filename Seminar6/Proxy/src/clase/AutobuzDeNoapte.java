package clase;

public class AutobuzDeNoapte implements MijlocTransport{
    Autobuz autobuz;

    public AutobuzDeNoapte(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if (autobuz.getNrCalatori()> 0){
            System.out.println("Autobuzul de noapte a oprit in statie cu: "+ autobuz.getNrCalatori());
        }else {
            System.out.println("Nu opreste in statie: " + autobuz.getNrCalatori());
        }
    }

    @Override
    public void setNrCalatori(int nrCalatori) {
        this.setNrCalatori(nrCalatori);
    }
}
