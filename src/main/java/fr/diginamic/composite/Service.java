package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {
    private String nom;
    private List<IElement> elements = new ArrayList<>();

    @Override
    public double calculerSalaire() {
        double salaire = 0;
        for (IElement e:
             elements) {
                salaire += e.calculerSalaire();
        }
        return salaire;
    }

    public Service() {
    }

    public Service(String nom) {
        this.nom = nom;
    }

    public void addElement(IElement element) {
        elements.add(element);
    }

    public List<IElement> getElements() {
        return elements;
    }

    public void setElements(List<IElement> elements) {
        this.elements = elements;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
