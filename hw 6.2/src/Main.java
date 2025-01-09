public class Main {
    public static void main(String[] args) {
        int[] uni = new int[]{4, 5, 6, 7, 8};
        int a = 0;
        float b = 0F;
        for (int i=0; i<uni.length; i++) {
            a = a + uni[i];
        }
        b = a/uni.length;
        System.out.println(a);
        System.out.println(b);
        int[][] bi = new int[2][2];
        bi[0][0]= 1;
        bi[1][0]= 4;
        bi[0][1]= 2;
        bi[1][1]= 3;
        int c = 0;
        float d = 0F;
        for (int i=0; i<bi.length; i++){
            for (int j=0; j<bi.length; j++){
                c = c + bi[i][j];
            }
        }
        d = c/bi.length;
        System.out.println(c);
        System.out.println(d);
    }
}