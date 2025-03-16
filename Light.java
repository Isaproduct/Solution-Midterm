public class Light implements SmartDevice {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        System.out.println(name + " light is turned on.");
    }
}
