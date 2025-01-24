import amprenta.Amprenta;
import amprenta.Andrei;
import calculator.Calculator;

public class Main {
    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        Calculator.Cpu cpu = calculator.new Cpu();
//        cpu.hello();

        Amprenta amprenta = new Amprenta() {
            public void lasaAmprenta() {
                System.out.println("Amprenta Vasile");
            }
        };
    }
}