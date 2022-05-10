package proxy2.program;

import proxy2.clase.BiletAnulareGratuita;
import proxy2.clase.BiletRezervat;

public class Main {
    public static void main(String[] args) {
        BiletRezervat biletRezervat1 = new BiletRezervat("Andrei", 200);
        BiletRezervat biletRezervat2 = new BiletRezervat("Marta", 500);
        BiletRezervat biletRezervat3 = new BiletRezervat("Diana", 20);
        BiletRezervat biletRezervat4 = new BiletRezervat("Alex", 50);

        biletRezervat1.anulareRezervare();
        biletRezervat2.anulareRezervare();
        biletRezervat3.anulareRezervare();
        biletRezervat4.anulareRezervare();

        BiletAnulareGratuita biletAnulareGratuita1 =new BiletAnulareGratuita(biletRezervat1);
        BiletAnulareGratuita biletAnulareGratuita2 =new BiletAnulareGratuita(biletRezervat2);
        BiletAnulareGratuita biletAnulareGratuita3 =new BiletAnulareGratuita(biletRezervat3);
        BiletAnulareGratuita biletAnulareGratuita4 =new BiletAnulareGratuita(biletRezervat4);

        biletAnulareGratuita1.anulareRezervare();
        biletAnulareGratuita2.anulareRezervare();
        biletAnulareGratuita3.anulareRezervare();
        biletAnulareGratuita4.anulareRezervare();
    }
}
