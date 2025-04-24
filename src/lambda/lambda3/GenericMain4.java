package lambda.lambda3;

public class GenericMain4 {

    public static void main(String[] args) {

        GenericFunction<String, String> upperCase = new GenericFunction<>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        String result1 = upperCase.apply("hello");
        System.out.println("upperCase.apply(\"hello\") = " + result1);

        GenericFunction<Integer, Integer> square = new GenericFunction<>() {
            @Override
            public Integer apply(Integer n) {
                return n * n;
            }
        };
        int result2 = (int) square.apply(3);
        System.out.println("square.apply(3) = " + result2);

    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }

}
