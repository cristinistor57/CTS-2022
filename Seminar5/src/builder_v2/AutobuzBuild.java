package builder_v2;

public class AutobuzBuild implements Build {
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsile;
    private boolean areOprire;
    private String textRulat;
    private String model;
    private int nrCalatori;

    @Override
    public AutobuzLinie build()
    {
        return new AutobuzLinie(this.nrLinie, this.numeSofer, this.deschideUsile, this.areOprire, this.textRulat, this.model, this.nrCalatori);
    }
    public AutobuzBuild() {

        this.nrLinie = 1;
        this.numeSofer = "Dorian";
        this.deschideUsile = true;
        this.areOprire = true;
        this.textRulat = "Hello";
        this.model = "Renault";
        this.nrCalatori = 60;
    }

    public AutobuzBuild setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
        return this;
    }

    public AutobuzBuild setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuild setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
        return this;
    }

    public AutobuzBuild setAreOprire(boolean areOprire) {
        this.areOprire = areOprire;
        return this;
    }

    public AutobuzBuild setTextRulat(String textRulat) {
        this.textRulat = textRulat;
        return this;
    }

    public AutobuzBuild setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuild setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
        return this;
    }
}



