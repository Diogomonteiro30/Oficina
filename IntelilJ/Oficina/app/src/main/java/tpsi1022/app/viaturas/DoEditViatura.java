package tpsi1022.app.viaturas;

import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;
import tpsi1022.core.Gestoroficina;

public class DoEditViatura extends Comando<Gestoroficina> {
    public DoEditViatura(Gestoroficina gestoroficina) {
        super(gestoroficina, Label.DO_EDIT_VIATURA);
    }

    @Override
    public void executar() throws DialogException {

    }
}
