package SingleInheritance;

// Superclass Device
class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass Thermostat
class Thermostat extends Device {
    private int temperatureSetting;

    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();  // Call Device's displayStatus()
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main Class
public class SmartHomeDevices {
    public static void main(String[] args) {
        // Create a Thermostat object (Device + Thermostat info)
        Thermostat thermostat = new Thermostat("Thermo001", "On", 22);

        // Display the device and thermostat status
        thermostat.displayStatus();
    }
}
