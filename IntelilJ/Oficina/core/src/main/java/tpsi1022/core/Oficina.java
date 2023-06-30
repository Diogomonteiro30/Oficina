package tpsi1022.core;

import java.util.Hashtable;

public class Oficina {
    private String nome;
    private String morada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    private Hashtable<String,Viatura> todasViaturas;
    public Oficina(String nome, String morada) {
        this.nome = nome;
        this.morada = morada;
        this.todasViaturas = new Hashtable<>();
    }
    /**
     *
     * @param matricula
     * @param marca
     * @param modelo
     * @param ano
     * @return
     */
    public String criar_viatura(String matricula, String marca, String modelo, int ano) {
        System.out.println(String.format("Estou no objeto Ofinica a criar a viatura %s %s %s %d", matricula, marca, modelo, ano));
        return "";
    }
}
