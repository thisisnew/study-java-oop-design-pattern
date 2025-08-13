package chapter12.factorymethod;

public class ElevatorController {
    private final int id;

    public ElevatorController(int id) {
        this.id = id;
    }

    void gotoFloor(int destination) {
        System.out.println("go to destination " + destination);
    }
}
