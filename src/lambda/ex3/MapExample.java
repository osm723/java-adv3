package lambda.ex3;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapExample {

    public static List<String> map(List<String> list, UnaryOperator<String> func) {
        List<String> result = new ArrayList<>();
        for (String str : list) { //"hello", "java", "lambda"
            result.add(func.apply(str));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);

        // 1. 대문자 변환
        System.out.println("map(words, s -> s.toUpperCase()) = " + map(words, s -> s.toUpperCase()));

        // 2. 앞뒤에 *** 붙이기 (람다로 작성)
        System.out.println("map(words, s -> *** + s + ***) = " + map(words, s -> "***" + s + "***"));
    }
}
