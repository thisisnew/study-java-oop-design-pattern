package chapter13.abstractfactory;

public class HyundaiMotor extends Motor {

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("현대 모터 구동 방향: " + direction.name());
    }
}
