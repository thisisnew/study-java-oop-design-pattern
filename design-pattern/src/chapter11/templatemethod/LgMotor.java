package chapter11.templatemethod;

public class LgMotor extends Motor {
    public LgMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("LG 모터를 구동 방향: " + direction.name());
    }
}
