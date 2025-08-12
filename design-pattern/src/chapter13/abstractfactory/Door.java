package chapter13.abstractfactory;

public abstract class Door {
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
        doOpen();
        doorStatus = DoorStatus.OPENED;
    }
    protected abstract void doOpen();

    public void close() {
        doClose();
        doorStatus = DoorStatus.CLOSED;
    }
    protected abstract void doClose();
}
