package fr.diginamic.state;

public class Avion {

    private AvionEtat etat;

    public void rentrerTrainAtterrissage() {
        etat.actionRenter();
    }

    public void sortirTrainAtterrissage() {
       etat.actionSortir();
    }

    /**
     * Getter
     *
     * @return the etat
     */
    public AvionEtat getEtat() {
        return etat;
    }

    /**
     * Setter
     *
     * @param etat the etat to set
     */
    public void setEtat(AvionEtat etat) {
        this.etat = etat;
    }
}
