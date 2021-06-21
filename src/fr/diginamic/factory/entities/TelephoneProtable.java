package fr.diginamic.factory.entities;

public class TelephoneProtable extends ObjetConnecte{
    public TelephoneProtable(Integer limiteVolts) {
        super(limiteVolts);
    }

    @Override
    public String toString() {
        return "TelephoneProtable";
    }
}
