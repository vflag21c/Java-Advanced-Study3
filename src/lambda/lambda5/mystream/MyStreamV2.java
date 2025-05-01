package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

//static factory 추가
public class MyStreamV2 {
    private List<Integer> integerList;

    private MyStreamV2(List<Integer> integerList) {
        this.integerList = integerList;
    }


    public static MyStreamV2 of(List<Integer> integerList) {
        return new MyStreamV2(integerList);
    }

    public MyStreamV2 filter(Predicate<Integer> predicate) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer element : integerList) {
            if (predicate.test(element)) {
                list.add(element);
            }
        }
        return new MyStreamV2(list);
    }

    public MyStreamV2 map(Function<Integer, Integer> mapper) {
        List<Integer> mapped = new ArrayList<>();
        for (Integer element : integerList) {
            mapped.add(mapper.apply(element));
        }
        return new MyStreamV2(mapped);
    }

    public List<Integer> toList() {
        return integerList;
    }
}
