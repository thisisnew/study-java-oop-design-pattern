package chapter11.templatemethod;

public abstract class Motor {
    private final Door door;
    private MotorStatus motorStatus;

    public Motor(Door door) {
        this.door = door;
        this.motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus motorStatus() {
        return motorStatus;
    }

    public void move(Direction direction) {
        var motorStatus = this.motorStatus();
        if (motorStatus.isMoving()) {
            return;
        }

        if (door.isOpened()) {
            door.close();
        }

        moveMotor(direction);
        this.motorStatus = MotorStatus.MOVING;
    }

    protected abstract void moveMotor(Direction direction);
}
