public class Automobil {
    int AnulProducerii;
    int Kilometraj;
    String Descriere;
    public Automobil(Integer anul, Integer km){
        AnulProducerii = anul;
        Kilometraj = km;
    }
    public Automobil(String desc){
        Descriere = desc;
    }
    public int getAnulProducerii(){
        return AnulProducerii;
    }
    public int getKilometraj(){
        return Kilometraj;
    }
    public void setDescriere(String desc){
        Descriere = desc;
    }
    public String getDescriere(){
        return Descriere;
    }
}
