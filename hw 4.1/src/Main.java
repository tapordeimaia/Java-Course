public class Main {
    public static void main(String[] args) {

        TemperatureConverter first = new TemperatureConverter(45.77F, 78.94F);
        System.out.println(first.toCelsius());
        System.out.println(first.toFahrenheit());
    }
}