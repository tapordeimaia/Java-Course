import TranzactieValutara.TranzactieValuta;
import TranzactieValutara.Valuta;
import Animals.Cat;

public class Main {
    public static void main(String[] args) {

        /*Automobil bmw = new Automobil(2005, 1111);
        System.out.println(bmw.getAnulProducerii());
        System.out.println(bmw.getKilometraj());
        System.out.println(bmw.getDescriere());
        bmw.setDescriere("Automobilul este nou.");
        System.out.println(bmw.getDescriere());*/

        /*TranzactieValuta tranzactie = new TranzactieValuta(Valuta.EUR, 18.10F, Valuta.LEI, 200000.0F );
        Valuta usd = Valuta.USD;
        System.out.println(usd.getDescriere());
        System.out.println(usd.getNumCode());
        System.out.println(tranzactie.cumpara());
        System.out.println(tranzactie.vinde());*/

        Cat cat = new Cat();
        cat.setName("Markiza");
        cat.meow();
    }
}