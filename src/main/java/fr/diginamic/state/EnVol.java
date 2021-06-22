package fr.diginamic.state;

public class EnVol implements AvionEtat{
    @Override
    public void actionRenter() {
        System.out.println("Train d'atterrissage rentré.");
    }

    @Override
    public void actionSortir() {
        System.out.println("L'avion est en vol. Il est interdit de sortir le train d'atterrissage.");
    }
}
