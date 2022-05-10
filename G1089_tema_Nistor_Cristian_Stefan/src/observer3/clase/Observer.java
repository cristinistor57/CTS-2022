package observer3.clase;

public abstract class Observer {
    String nume;
    boolean anunt;

    public Observer(String nume, boolean anunt) {
        this.nume = nume;
        this.anunt = anunt;
    }

    public abstract void primesteMesaj(String mesaj);
}
