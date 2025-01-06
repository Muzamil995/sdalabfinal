package application;

public class SecurityController

{
public void processcommand(String commad){
    System.out.println("processing command"+commad);
}

public boolean connectTodevice(SecurityDevice device){
    System.out.println("Connecting to device: " + device.getDeviceId());
    return true;
}


    public void triggerAlarm() {
        System.out.println("domain.Alarm triggered!");
        // Trigger alarm logic
    }

}
