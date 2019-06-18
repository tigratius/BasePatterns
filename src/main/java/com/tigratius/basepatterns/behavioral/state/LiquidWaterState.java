package main.java.com.tigratius.basepatterns.behavioral.state;

public class LiquidWaterState implements WaterState {
    @Override
    public void Heat(Water water) {
        System.out.println("Превращаем жидкость в пар");
        water.setState(new GasWaterState());
    }

    @Override
    public void Frost(Water water) {
        System.out.println("Превращаем жидкость в лед");
        water.setState(new SolidWaterState());
    }
}
