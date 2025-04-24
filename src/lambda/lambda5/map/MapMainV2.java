package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV2 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        Function<String, Integer> stringToInteger = s -> Integer.valueOf(s);
        List<Integer> numbers = mapTo(list, stringToInteger);
        System.out.println("numbers = " + numbers);

        Function<String, Integer> stringToLength = s -> s.length();
        List<Integer> lengths = mapTo(list ,stringToLength);
        System.out.println("lengths = " + lengths);
    }

    private static List<Integer> mapTo(List<String> list, Function<String, Integer> function) {
        List<Integer> numbers = new ArrayList<>();
        for (String s : list) {
            Integer value = function.apply(s);
            numbers.add(value);
        }
        return numbers;
    }

}
