public class Main {
    public static void main(String[] args) {
        String[] array = {"Maia", "Nicole", "Dana", "Vlada"};
        String value = "Maia";
        Contain list1 = new Contain();
        System.out.println(list1.contains(array, value));

        AddAll list2 = new AddAll();
        String[] array1 = {"e", "o", "f", "j"};
        String[] array2 = {"q", "k", "u", "g"};
        System.out.println(list2.addAll(array1, array2));
    }
}