package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class Zone {
    private String nom;
    private Integer capacite;
    private List<Animal> animals = new ArrayList<>();

    public Zone() {
    }

    public Zone(String nom, Integer capacite) {
        this.nom = nom;
        this.capacite = capacite;
    }

    public Zone(String nom, Integer capacite, List<Animal> animals) {
        this.nom = nom;
        this.capacite = capacite;
        this.animals = animals;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }

    @Override
    public String toString() {
        return "Zone{" +
                "nom='" + nom + '\'' +
                ", capacite=" + capacite +
                ", animals=" + animals +
                "} \n";
    }
}
