package lambda.lambda1;


import lambda.MyFunction;

public class LambdaSimple3 {

    public static void main(String[] args) {
        MyFunction myFunction1 = (int a, int b) -> a + b;

        MyFunction myFunction2 = (a, b) -> a + b;

        int result1 = myFunction1.apply(1, 2);
        int result2 = myFunction2.apply(1, 2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
