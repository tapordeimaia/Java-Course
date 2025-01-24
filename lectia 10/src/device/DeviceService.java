package device;

public class DeviceService {
    public void afisareInfoDevice(Device device){
        device.incarcaBateria();
        device.acceseazaInternet();
    }
}
