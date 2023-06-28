package tpsi1022.app.main;


import atec.poo.ui.Comando;
import tpsi1022.core.Gestoroficina;

public class Menu extends atec.poo.ui.Menu {

    public Menu(Gestoroficina go) {
        super(Label.TITLE, new Comando<?>[]{
                new DoOpenMenuViaturas(go),
                new DoOpenMenuManuntecao(go)
        });
    }
}
