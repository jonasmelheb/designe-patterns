package fr.diginamic.factory.facotries;

import fr.diginamic.factory.entities.*;

public class ObjectConnecteFactory {
    public static ObjetConnecte getObjectConnecte(ObjectConnecteEnum type){
        switch (type) {
            case TELEPHONE_PORTABLE:
                return new TelephoneProtable(12);
            case TABLETTE:
                return new Tablette(25);
            case ENSEINTE_CONNECTEE:
                return new EnseinteConnectee(40);
            default:
                return null;
        }
    }
}
