package memento.clase;

public class MementoAutobuz {

    private String sofer;
    private float consumMediu;

    public MementoAutobuz(String sofer, float consumMediu) {
        this.sofer = sofer;
        this.consumMediu = consumMediu;
    }

    public String getSofer() {
        return sofer;
    }

    public float getConsumMediu() {
        return consumMediu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MementoAutobuz {");
        sb.append("sofer='").append(sofer).append('\'');
        sb.append(", consumMediu=").append(consumMediu);
        sb.append('}');
        return sb.toString();
    }
}
