import automobil.Automobil;
import person.Person;

public class Main {
    public static void main(String[] args) {

        Person ion = new Person();
        ion.age=56;
        ion.name="Ion";
        System.out.println(ion.getAge());
        System.out.println(ion.name.toUpperCase());

        TipuriDate a=new TipuriDate();
        System.out.println(a.g);
        System.out.println(a.h);

        Automobil bmw=new Automobil();
        bmw.anProducere=2008;
        bmw.marca="BMW";
        bmw.model="Seria 3";
        System.out.println(bmw.getAnProducere());
        System.out.println(bmw.getMarca());
        System.out.println(bmw.getModel());
    }
}