public class Parallelogram {
    int calculatePerimeter(int length, int width) {
        return length*2+width*2;
    }
    int calculatePerimeter(int sideLength) {
        return sideLength*4;
    }
    double calculateArea(int length, double width) {
        return length*width;
    }
    int calculateArea(int sideLength) {
        return sideLength*sideLength;
    }
}
