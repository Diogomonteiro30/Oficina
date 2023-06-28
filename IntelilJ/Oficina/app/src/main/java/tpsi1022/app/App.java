package tpsi1022.app;

import tpsi1022.app.main.Menu;
import tpsi1022.core.Gestoroficina;

public class App {
    public static void main(String[] args) {
        Gestoroficina go = new Gestoroficina();
        Menu menu= new Menu(go);
        menu.open();

    }
}
