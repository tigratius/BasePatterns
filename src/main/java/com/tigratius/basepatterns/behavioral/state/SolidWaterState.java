package main.java.com.tigratius.basepatterns.behavioral.state;

public class SolidWaterState implements WaterState {

    @Override
    public void Heat(Water water) {
        System.out.println("Превращаем лед в жидкость.");
        water.setState(new LiquidWaterState());
    }

    @Override
    public void Frost(Water water) {
        System.out.println("Продолжаем заморозку льда");
    }
}
