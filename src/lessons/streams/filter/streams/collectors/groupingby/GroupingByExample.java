package lessons.streams.filter.streams.collectors.groupingby;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByExample {

    public void start(){
        System.out.println("Example 1 (grouping by):");
        runExample1();

        System.out.println("Example 2 (add sort):");
        runExample2();
    }

    private void runExample1() {
        List<String> items = getContent();

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                );
        System.out.println(result);
    }//ex1

    private void runExample2() {
        List<String> items = getContent();

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                );

        Map<String, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap -- hmm - this looks messy and no bloody idea how it works!
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
        System.out.println(finalMap);
    }//ex2



    private List<String> getContent(){
        return Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
    }

}
