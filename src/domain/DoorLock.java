package domain;

public class DoorLock extends SecurityDevice {

    public DoorLock(String deviceId) {
        super(deviceId);
    }

    @Override
    public void activate() {
        status = "locked";
        System.out.println("domain.DoorLock " + deviceId + " locked.");
    }

    @Override
    public void deactivate() {
        status = "unlocked";
        System.out.println("domain.DoorLock " + deviceId + " unlocked.");
    }

    public void lock() {
        activate();
    }

    public void unlock() {
        deactivate();
    }
}
