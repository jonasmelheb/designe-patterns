package fr.diginamic.state;

public class DemoAvion {
    public static void main(String[] args) {
        Avion avion = new Avion();
        avion.setEtat(new AuSol());
        avion.rentrerTrainAtterrissage();
        avion.sortirTrainAtterrissage();

        avion.setEtat(new EnVol());
        avion.rentrerTrainAtterrissage();
        avion.sortirTrainAtterrissage();

        avion.setEtat(new EnApproche());
        avion.rentrerTrainAtterrissage();
        avion.sortirTrainAtterrissage();
    }
}
