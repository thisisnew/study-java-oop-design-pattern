package chapter12.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class ElevatorManager {
    private final List<ElevatorController> controllers;

    public ElevatorManager(int controllerCount) {
        controllers = new ArrayList<>(controllerCount);

        for (int i = 0; i < controllerCount; i++) {
            controllers.add(new ElevatorController(i+1));
        }
    }

    protected  abstract ElevatorScheduler getScheduler();

    void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler = getScheduler();
        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
