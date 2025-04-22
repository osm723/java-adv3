package lambda.lambda2;

import lambda.MyFunction;

public class LambdaPassMain2 {

    public static void main(String[] args) {

        MyFunction add = (a,b) -> a+b;
        MyFunction sub = (a,b) -> a-b;

        System.out.println("변수를 통해 전달");

        cal(add);
        cal(sub);
        cal((a,b) -> a + b);
        cal((a,b) -> a - b);
    }

    static void cal(MyFunction function) {
        int a = 1;
        int b = 1;

        System.out.println("start");

        int result = function.apply(a, b);

        System.out.println("result = " + result);
    }
}
