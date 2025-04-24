package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterMainV2_2 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 짝수
        Predicate<Integer> evenFilter = number -> number % 2 == 0;
        List<Integer> evenNumbers = filter(numbers, evenFilter);


        // 홀수
        Predicate<Integer> oddFilter = number -> number % 2 != 0;
        List<Integer> oddNumbers = filter(numbers, oddFilter);

        System.out.println("evenNumbers = " + evenNumbers);
        System.out.println("oddNumbers = " + oddNumbers);
    }

    private static List<Integer> filter(List<Integer> numbers, Predicate<Integer> numberFilter) {
        List<Integer> filtered = new ArrayList<>();

        for (Integer number : numbers) {
            boolean testResult = numberFilter.test(number);
            if (testResult) {
                filtered.add(number);
            }
        }

        return filtered;
    }
    
}
