package main.java.com.tigratius.basepatterns.behavioral.state;

public class Water {

    public Water(WaterState state) {
        this.state = state;
    }

    public void setState(WaterState state) {
        this.state = state;
    }

    private WaterState state;

    public void heat()
    {
        state.Heat(this);
    }
    public void frost()
    {
        state.Frost(this);
    }
}
