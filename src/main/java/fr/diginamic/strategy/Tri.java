package fr.diginamic.strategy;

public class Tri {
    public void exec(int typeTri, Integer[] arr) {

        // Bubble sort algorithm
        if (typeTri==1) {
            Strategy bubble = StrategyFactory.getInstanceTri(TypeTri.BUBBLE_SORT);
            bubble.trier(arr);
        }
        // insertion sort algorithm
        else if (typeTri==2) {
            Strategy bubble = StrategyFactory.getInstanceTri(TypeTri.INSERTION_SORT);
            bubble.trier(arr);
        }
        else if (typeTri==3) {
            Strategy bubble = StrategyFactory.getInstanceTri(TypeTri.SELECTION_SORT);
            bubble.trier(arr);
        }
    }
}
