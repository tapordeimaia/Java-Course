package calculator;

public class Calcualtor {

    private int anProducere;

    public String descriere;

    private static int nrUtilizatori; // 2

    private static String descriereaClasei = "Clasa calculator";

    public Calcualtor(int anProducere, String descriere) {
        this.anProducere = anProducere;
        this.descriere = descriere;
        this.nrUtilizatori = nrUtilizatori + 1; // 2 + 1
    }


    public int getAnProducere() {
        return anProducere;
    }

    public void setAnProducere(int anProducere) {
        this.anProducere = anProducere;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public int getNrUtilizatori() {
        return nrUtilizatori;
    }

    public static void afisareNrUtilizatori() {
        System.out.println(nrUtilizatori);
    }

    public static void setNrUtilizatori(int utilizatori) {
        nrUtilizatori = utilizatori;
    }
}
