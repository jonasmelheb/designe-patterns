package fr.diginamic.state;

public class EnApproche implements AvionEtat{
    @Override
    public void action() {
        System.out.println("Nous allons atterrir. Il est impossible de rentrer le train d'atterrissage.");
    }
}
