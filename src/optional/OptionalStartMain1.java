package optional;

import java.util.HashMap;
import java.util.Map;

public class OptionalStartMain1 {

    public static final Map<Long, String> map = new HashMap<>();

    static {
        map.put(1L, "Oh");
        map.put(2L, "Seo");
    }

    public static void main(String[] args) {
        findAndPrint(1L);
        findAndPrint(3L);
    }

    static void findAndPrint(Long id) {
        String name = findNameById(id);
        //System.out.println("name = " + name.toLowerCase());

        if (name != null) {
            System.out.println("name = " + name);
        } else {
            System.out.println("name = UNKNOWN");
        }
    }

    static String findNameById(long id) {
        return map.get(id);
    }
}
