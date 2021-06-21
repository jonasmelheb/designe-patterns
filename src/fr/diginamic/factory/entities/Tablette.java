package fr.diginamic.factory.entities;

public class Tablette extends ObjetConnecte {
    public Tablette(Integer limiteVolts) {
        super(limiteVolts);
    }

    @Override
    public String toString() {
        return "Tablette";
    }
}
