package optional;


import java.util.Optional;

public class OptionalProcessingMain {


    public static void main(String[] args) {
        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        optValue.ifPresent(v -> System.out.println("optValue = " + v));
        optEmpty.ifPresent(v -> System.out.println("optEmpty = " + v));

        optValue.ifPresentOrElse(
                v -> System.out.println("optValue = " + v),
                () -> System.out.println("optValue 빈값"));

        optEmpty.ifPresentOrElse(
                v -> System.out.println("optEmpty = " + v),
                () -> System.out.println("optEmpty 빈값"));

        Optional<Integer> lengthOpt1 = optValue.map(String::length);
        System.out.println("lengthOpt1 = " + lengthOpt1);

        Optional<Integer> lengthOpt2 = optEmpty.map(String::length);
        System.out.println("lengthOpt2 = " + lengthOpt2);

        Optional<Optional<String>> nestedOpt = optValue.map(s -> Optional.of(s));
        System.out.println("nestedOpt = " + nestedOpt);

        Optional<String> flattenedOpt = optValue.flatMap(s -> Optional.of(s));
        System.out.println("flattenedOpt = " + flattenedOpt);

        Optional<String> filtered1 = optValue.filter(s -> s.startsWith("H"));
        Optional<String> filtered2 = optValue.filter(s -> s.startsWith("S"));
        System.out.println("filtered1 = " + filtered1);
        System.out.println("filtered2 = " + filtered2);

        optValue.stream()
                .forEach(s -> System.out.println("optValue.stream() = " + s));

        optEmpty.stream()
                .forEach(s -> System.out.println("optEmpty.stream() = " + s));

    }


}
