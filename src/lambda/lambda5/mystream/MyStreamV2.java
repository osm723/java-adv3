package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV2 {

    private List<Integer> intenalList;

    private MyStreamV2(List<Integer> intenalList) {
        this.intenalList = intenalList;
    }

    public static MyStreamV2 of(List<Integer> intenalList) {
        return new MyStreamV2(intenalList);
    }

    public MyStreamV2 filter(Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer element : intenalList) {
            if (predicate.test(element)) {
                filtered.add(element);
            }
        }
        return new MyStreamV2(filtered);
    }

    public MyStreamV2 map(Function<Integer, Integer> mapper) {
        List<Integer> mapped = new ArrayList<>();
        for (Integer element : intenalList) {
            mapped.add(mapper.apply(element));
        }
        return new MyStreamV2(mapped);
    }

    public List<Integer> toList() {
        return intenalList;
    }

}
