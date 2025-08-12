package chapter14.composite;

public class Client {
    public static void main(String[] args) {

        var computer = Computer.newInstance()
                .addDevices(
                        new Body(1000, 100),
                        new Keyboard(200, 20),
                        new Monitor(300, 30)
                );

        int price = computer.price();
        System.out.println( "Price: " + price);
        int power = computer.power();
        System.out.println( "Power: " + power);
    }
}
