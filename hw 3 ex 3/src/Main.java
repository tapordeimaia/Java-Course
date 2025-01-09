public class Main {
    public static void main(String[] args) {
        String a = "tRue";
        boolean a1 = Boolean.parseBoolean(a);
        String b = "120";
        byte b1 = Byte.parseByte(b);
        String c = "32000";
        short c1 = Short.parseShort(c);
        String d = "147895632";
        int d1 = Integer.parseInt(d);
        String e = "987654321987654321";
        long e1 = Long.parseLong(e);
        String f = "4444.5d";
        double f1 = Double.parseDouble(f);
        String g = "2354.56f";
        float g1 = Float.parseFloat(g);
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);
        System.out.println(f1);
        System.out.println(g1);
    }
}