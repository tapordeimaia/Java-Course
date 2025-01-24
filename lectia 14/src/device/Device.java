package device;

public class Device {
    static int count;
    public Charger charger;
    public static void hello(){
        System.out.println("Hello");
    }
    public static class Charger{
        public void charge(){
            System.out.println("Charging device" + count);
            hello();
        }
    }
}
