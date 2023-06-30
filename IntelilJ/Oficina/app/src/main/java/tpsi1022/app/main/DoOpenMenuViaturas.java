package tpsi1022.app.main;

import atec.poo.ui.Comando;
import atec.poo.ui.exceptions.DialogException;
import tpsi1022.app.viaturas.Menu;
import tpsi1022.core.Gestoroficina;

import static javax.sound.midi.MidiSystem.getReceiver;

public class DoOpenMenuViaturas extends Comando<Gestoroficina> {
    public DoOpenMenuViaturas(Gestoroficina gestoroficina) {
        super(gestoroficina, Label.OPEN_MENU_VIATURAS);
    }

    @Override
    public void executar() throws DialogException {
        System.out.println("O utilizador gerou o evento para que se entre no Menu Viaturas");
        Menu menu = new Menu(this.getReceptor());
        menu.open();
    }
}
