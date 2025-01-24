public class Cube extends ThreeDimShape{
    public int calculateArea(int side){
        return 6*side*side;
    }
    public int calculateVolume(int side){
        return side*side*side;
    }
}
