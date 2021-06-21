package fr.diginamic.factory;

public class FactoryTest {
    public static void main(String[] args) {
        ObjetConnecte obj1 = ObjectConnecteFactory.getObjectConnecte(ObjectConnecteEnum.ENSEINTE_CONNECTEE);
        System.out.println(obj1);
        ObjetConnecte obj2 = ObjectConnecteFactory.getObjectConnecte(ObjectConnecteEnum.TABLETTE);
        System.out.println(obj2);
        ObjetConnecte obj3 = ObjectConnecteFactory.getObjectConnecte(ObjectConnecteEnum.TELEPHONE_PORTABLE);
        System.out.println(obj3);
    }
}
