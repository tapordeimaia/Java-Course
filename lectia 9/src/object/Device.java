package object;

public class Device {

    int price;

    String denumire;
    public Device(int price, String denumire) {
        this.price = price;
        this.denumire = denumire;
    }

    public Device() {

    }

    @Override
    public String toString() {
        return "Denumire: " + denumire +  "Price: " +  price ;
    }
}