package tpsi1022.app.main;

import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;
import tpsi1022.core.Gestoroficina;

public class DoOpenMenuManuntecao extends Comando<Gestoroficina> {

    public DoOpenMenuManuntecao(Gestoroficina gestoroficina) {
        super(gestoroficina, Label.OPEN_MENU_MANUTENCAO);
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("O utilizador gerou o evento para que se entre no Menu Manunteção");
    }
}
