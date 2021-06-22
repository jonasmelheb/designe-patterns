package fr.diginamic.state;

public class AuSol implements AvionEtat{
    @Override
    public void action() {
        System.out.println("L'avion est au sol. Il est impossible de rentrer le train d'atterrissage.");
    }
}
