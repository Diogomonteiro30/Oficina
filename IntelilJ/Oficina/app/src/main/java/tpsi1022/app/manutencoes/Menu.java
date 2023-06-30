package tpsi1022.app.manutencoes;

import atec.poo.ui.Comando;
import tpsi1022.core.Gestoroficina;

public class Menu extends atec.poo.ui.Menu {
    public Menu(Gestoroficina go) {
        super(Label.TITLE, new Comando<?>[]{
                new DoInsertManutencao(go),
                new DoListAllManutencoes(go),
                new DoDeleteManutencao(go),
                new DoEditManutencao(go)
        });

    }
}
