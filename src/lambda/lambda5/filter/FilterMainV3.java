package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV3 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 짝수
        List<Integer> evenNumbers = filter(numbers, number1 -> number1 % 2 == 0);

        // 홀수
        List<Integer> oddNumbers = filter(numbers, number -> number % 2 != 0);

        System.out.println("evenNumbers = " + evenNumbers);
        System.out.println("oddNumbers = " + oddNumbers);
    }

    private static List<Integer> filter(List<Integer> numbers, Predicate<Integer> numberFilter) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {
            if (numberFilter.test(number)) {
                filtered.add(number);
            }
        }

        return filtered;
    }
    
}
