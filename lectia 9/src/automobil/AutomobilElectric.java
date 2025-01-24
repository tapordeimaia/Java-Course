package automobil;

public class AutomobilElectric extends Automobil {

    // override vs overload
    // override - rescrierea unei metode de la clasa parinte
    // overload - in aceiasi clasa avem acelasi nume la metoda iar parametri sunt diferiti

    @Override
    public void accelerare() {
        System.out.println("Accelerare din AutomobilElectric");
    }

    @Override
    public void frinare() {
        System.out.println("Frinare din AutomobilElectric");
    }

}
