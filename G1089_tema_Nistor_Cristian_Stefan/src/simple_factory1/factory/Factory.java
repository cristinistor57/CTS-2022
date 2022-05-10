package simple_factory1.factory;

import simple_factory1.clase.Bilet;
import simple_factory1.clase.BiletBusiness;
import simple_factory1.clase.BiletEconomic;
import simple_factory1.clase.TipBilet;

public class Factory {
    public Bilet createBilet(TipBilet tipBilet, String nume, String prenume) throws Exception {
        switch (tipBilet){
            case BUSINESS:
                return new BiletBusiness(nume, prenume);
            case ECONOMIC:
                return new BiletEconomic(nume, prenume);
            default:
                throw new Exception("Nu a fost introdus tipul corect de bilet");
        }
    }
}
