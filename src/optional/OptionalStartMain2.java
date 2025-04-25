package optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalStartMain2 {

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
        String name = findNameById(id).orElse("UNKNOWN");
        System.out.println("name = " + name);
    }

    static Optional<String> findNameById(long id) {
        return Optional.ofNullable(map.get(id));
    }
}
