public class Automobil {
    private int anProducere;

    public Automobil(int anProducere) {
        if (anProducere>1920){
            this.anProducere =anProducere;
        } else {
            System.out.println("Introduce un an mai mare de 1920.");
        }
    }

    public void setAnProducere(int anProducere) {
        if (anProducere>1920){
            this.anProducere =anProducere;
        }
    }

    public int getAnProducere() {
        return anProducere;
    }
}
