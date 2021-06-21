package fr.diginamic.builder;

public class ZooBuilderTest {
    public static void main(String[] args) {
        ZooBuilder builder = new ZooBuilder("ZOO");

        ZooBuilder zoo = builder.appendZone("zone1", 2).appendAnimal("zone1",new Lion("Di")).appendAnimal("zone1",new Lion("Di"));

        System.out.println(zoo.get());


    }
}
