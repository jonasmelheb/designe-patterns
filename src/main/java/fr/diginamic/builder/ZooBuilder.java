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

    public ZooBuilder appendAnimal(String nomZone, Animal animal) throws Exception {
        List<Zone> zones = zoo.getZones();
        for (Zone z :
                zones) {
            if (z.getNom().equals(nomZone)) {
                if (z.getCapacite() > z.getAnimals().size()) {
                    z.addAnimal(animal);
                } else {
                    throw new Exception("La zone est pleine");
                }
            }
        }
        return this;
    }

    public Zoo get() {
        return zoo;
    }

}
