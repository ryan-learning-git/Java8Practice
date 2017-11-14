package lessons.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//http://www.mkyong.com/java8/java-8-streams-filter-examples/
public class NowJava8 {

    public void start(){
        List<String> lines = Arrays.asList("Spring", "node", "mkyong");

        List<String> result = lines.stream()
                .filter(line -> !"mkyong".equals(line)) //condition to meet to include the line
                .collect(Collectors.toList()); //collect output and stream to list

        result.forEach(System.out::println);
    }


}
