package lessons.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//http://www.mkyong.com/java8/java-8-streams-filter-examples/
public class BeforeJava8 {

    public void start(){
        List<String> lines = Arrays.asList("Spring", "node", "mkyong");
        List<String> result = getFilterOutput(lines, "mkyong");

        for (String temp : result){
            System.out.println(temp); //output: spring, node.
        }
    }

    private List<String> getFilterOutput(List<String> lines, String filter){
        List<String> result = new ArrayList<>();
        for (String line : lines){
            if (!filter.equals(lines)) {
                result.add(line);
            }
        }
        return result;
    }

}
