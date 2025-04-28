package functional;

import java.util.function.Function;

public class CompositionMain1 {

    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> add = x -> x + 1;

        Function<Integer, Integer> newFunction = square.compose(add);
        System.out.println("newFunction.apply(2) = " + newFunction.apply(2));

        Function<Integer, Integer> newFunction2 = square.andThen(add);
        System.out.println("newFunction2.andThen(2) = " + newFunction2.apply(2));


    }
}
