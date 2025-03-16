public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartHomeFactory factory = new AdvancedSmartHomeFactory();
        Light light1 = factory.createLight("Living Room");
        Thermostat thermostat1 = factory.createThermostat("Main Hall");

        SmartHomeComposite livingRoom = new SmartHomeComposite("Living Room");
        livingRoom.addDevice(light1);
        livingRoom.addDevice(thermostat1);

        SmartDevice scheduledLight = new ScheduledOperationDecorator(light1, "10:00 PM");

        SmartHomeController controller = new SmartHomeController();
        controller.addDevice(livingRoom);
        controller.addDevice(scheduledLight);

        LegacyDoorLockSystem legacyLock = new LegacyDoorLockSystem();
        DoorLockAdapter adaptedLock = new DoorLockAdapter(legacyLock);
        controller.addDevice(adaptedLock);

        controller.turnAllOn();
    }
}
