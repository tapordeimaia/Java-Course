public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{2, 5, 6, 7};
        int[] b = new int[a.length];
        for (int i=0; i<a.length; i++){
            b[i]=a[i];
        }
        for (int i=0; i<a.length; i++){
            System.out.print(b[i]+" ");
        }
    }
}