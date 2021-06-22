package fr.diginamic.composite;

public class TestComposite {

    public static void main(String[] args) {
        Service DSIN = new Service("DSIN");
        Service BigData = new Service("Big Data");
        Service JavaDev = new Service("Java Dev");

        Employe directeur = new Employe(10000, "RASPEY", "Cécile");
        Employe architecte = new Employe(8000, "BECHKHAR", "Bilel");
        Employe chefDeProjet = new Employe(7500, "RANMEY", "JB");
        Employe concepteur = new Employe(3500, "PINTUR", "Eloi");
        Employe chefDeService = new Employe(7500, "GUINEAU", "Kevin");
        Employe leadDev = new Employe(3500, "MARTIN", "Paul");

        DSIN.addElement(directeur);
        DSIN.addElement(architecte);

        BigData.addElement(chefDeProjet);
        BigData.addElement(concepteur);

        JavaDev.addElement(chefDeService);
        JavaDev.addElement(leadDev);

        DSIN.addElement(BigData);
        DSIN.addElement(JavaDev);

        System.out.println("Salaire total de DSIN: " + DSIN.calculerSalaire());
        System.out.println("Salaire total de Big Data: " + BigData.calculerSalaire());
        System.out.println("Salaire total de Java Dev: " + JavaDev.calculerSalaire());
    }

}
