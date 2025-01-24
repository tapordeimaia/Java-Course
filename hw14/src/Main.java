import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal elefant1 = new Elefant();
        Animal leu1 = new Leu();
        Animal lup1 = new Lup();
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(elefant1);
        zoo1.addAnimal(leu1);
        zoo1.addAnimal(lup1);
        elefant1.setNume("Vova");
        List<String> alimenteElefant = new ArrayList<>();
        alimenteElefant.add("Iarba");
        alimenteElefant.add("Mar");
        elefant1.setAlimente(alimenteElefant);
    }
}