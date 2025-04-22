package lambda.ex2;

import java.util.List;

public class ReduceExample {

    public static int reduce(List<Integer> list, int initial, MyReducer myReducer) {
        int result = initial;
        for (Integer i : list) {
            result = myReducer.reduce(result, i);
        }

        return result;
    }


    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + numbers);

        // 1. 합 구하기 (초기값 0, 덧셈 로직)
        System.out.println("reduce(numbers, 0, (a,b) -> a+b) = " + reduce(numbers, 0, (a, b) -> a + b));

        // 2. 곱 구하기 (초기값 1, 곱셈 로직)
        System.out.println("reduce(numbers, 1, (a,b) -> a*b) = " + reduce(numbers, 1, (a, b) -> a * b));
    }
}
