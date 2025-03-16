public class LoggingDecorator extends DeviceDecorator {
    public LoggingDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void operate() {
        System.out.println("Logging: Operating " + device.getClass().getSimpleName());
        super.operate();
    }
}
