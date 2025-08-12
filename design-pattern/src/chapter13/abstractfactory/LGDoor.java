package chapter13.abstractfactory;

public class LGDoor extends Door{
    @Override
    protected void doOpen() {
        System.out.println( "LGDoor.doOpen()");
    }

    @Override
    protected void doClose() {
        System.out.println( "LGDoor.doClose()");
    }
}
