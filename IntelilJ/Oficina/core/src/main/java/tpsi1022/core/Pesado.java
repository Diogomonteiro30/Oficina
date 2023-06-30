package tpsi1022.core;

public class Pesado extends Viatura{
    private int peso;
    private int numero_eixos;

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getNumero_eixos() {
        return numero_eixos;
    }

    public void setNumero_eixos(int numero_eixos) {
        this.numero_eixos = numero_eixos;
    }

    public Pesado(String matricula, String marca, String modelo, int ano) {
        super(matricula, marca, modelo, ano);
    }
}
