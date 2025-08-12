package chapter11.templatemethod;

public class HyundaiMotor extends Motor {

    public HyundaiMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("현대 모터 구동 방향: " + direction.name());
    }
}
