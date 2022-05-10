package observer3.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected List<Observer> calatori;

    public Subject() {
        this.calatori = new ArrayList<>();
    }

    public void adaugaCalator(Observer calator){
        calatori.add(calator);
    }
    public void stergeCalator(Observer calator){
        calatori.remove(calator);
    }

    public abstract void transmiteMesaj1();
    public abstract void transmiteMesaj2();
    public abstract void transmiteMesaj3();
}
