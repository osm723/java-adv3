package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV3<T> {

    private List<T> intenalList;

    private MyStreamV3(List<T> intenalList) {
        this.intenalList = intenalList;
    }

    public static <T> MyStreamV3<T> of(List<T> intenalList) {
        return new MyStreamV3<>(intenalList);
    }

    public MyStreamV3<T> filter(Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T element : intenalList) {
            if (predicate.test(element)) {
                filtered.add(element);
            }
        }
        return MyStreamV3.of(filtered);
    }

    public <R> MyStreamV3<R> map(Function<T, R> mapper) {
        List<R> mapped = new ArrayList<>();
        for (T element : intenalList) {
            mapped.add(mapper.apply(element));
        }
        return MyStreamV3.of(mapped);
    }

    public List<T> toList() {
        return intenalList;
    }

    public void forEach(Consumer<T> consumer) {
        for (T element : intenalList) {
            consumer.accept(element);
        }
    }

    public T getFirst() {
        return intenalList.get(0);
    }

}
