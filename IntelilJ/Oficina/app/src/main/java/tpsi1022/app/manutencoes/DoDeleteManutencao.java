package tpsi1022.app.manutencoes;

import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;
import tpsi1022.core.Gestoroficina;

public class DoDeleteManutencao extends Comando<Gestoroficina> {
    public DoDeleteManutencao(Gestoroficina gestoroficina) {
        super(gestoroficina, Label.DO_Delete_MANUTENCAO);
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("Apagar Manutencao");
    }
}
