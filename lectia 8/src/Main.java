import automobil.Automobil;
import automobil.AutomobilCombustibil;
import automobil.AutomobilElectric;

public class Main {
    public static void main(String[] args) {
        AutomobilElectric bmw = new AutomobilElectric();
        bmw.setKw(8);
        bmw.setKm(78);
        bmw.setDenumire("sbf");
//        System.out.println(bmw.getDenumire());
//        System.out.println(bmw.getKm());
//        System.out.println(bmw.getKw());
        bmw.AfisareInfo();
        AutomobilCombustibil audi = new AutomobilCombustibil();
        audi.setDenumire("frumos");
        audi.setKm(789);
        audi.setCapacitate(9000000);
        System.out.println(audi.getKm());
        System.out.println(audi.getDenumire());
        System.out.println(audi.getCapacitate());
    }
}