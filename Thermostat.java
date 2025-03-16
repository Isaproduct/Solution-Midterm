public class Thermostat implements SmartDevice {
    private String name;
    private int temperature;

    public Thermostat(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    @Override
    public void operate() {
        System.out.println(name + " thermostat is set to " + temperature + "°C.");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
