package tpsi1022.app.viaturas;

import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;
import tpsi1022.core.Gestoroficina;

public class DoShowViaturas extends Comando<Gestoroficina> {
    public DoShowViaturas(Gestoroficina gestoroficina) {
        super(gestoroficina, Label.DO_SHOW_VIATURA);
    }

    @Override
    public void executar() throws DialogException {

    }
}
