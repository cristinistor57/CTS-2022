package adapter.autobuz;

import adapter.metrou.ValidatorMetrou;

public class AdaptorValidatorObiecte implements ValidatorAutobuz{
    private ValidatorMetrou validatorMetrou;

    public AdaptorValidatorObiecte(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void validareBilet() {
        validatorMetrou.validareCalatorie();
    }

    @Override
    public void validareAbonament() {
        validatorMetrou.validareAbonament();
    }
}
