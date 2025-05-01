package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV1 {
    private List<Integer> integerList;

    public MyStreamV1(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public MyStreamV1 filter(Predicate<Integer> predicate) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer element : integerList) {
            if (predicate.test(element)) {
                list.add(element);
            }
        }
        return new MyStreamV1(list);
    }

    public MyStreamV1 map(Function<Integer, Integer> mapper) {
        List<Integer> mapped = new ArrayList<>();
        for (Integer element : integerList) {
            mapped.add(mapper.apply(element));
        }
        return new MyStreamV1(mapped);
    }

    public List<Integer> toList() {
        return integerList;
    }
}
