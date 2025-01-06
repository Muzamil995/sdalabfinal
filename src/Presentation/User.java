package Presentation;

public class User {

    String userId;
    String name;

   public  Boolean authenticate(){
        return  true;
    }

    public void sendCommand(SecurityDevice device, String command)
    {
        System.out.println(command + "is for "+ device);
    }

    public String getUserId (){
        return userId;
    }

    public  String getName(){
       return  name;
    }

}
