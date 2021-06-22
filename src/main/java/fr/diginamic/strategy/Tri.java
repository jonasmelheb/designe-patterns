package fr.diginamic.strategy;

public class Tri {
    public void exec(TypeTri typeTri, Integer[] arr) {
        switch (typeTri) {
            case BUBBLE_SORT:
                Strategy bubble = StrategyFactory.getInstanceTri(TypeTri.BUBBLE_SORT);
                bubble.trier(arr);
            case INSERTION_SORT:
                Strategy insertion = StrategyFactory.getInstanceTri(TypeTri.INSERTION_SORT);
                insertion.trier(arr);
            case SELECTION_SORT:
                Strategy selection = StrategyFactory.getInstanceTri(TypeTri.SELECTION_SORT);
                selection.trier(arr);
        }
    }
}
