package builder;

public class AutobuzBuild implements Build {
    AutobuzLinie autobuzLinie;

    public AutobuzBuild() {
        this.autobuzLinie = new AutobuzLinie();
    }

    @Override
    public AutobuzLinie build() {
        return autobuzLinie;
    }

    public AutobuzBuild setNrLinie(int nrLinie) {
        this.autobuzLinie.setNrLinie(nrLinie);
        return this;
    }

    public AutobuzBuild setNumeSofer(String numeSofer) {
        this.autobuzLinie.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuild setDeschideUsile(boolean deschideUsile) {
        this.autobuzLinie.setDeschideUsile(deschideUsile);
        return this;
    }

    public AutobuzBuild setAreOprire(boolean areOprire) {
        this.autobuzLinie.setAreOprire(areOprire);
        return this;
    }
    public AutobuzBuild setTextRulat(String textRulat) {
        this.autobuzLinie.setTextRulat(textRulat);
        return this;
    }
    public AutobuzBuild setModel(String model) {
        this.autobuzLinie.setModel(model);
        return this;
    }
    public AutobuzBuild setNrCalatori(int nrCalatori) {
        this.autobuzLinie.setNrCalatori(nrCalatori);
        return this;
    }
}
