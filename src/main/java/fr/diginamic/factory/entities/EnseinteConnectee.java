package fr.diginamic.factory.entities;

public class EnseinteConnectee extends ObjetConnecte {
    public EnseinteConnectee(Integer limiteVolts) {
        super(limiteVolts);
    }

    @Override
    public String toString() {
        return "EnseinteConnectee";
    }
}
