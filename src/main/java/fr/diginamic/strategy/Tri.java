package fr.diginamic.strategy;

public class Tri {
    public void exec(TypeTri typeTri, Integer[] arr) {
        switch (typeTri) {
            case BUBBLE_SORT:
                Strategy bubble = StrategyFactory.getInstanceTri(TypeTri.BUBBLE_SORT);
                if (bubble != null) {
                    bubble.trier(arr);
                }
                break;
            case INSERTION_SORT:
                Strategy insertion = StrategyFactory.getInstanceTri(TypeTri.INSERTION_SORT);
                if (insertion != null) {
                    insertion.trier(arr);
                }
                break;
            case SELECTION_SORT:
                Strategy selection = StrategyFactory.getInstanceTri(TypeTri.SELECTION_SORT);
                if (selection != null) {
                    selection.trier(arr);
                }
                break;
            default:
                System.out.println("Type " + typeTri + "n'existe pas");
        }
    }
}
