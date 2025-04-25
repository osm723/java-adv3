package stream.collectors;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors1Basic {

    public static void main(String[] args) {
        List<String> list = Stream.of("java", "jpa", "spring")
                .collect(Collectors.toList());
        list.add("redis");
        System.out.println("list = " + list);

        List<Integer> list2 = Stream.of(1, 2, 3)
                .collect(Collectors.toUnmodifiableList());
        //list2.add(4);
        System.out.println("list2 = " + list2);

        Set<Integer> set = Stream.of(1, 2, 2, 2, 3, 4, 4, 5)
                .collect(Collectors.toSet());
        System.out.println("set = " + set);

        TreeSet<Integer> treeSet = Stream.of(3, 4, 5, 2, 1)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("treeSet = " + treeSet);


    }
}
