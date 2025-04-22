package lambda.lambda1;


import lambda.Procedure;

public class LambdaSimple2 {

    public static void main(String[] args) {
        Procedure procedure1 = new Procedure() {
            @Override
            public void run() {
                System.out.println("hello! Lambda");
            }
        };
        procedure1.run();

        Procedure procedure2 = () -> System.out.println("hello! Lambda");
        procedure2.run();

    }
}
