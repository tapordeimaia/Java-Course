import device.Device;

public class Main {
    public static void main(String[] args) {
        Device device = new Device();
        Device.Charger charger = device.charger;
        charger.charge();
    }
}