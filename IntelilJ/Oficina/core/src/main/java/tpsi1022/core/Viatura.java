package tpsi1022.core;

public abstract class Viatura {
private String matricula;
    private String marca;
    private String modelo;
    private int ano;

    public Viatura(String matricula, String marca, String modelo, int ano) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}
