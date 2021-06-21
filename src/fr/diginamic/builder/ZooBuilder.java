package fr.diginamic.builder;

import java.util.List;

public class ZooBuilder {
    private Zoo zoo;

    public ZooBuilder(String nom) {
        this.zoo = new Zoo(nom);
    }


    public ZooBuilder appendZone(String nom, Integer capacite) {
        zoo.addZone(new Zone(nom, capacite));
        return this;
    }

    public ZooBuilder appendAnimal(String nomZone, Animal animal){
        List<Zone> zones = zoo.getZones();
        for (Zone z :
                zones) {
            if (z.getNom().equals(nomZone)) {
                if (z.getCapacite() > z.getAnimalList().size()) {
                    z.addAnimal(animal);
                    return this;
                }
                else {
                    System.out.println("La zone est pleine");
                }
            }
        }
        return null;
    }

    public Zoo get() {
        return zoo;
    }

}
