package main;

import clase.DecoratorAbstract;
import clase.DecoratorConcret;
import clase.PrintBilet;
import clase.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new PrintBilet();
        printer.afiseazaMesaj();

        DecoratorAbstract decoratorAbstract = new DecoratorConcret(printer, "La multi ani!");
        decoratorAbstract.afiseazaMesaj();
        decoratorAbstract.printeazaMesaj();
    }
}
