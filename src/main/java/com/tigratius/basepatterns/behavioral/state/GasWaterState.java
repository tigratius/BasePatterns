package main.java.com.tigratius.basepatterns.behavioral.state;

public class GasWaterState implements WaterState {
    @Override
    public void Heat(Water water) {
        System.out.println("Повышаем температуру водяного пара");
    }

    @Override
    public void Frost(Water water) {
        System.out.println("Превращаем водяной пар в жидкость");
        water.setState(new LiquidWaterState());
    }
}
