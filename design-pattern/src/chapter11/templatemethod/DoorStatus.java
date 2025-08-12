package chapter11.templatemethod;

public enum DoorStatus {
    CLOSED,
    OPENED;

    public boolean isOpened() {
        return this == OPENED;
    }

    public boolean isClosed() {
        return this == CLOSED;
    }
}
