package afisare;

public class Afisare {

    // overload
    public void afisare() {
        System.out.println("");
    }

    public void afisare(Integer x) {
        System.out.println("Motoda cu Integer:  " + x);
    }
    public void afisare(int x) {
        System.out.println("Motoda cu int:  " + x);
    }

    public void afisare(int x, int y) {
        System.out.println(x + y);
    }

    public void afisare(String x, int y) {
        System.out.println(x + y);
    }

    public void afisare(int y, String x) {
        System.out.println(x + y);
    }


}
