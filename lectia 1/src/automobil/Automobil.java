package automobil;

public class Automobil {
    public int anProducere;
    public String model;
    public String marca;
    public int getAnProducere(){
        return anProducere;
    }
    public String getModel(){
        return model;
    }
    public String getMarca(){
        return marca;
    }
    public void printVariables(){
        System.out.println("Anul producerii este " + anProducere);
        System.out.println("Model este " + model);
        System.out.println("Marca este " + marca);
    }
}
