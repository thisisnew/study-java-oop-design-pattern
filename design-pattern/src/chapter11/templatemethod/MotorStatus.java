package chapter11.templatemethod;

public enum MotorStatus {
    MOVING,
    STOPPED;

    public boolean isMoving() {
        return this == MOVING;
    }
}
