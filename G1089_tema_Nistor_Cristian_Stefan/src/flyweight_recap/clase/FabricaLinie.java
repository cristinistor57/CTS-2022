package flyweight_recap.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaLinie {
    private Map<Integer, Linie> linii;

    public FabricaLinie() {
        this.linii = new HashMap<>();
    }

    public Linie getLinie(Integer nrLinie){
        Linie linie =linii.get(nrLinie);

        if (linie!=null){
            return linie;
        }
        else {
                linie= new Linie(nrLinie, "Msndfds", "sfsgdg");
                linii.put(nrLinie, linie);
        }
        return linie;
    }
}
