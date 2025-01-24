import animal.Carnivor;
import animal.Leu;
import animal.Urs;

public class Main {
    public static void main(String[] args) {
        Leu leu = new Leu();
        leu.setAge(4);
        System.out.println(leu.getAge());
        leu.manancaCarne();

        Carnivor carnivor1 = new Leu();
        Carnivor carnivor2 = new Urs();
    }
}