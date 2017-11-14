package lessons.streams.filter.streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExtra {

    public void start(){
        //Streams - https://www.tutorialspoint.com/java8/java8_streams.htm
        //Sequence of elements from Collections, Arrays or I/O resources
        //supports aggregate options like filter, map, limit, reduce, find, match, etc
        //most functions return the stream so they can be pipelined (collect() is the terminal method)
        //Automatic iteration - no loop required
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        List<String> parallelFiltered = strings.parallelStream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        //these streams also have:
        //foreach
        //map (map each element to its corresponding result
        //filter, limit, sorted.
        System.out.println("Filtered list");
        filtered.forEach(System.out::println);
        System.out.println("Parallel Filtered list");
        parallelFiltered.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);
        IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("From numbers " + numbers + ":");
        System.out.println("Highest number is " + stats.getMax());
        System.out.println("Lowest number is " + stats.getMin());
        System.out.println("Sum is " + stats.getAverage());
        System.out.println("Average is " + stats.getSum());
    }

}
