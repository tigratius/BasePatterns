package main.java.com.tigratius.basepatterns.behavioral.state;

public class WaterPhaseRunner
{
    public static void main(String[] args) {

        Water water = new Water(new LiquidWaterState());
        water.heat();
        water.frost();
        water.frost();
        water.frost();
        water.heat();
    }
}
