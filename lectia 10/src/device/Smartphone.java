package device;

public class Smartphone extends Device {
    @Override
    public void acceseazaInternet() {
        System.out.println("Acceseaza din Smartphone");
    }

    public void suna(){
        System.out.println("Sunam");
    }

    public void incarcaBateria(){
        System.out.println("Incarca bateria din smartphone");
    }
}
