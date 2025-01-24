import automobil.AutomobilElectric;
import automobil.AutomobilService;
import calculator.Calcualtor;
import figura.Cerc;
import figura.Patrat;
import figura.Triunghi;
import object.Device;

public class Main {
    public static void main(String[] args) {

        AutomobilElectric automobilElectric = new AutomobilElectric();
        automobilElectric.setX(5);
        System.out.println(automobilElectric.getX());

        AutomobilElectric automobilElectric1 = new AutomobilElectric();
        automobilElectric1.accelerare();


        AutomobilService automobilService = new AutomobilService();
        automobilService.reparare(automobilElectric1);


        Cerc cerc = new Cerc();
        cerc.diseneazaFigura();

        Triunghi triunghi = new Triunghi();
        triunghi.diseneazaFigura();

        Patrat patrat = new Patrat();
        patrat.diseneazaFigura();


        Calcualtor calcualtor = new Calcualtor(2020, "Calculator1");

        System.out.println(calcualtor.getDescriere());
        System.out.println(calcualtor.getAnProducere());
        System.out.println(calcualtor.getNrUtilizatori());

        Calcualtor calcualtor1 = new Calcualtor(2023, "Calculator2");

        System.out.println(calcualtor1.getDescriere());
        System.out.println(calcualtor1.getAnProducere());
        System.out.println(calcualtor1.getNrUtilizatori());

        Calcualtor calcualtor2 = new Calcualtor(2019, "Calculator3");

        System.out.println(calcualtor2.getDescriere());
        System.out.println(calcualtor2.getAnProducere());
        System.out.println(calcualtor2.getNrUtilizatori());

        System.out.println("-----------------");

        System.out.println(calcualtor.getDescriere());
        System.out.println(calcualtor.getAnProducere());
        System.out.println(calcualtor.getNrUtilizatori());

        Calcualtor.descriere = "SS";

        Calcualtor calcualtor3 = new Calcualtor();
        calcualtor3.descriere  = "sd";

        System.out.println("-----------------");

        System.out.println(calcualtor.getDescriere());
        System.out.println(calcualtor.getAnProducere());
        System.out.println(calcualtor.getNrUtilizatori());

        Calcualtor.setNrUtilizatori(5);
        Calcualtor.afisareNrUtilizatori();

        Device device = new Device(500, "Apple Iphone");
        System.out.println(device);

        Device device2 = new Device(1000, "Sasmsung galaxy");
        System.out.println(device2);



    }
}