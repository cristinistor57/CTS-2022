package template.program;

import template.clase.Tramvai;
import template.clase.TramvaiProbe;

public class Main {

    public static void main(String[] args) {
        Tramvai tramvai=new Tramvai();
        tramvai.parcurgeTraseu();
        tramvai.parcurgeTraseuInvers();

        //se pastreaza acelasi template
        TramvaiProbe tramvaiProbe=new TramvaiProbe();
        tramvaiProbe.parcurgeTraseu();

    }

}