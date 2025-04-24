package lambda.lambda3;

public class GenericMain6 {

    public static void main(String[] args) {
        GenericFunction<String, String> toUppercase = s -> s.toUpperCase();
        GenericFunction<String, Integer> stringLength = s -> s.length();
        GenericFunction<Integer, Integer> square = n -> n * n;
        GenericFunction<Integer, Boolean> isEven = n -> n % 2 == 0;

        System.out.println("toUppercase.apply(\"hello\") = " + toUppercase.apply("hello"));
        System.out.println("stringLength.apply(\"apple\") = " + stringLength.apply("apple"));
        System.out.println("square.apply(3) = " + square.apply(3));
        System.out.println("isEven.apply(5) = " + isEven.apply(5));

    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }

}
