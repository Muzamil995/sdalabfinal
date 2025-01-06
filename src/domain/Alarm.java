package domain;

public class Alarm {
    private String alarmId;

    public Alarm(String alarmId) {
        this.alarmId = alarmId;
    }

    public void soundAlarm() {
        System.out.println("domain.Alarm " + alarmId + " is sounding!");
    }

    public void stopAlarm() {
        System.out.println("domain.Alarm " + alarmId + " stopped.");
    }
}
