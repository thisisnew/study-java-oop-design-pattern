package chapter7.state;

public class On implements State{
    @Override
    public void onButtonPushed(Light light) {
        System.out.println("반응 없음");
    }

    @Override
    public void offButtonPushed(Light light) {
        System.out.println("Light off");
        light.setState(new Off());
    }
}
