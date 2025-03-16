public class BasicSmartHomeFactory implements SmartHomeFactory {
    @Override
    public Light createLight(String name) {
        return new Light(name);
    }

    @Override
    public Thermostat createThermostat(String name) {
        return new Thermostat(name, 22);
    }
}
