public class Sphere extends ThreeDimShape{
    public int calculateArea(int r){
        return 12*r*r;
    }
    public int calculateVolume(int r){
        return 4*r*r*r;
    }
}
