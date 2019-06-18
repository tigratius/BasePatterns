package main.java.com.tigratius.basepatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilderRunner {
    public static void main(String[] args) {

        HouseFactory factory = new HouseFactory();

        List<House> houses = new ArrayList<>();

        houses.add(factory.getHouseByType(HouseType.BRICK));
        houses.add(factory.getHouseByType(HouseType.BRICK));
        houses.add(factory.getHouseByType(HouseType.BRICK));
        houses.add(factory.getHouseByType(HouseType.BRICK));
        houses.add(factory.getHouseByType(HouseType.PANEL));
        houses.add(factory.getHouseByType(HouseType.PANEL));
        houses.add(factory.getHouseByType(HouseType.PANEL));

        for (House h : houses
        ) {
            h.build();
        }
    }
}
