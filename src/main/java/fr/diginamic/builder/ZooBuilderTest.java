package fr.diginamic.builder;

public class ZooBuilderTest {
    public static void main(String[] args) {
        ZooBuilder builder = new ZooBuilder("ZOO");

        ZooBuilder zoo = null;
        try {
            zoo = builder.appendZone("zone1", 2)
                        .appendZone("zone2",2)
                        .appendAnimal("zone1",new Lion("Lion1"))
                        .appendAnimal("zone1",new Lion("lion2"))
                        .appendAnimal("zone2",new Dauphin("dauphin1"))
                        .appendAnimal("zone2",new Dauphin("dauphin2"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(zoo.get());


    }
}
