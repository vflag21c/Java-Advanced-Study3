package optional;

import java.util.HashMap;
import java.util.Map;

public class OptionalStartMain1 {

    private static final Map<Long, String> map = new HashMap<>();

    static {
        map.put(1L, "hello");
        map.put(2L, "world");
    }

    public static void main(String[] args) {
        findAndPrint(1L);
        findAndPrint(3L);
    }

    static void findAndPrint(Long id) {
        String name = findNameById(id);
        System.out.println(name + name.toUpperCase()); //null
    }

    static String findNameById(Long id) {
        return map.get(id);
    }
}
