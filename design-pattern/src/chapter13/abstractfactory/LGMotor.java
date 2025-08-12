package chapter13.abstractfactory;

public class LGMotor extends Motor{

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("LG 모터 구동 방향: " + direction.name());
    }
}
