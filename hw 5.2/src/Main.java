public class Main {
    public static void main(String[] args) {
        float k=0;
        for(float i=1; i<=97; i+=2){
            k=k+i/(i+2);
        }
        System.out.println(k);
    }
}