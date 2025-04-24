package lambda.lambda3;

public class GenericMain1 {

    public static void main(String[] args) {
        StringFunction upperCase = s -> s.toUpperCase();
        System.out.println("upperCase.apply(\"hello\") = " + upperCase.apply("hello"));

        NumberFunction square = n -> n * n;
        System.out.println("square.apply(3) = " + square.apply(3));

    }


    @FunctionalInterface
    interface StringFunction {
        String apply(String s);
    }

    @FunctionalInterface
    interface NumberFunction {
        int apply(int n);
    }
}
