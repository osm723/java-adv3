package functional;

import java.util.function.Function;

public class CompositionMain2 {

    public static void main(String[] args) {
        Function<String, Integer> parseInt = Integer::parseInt;

        Function<Integer, Integer> square = x -> x * x;

        Function<Integer, String> toString = x -> "결과: " + x;

        Function<String, String> finalFunc = parseInt.andThen(square).andThen(toString);

        String result1 = finalFunc.apply("5");
        System.out.println("result1 = " + result1);

        String result2 = finalFunc.apply("10");
        System.out.println("result2 = " + result2);

        Function<String, Integer> StringToSquareFunc = parseInt.andThen(square);
        Integer result3 = StringToSquareFunc.apply("5");
        System.out.println("result3 = " + result3);
    }
}
