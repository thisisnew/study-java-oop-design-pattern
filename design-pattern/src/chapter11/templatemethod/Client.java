package chapter11.templatemethod;

public class Client {
    public static void main(String[] args) {
        Motor hyundaiMotor = new HyundaiMotor(new Door());
        hyundaiMotor.moveMotor(Direction.RIGHT);

        Motor lgMotor = new LgMotor(new Door());
        lgMotor.moveMotor(Direction.LEFT);
    }
}
