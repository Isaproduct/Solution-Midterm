import java.util.ArrayList;
import java.util.List;

public class SmartHomeComposite implements SmartDevice {
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public SmartHomeComposite(String name) {
        this.name = name;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    @Override
    public void operate() {
        System.out.println("Operating all devices in " + name + "...");
        for (SmartDevice device : devices) {
            device.operate();
        }
    }
}
