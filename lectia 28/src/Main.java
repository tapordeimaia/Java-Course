import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);

//        List listaveche = new ArrayList();
//        listaveche.add("as");
//        listaveche.add(22);
//        for (int i = 0; i < listaveche.size(); i++) {
//            Integer nr = (Integer) listaveche.get(i);
//        }

        CustomListInt<String> customList = new CustomList<>();
        customList.add("s");
//        customList.add(3);
        System.out.println(customList);

//        CustomList customList1 = new CustomList();
    }
}