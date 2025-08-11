package chapter7.state;

public interface State {
    public void onButtonPushed(Light light);
    public void offButtonPushed(Light light);
}
