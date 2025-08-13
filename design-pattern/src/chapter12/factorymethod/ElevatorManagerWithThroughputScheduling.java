package chapter12.factorymethod;

public class ElevatorManagerWithThroughputScheduling extends ElevatorManager{

    public ElevatorManagerWithThroughputScheduling(int controllerCount) {
        super(controllerCount);
    }

    @Override
    protected ElevatorScheduler getScheduler() {
        return ThroughputScheduler.getInstance();
    }
}
