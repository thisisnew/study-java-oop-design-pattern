package chapter13.abstractfactory;

public enum MotorStatus {
    MOVING,
    STOPPED;

    public boolean isMoving() {
        return this == MOVING;
    }
}
