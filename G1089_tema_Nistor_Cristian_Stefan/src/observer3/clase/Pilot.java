package observer3.clase;

public class Pilot extends Subject{
    private String numeAvion;

    public Pilot(String numeAvion) {
        this.numeAvion = numeAvion;
    }

    @Override
    public void transmiteMesaj1() {
        for (Observer calator : calatori){
            if (calator.anunt){
                calator.primesteMesaj("Avionul "+ numeAvion +"a decolat!");
            }
        }
    }
    @Override
    public void transmiteMesaj2() {
        for (Observer calator : calatori){
            if (calator.anunt){
                calator.primesteMesaj("Avionul "+ numeAvion +"a intalnit turbulente!");
            }
        }
    }
    @Override
    public void transmiteMesaj3() {
        for (Observer calator : calatori){
            if (calator.anunt){
                calator.primesteMesaj("Avionul "+ numeAvion +"a aterizat!");
            }
        }
    }
}
