package chapter12.factorymethod;

import java.util.Calendar;

public class ElevatorManagerWithDynamicScheduling extends ElevatorManager {

    public ElevatorManagerWithDynamicScheduling(int controllerCount) {
        super(controllerCount);
    }

    @Override
    protected ElevatorScheduler getScheduler() {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if (hour < 12) {
            return ResponseTimeScheduler.getInstance();
        } else {
            return ThroughputScheduler.getInstance();
        }
    }
}
