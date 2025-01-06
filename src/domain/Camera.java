package domain;

public class Camera extends SecurityDevice {
    private String resolution;

    public Camera(String deviceId, String resolution) {
        super(deviceId);
        this.resolution = resolution;
    }

    @Override
    public void activate() {
        status = "active";
        System.out.println("domain.Camera " + deviceId + " activated.");
    }

    @Override
    public void deactivate() {
        status = "inactive";
        System.out.println("domain.Camera " + deviceId + " deactivated.");
    }

    public void startRecording() {
        if ("active".equalsIgnoreCase(status)) {
            System.out.println("domain.Camera " + deviceId + " is recording.");
        } else {
            System.out.println("domain.Camera " + deviceId + " is not active.");
        }
    }

    public void stopRecording() {
        System.out.println("domain.Camera " + deviceId + " stopped recording.");
    }
}
