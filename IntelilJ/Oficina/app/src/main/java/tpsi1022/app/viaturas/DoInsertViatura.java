package tpsi1022.app.viaturas;

import atec.poo.ui.Comando;
import atec.poo.ui.Constantes;
import atec.poo.ui.LerInteiro;
import atec.poo.ui.LerString;
import atec.poo.ui.exceptions.DialogException;
import tpsi1022.core.Gestoroficina;

public class DoInsertViatura extends Comando<Gestoroficina> {
    private LerInteiro ano;
    private LerString marca;
    private LerString modelo;
    private LerString matricula;
    public DoInsertViatura(Gestoroficina gestoroficina) {
        super(gestoroficina, Label.DO_INSERT_VIATURA);
        this.ano = new LerInteiro(Label.ASK_ANO);
        this.marca = new LerString(Label.ASK_MARCA,null);
        this.modelo = new LerString(Label.ASK_MODELO,null);
        this.matricula = new LerString(Label.ASK_MATRICULA, Constantes.MATRICULA_REGEX);
    }

    @Override
    public void executar() throws DialogException {
        ui.lerInput(this.ano);
        ui.lerInput(this.marca);
        ui.lerInput(this.modelo);
        ui.lerInput(this.matricula);
        //ui.escreveLinha(String.format("Matricula Inserida: %s", this.matricula.getValor()));
        // ui.escreveLinha(String.format("Marca Inserida: %s", this.marca.getValor()));
        //ui.escreveLinha(String.format("Modelo Inserido: %s", this.modelo.getValor()));
        //ui.escreveLinha(String.format("Ano Inserido: %s", this.ano.getValor()));
        ui.escreveLinha("Viatura inserida com sucesso!");
        this.getReceptor().criar_viatura(this.matricula.getValor(), this.marca.getValor(), this.modelo.getValor(), this.ano.getValor());
    }
}
