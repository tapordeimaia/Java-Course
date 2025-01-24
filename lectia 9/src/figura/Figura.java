package figura;

public abstract class Figura {

    public abstract void diseneazaFigura();

    public abstract void calculeazaArea();

    public abstract void afisareInformatieFigura();

    public void culoarea() {
        System.out.println("Afisare culoare din Figura");
    }

}