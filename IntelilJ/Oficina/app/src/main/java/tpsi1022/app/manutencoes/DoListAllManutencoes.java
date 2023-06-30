package tpsi1022.app.manutencoes;

import atec.poo.ui.Comando;
import tpsi1022.core.Gestoroficina;

public class DoListAllManutencoes extends Comando<Gestoroficina> {
    public DoListAllManutencoes(Gestoroficina gestoroficina) {
        super(gestoroficina, Label.DO_LIST_MANUTENCOES);
    }

    @Override
    public void executar() {
        System.out.println("Listar todas as manutencoes");
    }
}

