package tpsi1022.core;

public class Motociclos extends Viatura{
    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Motociclos(String matricula, String marca, String modelo, int ano) {
        super(matricula, marca, modelo, ano);
    }
}
