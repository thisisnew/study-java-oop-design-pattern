package chapter13.abstractfactory;

public class Client {
    public static void main(String[] args) {
        ElevatorFactory hyundaiFactory = new HyundaiElevatorFactory();
        Door hyundaiDoor = hyundaiFactory.createDoor();
        Motor hyundaiMotor = hyundaiFactory.createMotor();
        hyundaiDoor.open();
        hyundaiMotor.moveMotor(Direction.UP);
        hyundaiDoor.close();

        ElevatorFactory lgFactory = new LGElevatorFactory();
        Door lgDoor = lgFactory.createDoor();
        Motor lgMotor = lgFactory.createMotor();
        lgDoor.open();
        lgMotor.moveMotor(Direction.DOWN);
        lgDoor.close();
    }
}
