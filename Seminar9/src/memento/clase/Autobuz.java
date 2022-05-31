package memento.clase;

public class Autobuz {

    private String sofer;
    private String model;
    private int anFabricatie;
    private float consumMediu;

    public Autobuz(String sofer, String model, int anFabricatie, float consumMediu) {
        this.sofer = sofer;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.consumMediu = consumMediu;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public void setConsumMediu(float consumMediu) {
        this.consumMediu = consumMediu;
    }

    public MementoAutobuz createMemento() {
        return new MementoAutobuz(this.sofer, this.consumMediu);
    }

    public void setMementoAutobuz(MementoAutobuz mementoAutobuz) {
        this.sofer = mementoAutobuz.getSofer();
        this.consumMediu = mementoAutobuz.getConsumMediu();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz {");
        sb.append("sofer='").append(sofer).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", consumMediu=").append(consumMediu);
        sb.append('}');
        return sb.toString();
    }
}
