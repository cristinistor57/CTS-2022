package facade_ex2.program;

import facade_ex2.clse.Facade;

public class Main {
    public static void main(String[] args) {
        Facade pachetTuristic = new Facade();

        pachetTuristic.rezervaPachetCazareTransport("Bucuresti", "Paris");
    }
}
