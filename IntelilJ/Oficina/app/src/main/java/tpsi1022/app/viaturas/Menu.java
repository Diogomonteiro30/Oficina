package tpsi1022.app.viaturas;

import atec.poo.ui.Comando;
import tpsi1022.core.Gestoroficina;

public class Menu extends atec.poo.ui.Menu{
    public Menu(Gestoroficina go) {
        super(Label.TITLE, new Comando<?>[]{
                new DoInsertViatura(go),
                new DoShowViaturas(go),
                new DoListViaturas(go),
                new DoDeleteViatura(go),
                new DoEditViatura(go)
        });
    }
}
