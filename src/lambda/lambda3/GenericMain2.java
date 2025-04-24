package lambda.lambda3;

public class GenericMain2 {

    public static void main(String[] args) {
        ObjectFunction upperCase = s -> s.toString().toUpperCase();
        String result1 = (String) upperCase.apply("hello");
        System.out.println("upperCase.apply(\"hello\") = " + result1);

        ObjectFunction square = n -> (Integer) n * (Integer) n;
        int result2 = (int) square.apply(3);
        System.out.println("square.apply(3) = " + result2);

    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object s);
    }

}
