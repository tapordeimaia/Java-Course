public class AutomobilElectric implements Automobil {
    @Override
    public void accelereaza() {
        System.out.println("Automobil Electric");
    }
    public void incarcaBateria(){
        System.out.println("Incarca bateria din Automobil Electric.");
    }
}
