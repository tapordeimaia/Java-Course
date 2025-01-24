public class Automobil {
    Integer anulProducerii;
    Integer km;
    public Automobil(Integer value, Integer kilometraj){
        anulProducerii = incrementByONe(value);
        km = kilometraj;
    }
    public Integer incrementByONe(Integer a){
        return a+1;
    }

}
