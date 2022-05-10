package clase;

public class PlataCardBancar implements ModalitatePlata{
    @Override
    public void plateste(float sumaDePLata) {
        System.out.println("S-a achitat prin card bancar suma de "+ sumaDePLata + "lei");

    }
}
