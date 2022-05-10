package clase;

public class PlataSMS implements ModalitatePlata{
    @Override
    public void plateste(float sumaDePLata) {
        System.out.println("S-a achitat prin SMS suma de "+ sumaDePLata + "lei");
    }
}
