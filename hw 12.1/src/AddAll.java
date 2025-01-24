import java.util.Arrays;

public class AddAll {
    public String addAll(String[] array, String[] array2) {
        int length1 = array.length;
        int length2 = array2.length;
        String[] array3 = new String[length1+length2];
        for (int i = 0; i<length1; i++){
            array3[i]=array[i];
        }
        for (int i = 0; i<length2; i++){
            array3[i+length1]=array2[i];
        }
        return Arrays.toString(array3);
    }
}
