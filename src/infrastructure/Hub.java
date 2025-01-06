package infrastructure;

import domain.SecurityDevice;

public class Hub
{
String hubId;

public boolean connectDevice(
        SecurityDevice device
){
    System.out.println(device+"is connected with hub "+hubId);
    return  true;
}

public void relaycommand(String command,SecurityDevice device){
    System.out.println("this "+command +"is for"+device);

}

}
