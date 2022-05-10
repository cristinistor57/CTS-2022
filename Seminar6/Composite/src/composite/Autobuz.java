package composite;

public class Autobuz implements Nod{

    private String model;
    private int nrLocuri;
    private String producator;

    public Autobuz(String model, int nrLocuri, String producator) {
        this.model = model;
        this.nrLocuri = nrLocuri;
        this.producator = producator;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", producator='").append(producator).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void adaugaNod(Nod nod) throws Exception {
        throw new Exception("Nu se poate adauga!");
    }

    @Override
    public void stergeNod(Nod nod) throws Exception {

        throw new Exception("Nu se poate sterge!");
    }

    @Override
    public Nod getNod(int poz) throws Exception {

        throw new Exception("Nu se poate obtine!");
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(this.toString());
    }

    @Override
    public float calculeazaSumaGarantie(float pretPeLoc) {
        return nrLocuri * pretPeLoc;
    }
}
