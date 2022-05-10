package observer3.clase;

public class Calator extends Observer {
    public Calator(String nume, boolean anunt) {
        super(nume, anunt);
    }

    @Override
    public void primesteMesaj(String mesaj)
    {
        System.out.println(nume + " ai primit informatii referitoare la zborul tau: "+ mesaj);
    }
}
