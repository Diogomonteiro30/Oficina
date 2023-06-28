package tpsi1022.app.viaturas;

import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;
import tpsi1022.core.Gestoroficina;

public class DoDeleteViatura extends Comando<Gestoroficina> {


    public DoDeleteViatura(Gestoroficina gestoroficina) {
        super(gestoroficina, Label.DO_Delete_VIATURA);
    }

    @Override
    public void executar() throws DialogException {

    }
}
