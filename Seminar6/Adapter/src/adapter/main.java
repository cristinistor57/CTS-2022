package adapter;

import adapter.autobuz.AdapterValidatorMetrou;
import adapter.autobuz.AdaptorValidatorObiecte;
import adapter.autobuz.Autobuz;
import adapter.metrou.ValidatorMetrou;

public class main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        ValidatorMetrou metrou = new ValidatorMetrou();

        AdaptorValidatorObiecte adaptorValidatorObiecte = new AdaptorValidatorObiecte(metrou);
        adaptorValidatorObiecte.validareBilet();
        adaptorValidatorObiecte.validareAbonament();

        AdapterValidatorMetrou validatorMetrou = new AdapterValidatorMetrou(); // este un obiect validator metrou cat si terestru
        validatorMetrou.validareBilet();
        validatorMetrou.validareAbonament();
    }
}
