package clase;

public class Autobuz implements MijlocTransport{
    private String numeSofer;
    private int nrCalatori;
    private int nrLocuri;

    public Autobuz(String numeSofer, int nrCalatori, int nrLocuri) {
        this.numeSofer = numeSofer;
        this.nrCalatori = nrCalatori;
        this.nrLocuri = nrLocuri;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", nrCalatori=").append(nrCalatori);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul a oprit in statie cu: "+ nrCalatori);
    }

    @Override
    public void setNrCalatori(int nrCalatori) {
        this.nrCalatori=nrCalatori;
    }


}
