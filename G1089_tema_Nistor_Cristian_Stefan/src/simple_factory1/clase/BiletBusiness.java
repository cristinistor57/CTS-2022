package simple_factory1.clase;

public class BiletBusiness extends Bilet{
    public BiletBusiness(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BiletBusiness{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", prenume='").append(prenume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

