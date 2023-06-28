package tpsi1022.app.main;

import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;
import tpsi1022.core.Gestoroficina;

public class DoOpenMenuViaturas extends Comando<Gestoroficina> {
    public DoOpenMenuViaturas(Gestoroficina gestoroficina) {
        super(gestoroficina, Label.OPEN_MENU_VIATURAS);
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("O utilizador gerou o evento para que se entre no Menu Viaturas");
    }
}
