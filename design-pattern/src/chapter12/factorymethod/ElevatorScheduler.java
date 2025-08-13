package chapter12.factorymethod;

public interface ElevatorScheduler {
    int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
