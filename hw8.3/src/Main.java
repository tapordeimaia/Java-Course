public class Main {
    public static void main(String[] args) {
        TwoDimShape circle = new Circle();
        ThreeDimShape sphere = new Sphere();
        System.out.println(circle.calculateArea(8));
        System.out.println(sphere.calculateVolume(9));
        System.out.println(sphere.calculateArea(10));
    }
}