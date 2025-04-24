package lambda.lambda3;

import java.util.function.Function;

public class TargetType3 {

    public static void main(String[] args) {
        Function<Integer, String> functionA = i -> "value = " + i;
        System.out.println("functionA.apply(10) = " + functionA.apply(10));

        Function<Integer, String> functionB = i -> "value = " + i;
        System.out.println("functionB.apply(10) = " + functionB.apply(10));

        Function<Integer, String> targetB = functionA;
        System.out.println("targetB.apply(10) = " + targetB.apply(10));

    }


    @FunctionalInterface
    interface FunctionA {
        String apply(Integer i);
    }

    @FunctionalInterface
    interface FunctionB {
        String apply(Integer i);
    }
}
