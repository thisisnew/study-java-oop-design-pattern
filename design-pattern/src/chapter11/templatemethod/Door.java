package chapter11.templatemethod;

public class Door {
    private DoorStatus doorStatus;

    public Door() {
        this.doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus doorStatus() {
        return doorStatus;
    }

    public boolean isOpened() {
        return doorStatus.isOpened();
    }

    public void open() {
        doorStatus = DoorStatus.OPENED;
    }

    public void close() {
        doorStatus = DoorStatus.CLOSED;
    }
}
