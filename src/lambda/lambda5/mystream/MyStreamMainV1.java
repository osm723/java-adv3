package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamMainV1 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        returValue(numbers);
        methodChain(numbers);
    }

    private static void returValue(List<Integer> numbers) {
        MyStreamV1 stream = new MyStreamV1(numbers);
        MyStreamV1 filtered = stream.filter(n -> n % 2 == 0);
        //System.out.println("filtered.toList() = " + filtered.toList());
        MyStreamV1 mapped = filtered.map(n -> n * 2);
        System.out.println("mapped.toList() = " + mapped.toList());
    }

    private static void methodChain(List<Integer> numbers) {
        List<Integer> result = new MyStreamV1(numbers)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();

        System.out.println("mapped.toList() = " + result);
    }
}
