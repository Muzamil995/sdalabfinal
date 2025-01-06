package infrastructure;

public class MotionSensor {
    private String sensorId;

    public MotionSensor(String sensorId) {
        this.sensorId = sensorId;
    }

    public boolean detectMotion() {
        System.out.println("Motion detected by sensor " + sensorId + "!");
        return true;
    }

    public void sendAlert() {
        System.out.println("Sending motion alert for sensor " + sensorId + "!");
    }
}
