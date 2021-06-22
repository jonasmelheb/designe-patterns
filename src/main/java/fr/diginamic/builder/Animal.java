package fr.diginamic.builder;

public class Animal {
    private String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
