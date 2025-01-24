import java.util.HashMap;
import java.util.Map;

public class CustomHashMap<T,E> implements CustomMap<T,E>{
    private Map<T, E> map = new HashMap<>();
    @Override
    public E put(T key, E value) {
        return map.put(key, value);
    }
}
