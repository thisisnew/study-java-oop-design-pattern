package chapter13.abstractfactory;

public abstract class Motor {
    private MotorStatus motorStatus;

    public Motor() {
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

        moveMotor(direction);
        this.motorStatus = MotorStatus.MOVING;
    }

    protected abstract void moveMotor(Direction direction);
}
