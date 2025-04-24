package lambda.lambda3;

public class GenericMain5 {

    public static void main(String[] args) {

        GenericFunction<String, String> upperCase = s -> s.toUpperCase();
        String result1 = upperCase.apply("hello");
        System.out.println("upperCase.apply(\"hello\") = " + result1);

        GenericFunction<Integer, Integer> square = n -> n * n;
        int result2 = square.apply(3);
        System.out.println("square.apply(3) = " + result2);

    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }

}
