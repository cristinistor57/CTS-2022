package clase;

public abstract class DecoratorAbstract implements Printer{ //este clasa abstracta datorita metodei abstracte care va fi implementata mai departe in DecoratorConcret
    Printer printer;

    public DecoratorAbstract(Printer printer) {
        this.printer = printer;
    }

    public abstract void printeazaMesaj();

    @Override
    public void afiseazaMesaj() {
        printer.afiseazaMesaj();
    }
}
