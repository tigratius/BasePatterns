package main.java.com.tigratius.basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class HouseFactory {
    Map<HouseType, House> houses = new HashMap<>();

    public House getHouseByType(HouseType houseType)
    {
        House house = houses.get(houseType);

        if (house == null)
        {
            switch (houseType) {
                case BRICK:
                    System.out.println("Проект на застройку кирпичного дома получен...");
                    house = new BrickHouse();
                    break;
                case PANEL:
                    System.out.println("Проект на застройку панельного дома получен...");
                    house = new PanelHouse();
                    break;
            }
            houses.put(houseType, house);
        }

        return house;
    }
}
