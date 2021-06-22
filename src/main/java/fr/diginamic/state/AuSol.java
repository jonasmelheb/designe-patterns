package fr.diginamic.state;

public class AuSol implements AvionEtat{
    @Override
    public void actionRenter() {
        System.out.println("L'avion est au sol. Il est impossible de rentrer le train d'atterrissage.");
    }

    @Override
    public void actionSortir() {
        System.out.println("L'avion est au sol. Le train d'atterrissage est déjà sorti.");
    }
}
