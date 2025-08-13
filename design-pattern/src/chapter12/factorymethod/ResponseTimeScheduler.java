package chapter12.factorymethod;

public class ResponseTimeScheduler implements ElevatorScheduler {
    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
        return 0;
    }
}
