package lambda.ex2;

public class BuildGreeterExample {


    public static StringFunction buildGreater(String greeting) {
        return s -> greeting + ", " + s;
    }

    public static void main(String[] args) {

        StringFunction helloGreater = buildGreater("Hello");
        StringFunction hiGreater = buildGreater("Hi");

        System.out.println("helloGreater.apply(\"java\") = " + helloGreater.apply("java"));
        System.out.println("hiGreater.apply(\"Lambda\") = " + hiGreater.apply("Lambda"));

    }
}
