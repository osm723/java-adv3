package stream.start;

import java.util.List;

public class StreamStartMain {

    public static void main(String[] args) {
        List<String> names = List.of("Apple", "Banana", "Berry", "Tomato");

        List<String> result = names.stream()
                .filter(n -> n.startsWith("B"))
                .map(String::toUpperCase)
                .toList();

        System.out.println("=== 외부 반복 ===");
        for (String s : result) {
            System.out.println(s);
        }

        System.out.println("=== 내부 반복 ===");
        names.stream()
                .filter(n -> n.startsWith("B"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
