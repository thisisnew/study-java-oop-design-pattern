package chapter14.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Computer extends ComputerDevice {

    private final List<ComputerDevice> devices = new ArrayList<>();

    private Computer() {}

    public static Computer newInstance() {
        return new Computer();
    }

    public Computer addDevices(ComputerDevice ...devices) {
        for (var device : devices) {
            if (Objects.nonNull(device)) {
                this.devices.add(device);
            }
        }

        return this;
    }

    public void removeDevice(ComputerDevice device) {
        devices.remove(device);
    }

    @Override
    public int price() {
        return devices.stream()
                .mapToInt(ComputerDevice::price)
                .sum();
    }

    @Override
    public int power() {
        return devices.stream()
                .mapToInt(ComputerDevice::power)
                .sum();
    }
}
