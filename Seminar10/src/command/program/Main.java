package command.program;

import command.clase.Autobuz;
import command.clase.ComandaPlecareTraseu;
import command.clase.Operator;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Autobuz autobuz1 = new Autobuz("bmw");
        Autobuz autobuz2 = new Autobuz("man");

        ComandaPlecareTraseu comandaPlecareTraseu = new ComandaPlecareTraseu(1, autobuz1);
        operator.invoca(comandaPlecareTraseu);

        operator.invoca(new ComandaPlecareTraseu(2, autobuz2));
        operator.invoca(new ComandaPlecareTraseu(4, autobuz1));
        operator.invoca(new ComandaPlecareTraseu(3, autobuz1));
        operator.invoca(new ComandaPlecareTraseu(2, autobuz2));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}
