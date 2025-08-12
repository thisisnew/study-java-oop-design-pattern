package chapter13.abstractfactory;

public class LGElevatorFactory extends ElevatorFactory {

    @Override
    public Motor createMotor() {
        return new LGMotor();
    }

    @Override
    public Door createDoor() {
        return new LGDoor();
    }
}
