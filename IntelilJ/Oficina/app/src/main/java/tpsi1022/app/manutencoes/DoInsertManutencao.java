package tpsi1022.app.manutencoes;

import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;
import tpsi1022.core.Gestoroficina;

public class DoInsertManutencao extends Comando<Gestoroficina> {
    public DoInsertManutencao(Gestoroficina gestoroficina) {
        super(gestoroficina, Label.DO_INSERT_MANUTENCAO);
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("Inserir Manutencao");
    }
}
