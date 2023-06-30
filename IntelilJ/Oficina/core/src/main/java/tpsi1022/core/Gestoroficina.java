package tpsi1022.core;

public class Gestoroficina {
    Oficina o;

    public Gestoroficina(){
        this.o = new Oficina("Oficina", "Rua da Oficina");
    }

    public String criar_viatura(String matricula, String marca, String modelo, int ano){
        return this.o.criar_viatura(matricula, marca, modelo, ano);
    }
}
