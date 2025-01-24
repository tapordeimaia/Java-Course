public class Main {
    public static void main(String[] args) {
//        int count=10;
//        switch(count){
//            case 4:
//                System.out.println("4");
//                break;
//            case 3:
//                System.out.println("4");
//                break;
//            case 2:
//                System.out.println("4");
//                break;
//            default:
//                System.out.println("Nu am gasit valoarea");}
//        Person person = new Person();
//        String val = "B";
//        switch (val){
//            case "A" -> person.setName("Andrei");
//            case "B" -> person.setName("Boris");
//            case "C" -> System.out.println("C");
//            default -> System.out.println("Nu am gasit valoarea");
//        }
//        System.out.println(person.name);
//        Valuta v = Valuta.USD;
//        switch (v){
//            case LEI -> System.out.println("Lei");
//            case USD -> System.out.println("USD");
//            case EURO -> System.out.println("Euro");}

        int[] numere = new int[10];
        numere[0] = 4;
        numere[1] = 8;
        numere[2] = 6;
        numere[3] = 2;
        for (int i = 0; i < numere.length; i++) {
            int a = numere[i];
            if (a==2){
                System.out.println("Am gasit 2");
            }
            System.out.println(a);
        }
    }
}