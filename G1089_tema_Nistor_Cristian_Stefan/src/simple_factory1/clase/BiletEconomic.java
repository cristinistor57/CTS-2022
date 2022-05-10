package simple_factory1.clase;

public class BiletEconomic extends Bilet{
    public BiletEconomic(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BiletEconomic{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
