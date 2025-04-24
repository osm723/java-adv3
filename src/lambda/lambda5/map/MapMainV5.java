package lambda.lambda5.map;


import java.util.List;

import static lambda.lambda5.map.GenericMapper.*;


public class MapMainV5 {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange", "graph");

        List<String> upperFruits = map(fruits, s -> s.toUpperCase());
        System.out.println("upperFruits = " + upperFruits);

        List<Integer> lengthFruits = map(fruits, s -> s.length());
        System.out.println("lengthFruits = " + lengthFruits);


        List<Integer> integers = List.of(1,2,3,5);
        List<String> starList = map(integers, n -> "*".repeat(n));
        System.out.println("starList = " + starList);

    }

}
