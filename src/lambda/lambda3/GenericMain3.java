package lambda.lambda3;

public class GenericMain3 {

    public static void main(String[] args) {
        ObjectFunction upperCase = new ObjectFunction() {
            @Override
            public Object apply(Object s) {
                return s.toString().toUpperCase();
            }
        };
        String result1 = (String) upperCase.apply("hello");
        System.out.println("upperCase.apply(\"hello\") = " + result1);

        ObjectFunction square = new ObjectFunction() {
            @Override
            public Object apply(Object n) {
                return (Integer) n * (Integer) n;
            }
        };
        int result2 = (int) square.apply(3);
        System.out.println("square.apply(3) = " + result2);

    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object s);
    }

}
