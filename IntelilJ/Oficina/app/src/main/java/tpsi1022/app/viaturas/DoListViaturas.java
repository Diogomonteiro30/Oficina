package tpsi1022.app.viaturas;

import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;
import tpsi1022.core.Gestoroficina;

public class DoListViaturas extends Comando<Gestoroficina> {

    public DoListViaturas(Gestoroficina gestoroficina) {
        super(gestoroficina, Label.DO_LIST_VIATURAS);
    }

    @Override
    public void executar() throws DialogException {

    }
}
