package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterMainV1 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 짝수
        List<Integer> evenNumbers = filterEvenNumbers(numbers);

        // 홀수
        List<Integer> oddNumbers = filterOddNumbers(numbers);

        System.out.println("evenNumbers = " + evenNumbers);
        System.out.println("oddNumbers = " + oddNumbers);
    }

    private static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        List<Integer> filtered = new ArrayList<>();

        for (Integer number : numbers) {
            boolean testResult = number % 2 == 0;
            if (testResult) {
                filtered.add(number);
            }
        }

        return filtered;
    }

    private static List<Integer> filterOddNumbers(List<Integer> numbers) {
        List<Integer> filtered = new ArrayList<>();

        for (Integer number : numbers) {
            boolean testResult = number % 2 != 0;
            if (testResult) {
                filtered.add(number);
            }
        }

        return filtered;
    }
}
