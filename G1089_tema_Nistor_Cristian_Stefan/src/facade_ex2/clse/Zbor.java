package facade_ex2.clse;

public class Zbor {
    private final CompanieAeriana companieAeriana;
    private final String orasPlecare;
    private final String destinatie;

    public Zbor(CompanieAeriana companieAeriana, String orasPlecare, String destinatie) {
        this.companieAeriana = companieAeriana;
        this.orasPlecare = orasPlecare;
        this.destinatie = destinatie;
    }

    @Override
    public String toString() {
        return "Zbor{" + "companieAeriana=" + companieAeriana +
                ", orasPlecare='" + orasPlecare + '\'' +
                ", destinatie='" + destinatie + '\'' +
                '}';
    }
}
