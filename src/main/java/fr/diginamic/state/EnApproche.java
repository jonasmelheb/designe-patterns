package fr.diginamic.state;

public class EnApproche implements AvionEtat{
    @Override
    public void actionRenter() {
        System.out.println("Nous allons atterrir. Il est impossible de rentrer le train d'atterrissage.");
    }

    @Override
    public void actionSortir() {
        System.out.println("Nous allons atterrir. Le train d'atterrissage est sorti.");
    }
}
