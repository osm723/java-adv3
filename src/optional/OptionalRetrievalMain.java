package optional;


import java.util.Optional;

public class OptionalRetrievalMain {


    public static void main(String[] args) {
        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        System.out.println("optValue.isPresent() = " + optValue.isPresent());
        System.out.println("optEmpty.isPresent() = " + optEmpty.isPresent());
        System.out.println("optValue.isEmpty() = " + optValue.isEmpty());
        System.out.println("optEmpty.isEmpty() = " + optEmpty.isEmpty());

        System.out.println("optValue.get() = " + optValue.get());
        //System.out.println("optEmpty.get() = " + optEmpty.get());
        System.out.println("optValue.orElse(\"기본값\") = " + optValue.orElse("기본값"));
        System.out.println("optEmpty.orElse(\"기본값\") = " + optEmpty.orElse("기본값"));

        String value2 = optValue.orElseGet(() -> {
            System.out.println("람다 호출 - optValue");
            return "New value";
        });

        String empty2 = optEmpty.orElseGet(() -> {
            System.out.println("람다 호출 - optEmpty");
            return "New value";
        });

        System.out.println("value2 = " + value2);
        System.out.println("empty2 = " + empty2);

        String value3 = optValue.orElseThrow(() -> new RuntimeException("값이 없습니다."));
        System.out.println("value3 = " + value3);
        try {
            String empty3 = optEmpty.orElseThrow(() -> new RuntimeException("값이 없습니다."));
            System.out.println("empty3 = " + empty3);
        } catch (RuntimeException e) {
            System.out.println("e = " + e);
        }

        Optional<String> result1 = optValue.or(() -> Optional.of("FallBack"));
        System.out.println("result1 = " + result1);
        Optional<String> result2 = optEmpty.or(() -> Optional.of("FallBack"));
        System.out.println("result2 = " + result2);

    }


}
