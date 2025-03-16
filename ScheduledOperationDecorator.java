public class ScheduledOperationDecorator extends DeviceDecorator {
    private String schedule;

    public ScheduledOperationDecorator(SmartDevice device, String schedule) {
        super(device);
        this.schedule = schedule;
    }

    @Override
    public void operate() {
        System.out.println("Scheduled operation at " + schedule);
        super.operate();
    }
}
