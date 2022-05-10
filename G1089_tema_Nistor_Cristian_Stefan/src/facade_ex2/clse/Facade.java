package facade_ex2.clse;

public class Facade {
    public void rezervaPachetCazareTransport(String orasPlecare, String orasDestinatie){
        CompanieAeriana companieAeriana = new CompanieAeriana("Turkish AirLines");

        Zbor zborDus = companieAeriana.rezervaBiletAvion(orasPlecare, orasDestinatie);
        Zbor zborIntors = companieAeriana.rezervaBiletAvion(orasPlecare,orasDestinatie);

        Hotel hotel = new Hotel("Radisson");
        System.out.println(zborDus.toString());
        System.out.println(zborIntors.toString());
        hotel.rezervaCamera(orasDestinatie);
    }
}
