import device.Device;
import device.DeviceService;
import device.Smartphone;
import device.Tablet;

public class Main {
    public static void main(String[] args) {
//        Automobil automobil = new AutomobilElectric();
//        automobil.accelereaza();
//
//        AutomobilElectric automobilElectric = new AutomobilElectric();
//        automobilElectric.accelereaza();
//        automobilElectric.incarcaBateria();
//
//        AutomobilCombustibil automobilCombustibil = new AutomobilCombustibil();
//        automobilCombustibil.accelereaza();
//        automobilCombustibil.alimenteazaRezervor();

        Smartphone smartphone = new Smartphone();
//        smartphone.acceseazaInternet();
//        smartphone.incarcaBateria();
//        smartphone.suna();

        Tablet tablet = new Tablet();
//        tablet.acceseazaInternet();
//        tablet.incarcaBateria();
//        tablet.test();

        DeviceService deviceService = new DeviceService();
        deviceService.afisareInfoDevice(tablet);
        deviceService.afisareInfoDevice(smartphone);

//        Device devicesmartphone = new Smartphone();
//        devicesmartphone.acceseazaInternet();
//        devicesmartphone.incarcaBateria();
//
//        Device devicetablet = new Tablet();
//        devicetablet.acceseazaInternet();
//        devicetablet.incarcaBateria();

    }
}