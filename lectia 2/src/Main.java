public class Main {
    public static void main(String[] args) {
        int a = 2;
        Integer b = 2;
        a = b.intValue();
        String c = b.toString();
        byte d = b.byteValue();

        long a1 = 444444444L;
        Long b1 = 444444444L;

        Automobil automobil = new Automobil(3, 78);
        System.out.println(automobil.anulProducerii);
        System.out.println(automobil.km);


    }
}