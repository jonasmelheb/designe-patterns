package fr.diginamic.composite;

public class TestComposite {

    public static void main(String[] args) {
        Service ser1 = new Service("DSIN");
        Service ser2 = new Service("Big Data");
        Service ser3 = new Service("Java Dev");

        Employe emp1 = new Employe(10000, "RASPEY", "Cécile");
        Employe emp2 = new Employe(8000, "BECHKHAR", "Bilel");
        Employe emp3 = new Employe(7500, "RANMEY", "JB");
        Employe emp4 = new Employe(3500, "PINTUR", "Eloi");
        Employe emp5 = new Employe(7500, "GUINEAU", "Kevin");
        Employe emp6 = new Employe(3500, "MARTIN", "Paul");

        ser1.addElement(emp1);
        ser1.addElement(emp2);

        ser2.addElement(emp3);
        ser2.addElement(emp4);

        ser3.addElement(emp5);
        ser3.addElement(emp6);

        ser1.addElement(ser2);
        ser1.addElement(ser3);

        System.out.println(ser1.calculerSalaire());
        System.out.println(ser2.calculerSalaire());
        System.out.println(ser3.calculerSalaire());
    }

}
