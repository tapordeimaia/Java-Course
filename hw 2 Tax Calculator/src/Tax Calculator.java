public class Main {
    public static void main(String[] args) {
        double price = 5.88888;
        double tax = 7.999999;
        int quantity = 786;
        double total = 0;
        String message = "I want to buy " + quantity + " shirt!";
        System.out.println(message);
        total = price*quantity*tax;
        System.out.println("Total cost with tax is: " + total);
    }
}