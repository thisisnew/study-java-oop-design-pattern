package chapter13.abstractfactory;

public abstract class ElevatorFactory {
    public abstract Motor createMotor();
    public abstract Door createDoor();
}
