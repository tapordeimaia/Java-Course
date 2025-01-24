import java.util.ArrayList;
import java.util.List;

public class CustomList<T> implements CustomListInt<T>{
    List<T> array = new ArrayList<>();
    int counter=0;

    public void add(T object){
        array.add(object);
        counter++;
    }

    public String toString(){
        String value = "";
        for(T object: array){
            value += object + " ";
        }
        return value;
    }
}
