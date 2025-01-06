package domain;

public  class SecurityDevice {
     String deviceId;
     String status;

    public SecurityDevice(String deviceId) {
        this.deviceId = deviceId;
        this.status = "inactive";
    }

    public   void activate(){};

    public   void deactivate(){};

    public String getStatus() {
        return status;
    }

    public String getDeviceId() {
        return deviceId;
    }
}
