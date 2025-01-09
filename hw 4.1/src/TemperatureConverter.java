public class TemperatureConverter {
    Float celsius;
    Float fahrenheit;
    TemperatureConverter(Float celsius, Float fahrenheit){
        this.celsius=celsius;
        this.fahrenheit=fahrenheit;
    }
    public Float toCelsius(){
        return (fahrenheit-32)/1.8F;
    }
    public Float toFahrenheit(){
        return (celsius*9/5)+32;
    }
}
