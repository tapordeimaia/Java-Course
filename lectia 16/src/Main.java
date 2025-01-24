import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Dezavantaje array: marimea e fixa, nu se stie excat cate elemente pastreaza,
        // trebuie sa se tina cont de pozitia in care elementul se pastreaza,
        //nu are metode utile
        //List
        List<String> names = new ArrayList<>();
        names.add("Andrei");
        names.add("Vasile");
        names.add("Ion");
        System.out.println(names.get(1));
    }
}