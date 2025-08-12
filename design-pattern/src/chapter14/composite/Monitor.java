package chapter14.composite;

public class Monitor extends ComputerDevice {
    private final int price;
    private final int power;

    public Monitor(int price, int power) {
        this.price = price;
        this.power = power;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public int power() {
        return power;
    }
}
