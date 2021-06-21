package fr.diginamic.factory;

public class ObjectConnecteFactory {
    public static ObjetConnecte getObjectConnecte(ObjectConnecteEnum type){
        if (type.equals(ObjectConnecteEnum.TABLETTE)) {
            return new Tablette(25);
        } else if(type.equals(ObjectConnecteEnum.ENSEINTE_CONNECTEE)){
            return new EnseinteConnectee(40);
        } else if(type.equals(ObjectConnecteEnum.TELEPHONE_PORTABLE)) {
            return new TelephoneProtable(12);
        }
        return null;
    }
}
