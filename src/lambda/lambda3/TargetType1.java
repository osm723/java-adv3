package lambda.lambda3;

public class TargetType1 {

    public static void main(String[] args) {
        FunctionA functionA = i -> "value = " + i;
        System.out.println("functionA.apply(10) = " + functionA.apply(10));

        FunctionB functionB = i -> "value = " + i;
        System.out.println("functionB.apply(10) = " + functionB.apply(10));

        //FunctionB targetB = functionA;

    }


    @FunctionalInterface
    interface FunctionA {
        String apply(Integer i);
    }

    @FunctionalInterface
    interface FunctionB {
        String apply(Integer i);
    }
}
