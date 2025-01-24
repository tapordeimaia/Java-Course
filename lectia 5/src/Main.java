public class Main {
    public static void main(String[] args) {
        //String s = "A";
        //StringBuilder stringbuilder = new StringBuilder("A");
        /*for(int i=0; i<3; i++){
            //s=s+i;
            stringbuilder.append(i);
            System.out.println(stringbuilder);
            //System.out.println(s);
        }*/
        /*for(int i=0; i<20; i++){
            System.out.println(i);
            break;
        }
        for(int i=0; i<20; i++){
            System.out.println(i);
            if (i==0){
                continue;
            }
            System.out.println(i);
        }*/

        /*for(int i=0; i<10; i++){
            for (int j=0; j<1; j++){
                System.out.println(j);
            }
            System.out.println(i);
        }*/

        /*int c=0;
        while(c<5){
            System.out.println(c);
            c++;
        }*/

        /*int c =0;
        do {
            System.out.println(c);
            c++;
        } while(c<5);*/

        Automobil bmw = new Automobil(1870);
        System.out.println(bmw.getAnProducere());




    }
}