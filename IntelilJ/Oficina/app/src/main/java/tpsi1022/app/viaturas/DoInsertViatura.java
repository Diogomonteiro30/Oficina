package tpsi1022.app.viaturas;

import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;
import tpsi1022.core.Gestoroficina;

public class DoInsertViatura extends Comando<Gestoroficina> {
    public DoInsertViatura(Gestoroficina gestoroficina) {
        super(gestoroficina, Label.DO_INSERT_VIATURA);
    }

    @Override
    public void executar() throws DialogException {

    }
}
