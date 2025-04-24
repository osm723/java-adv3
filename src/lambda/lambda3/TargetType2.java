package lambda.lambda3;

import java.util.function.Function;

public class TargetType2 {

    public static void main(String[] args) {
        Function<String, String> upperCase = s -> s.toUpperCase();
        System.out.println("functionA.apply(hello) = " + upperCase.apply("hello"));

        Function<Integer, Integer> square = n -> n * n;
        System.out.println("functionB.apply(3) = " + square.apply(3));
    }
}
