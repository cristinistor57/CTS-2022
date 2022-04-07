package main_prototype;

import prototype.Autobuz;
import prototype.MijlocTransport;
import prototype.Tramvai;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz=new Autobuz("Gigel");
        try {
            MijlocTransport autobuz1 = autobuz.copiaza();
            System.out.println(autobuz.toString()+ "\n"+autobuz1.toString());
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Tramvai tramvai=new Tramvai("Gelu");
    }
}
