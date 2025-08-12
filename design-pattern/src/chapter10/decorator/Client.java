package chapter10.decorator;

public class Client {
    public static void main(String[] args) {
        Display basicRoad = new BasicRoadDisplay();
        basicRoad.draw();

        Display roadWithLane = new LandDecorator(new BasicRoadDisplay());
        roadWithLane.draw();

        Display roadWithTraffic = new TrafficDecorator(new BasicRoadDisplay());
        roadWithTraffic.draw();

        Display roadWithTrafficAndLane = new TrafficDecorator(new LandDecorator(new BasicRoadDisplay()));
        roadWithTrafficAndLane.draw();
    }
}
