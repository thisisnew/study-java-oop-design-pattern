package chapter13.abstractfactory;

public class HyundaiDoor extends Door {

    @Override
    protected void doOpen() {
        System.out.println( "HyundaiDoor.doOpen()");
    }

    @Override
    protected void doClose() {
        System.out.println( "HyundaiDoor.doClose()");
    }
}
