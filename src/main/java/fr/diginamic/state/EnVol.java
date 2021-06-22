package fr.diginamic.state;

public class EnVol implements AvionEtat{
    @Override
    public void action() {
        System.out.println("Train d'atterrissage rentré.");
    }
}
