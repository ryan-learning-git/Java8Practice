package lessons.streams.filter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//http://www.mkyong.com/java8/java-8-filter-a-null-value-from-a-stream/
//https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html
public class FilterNull {

    public void start(){
        Stream<String> languages = Stream.of("java", "python", "node", null, "ruby", null, "php");

        List<String> result = languages.filter(x -> x!=null).collect(Collectors.toList());

        result.forEach(System.out::println);
    }

}
