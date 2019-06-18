package main.java.com.tigratius.basepatterns.creational.factorymethod;

public class Program {

    public static void main(String[] args) {

        /*RoadLogistics roadLogistics = new RoadLogistics();
        Car t = roadLogistics.CreateTransport();
        t.deliver();

        SeaLogistics seaLogistics = new SeaLogistics();
        Car s = seaLogistics.CreateTransport();
        s.deliver();*/

        (createLogisticByType(TransportType.SHIP)).CreateTransport().deliver();
        (createLogisticByType(TransportType.TRUCK)).CreateTransport().deliver();
        (createLogisticByType(TransportType.PLANE)).CreateTransport().deliver();
    }

    static Logistics createLogisticByType(TransportType type)
    {
        if (type == TransportType.SHIP)
        {
            return new SeaLogistics();
        }
        else if (type == TransportType.TRUCK)
        {
            return new RoadLogistics();
        }else if (type == TransportType.PLANE)
        {
            return new AirLogistics();
        }

         throw new RuntimeException(type + "is unknown!!!");
    }
}
