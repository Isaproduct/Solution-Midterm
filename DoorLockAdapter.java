public class DoorLockAdapter implements SmartDevice {
    private LegacyDoorLockSystem legacyLock;

    public DoorLockAdapter(LegacyDoorLockSystem legacyLock) {
        this.legacyLock = legacyLock;
    }

    @Override
    public void operate() {
        legacyLock.unlock();
    }
}
