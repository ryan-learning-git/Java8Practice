package lessons.streams.filter.streams.collectors.groupingby;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//http://www.mkyong.com/java8/java-8-collectors-groupingby-and-mapping-example/
public class GroupingByExample {

    public void start(){
        System.out.println("Example 1 (grouping by):");
        runExample1();

        System.out.println("Example 2 (add sort):");
        runExample2();

        System.out.println("Example 3 (group by name, then count and sum)");
        runExample3();
    }

    private void runExample1() {
        List<String> items = getContentList();

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                );
        System.out.println(result);
    }//ex1

    private void runExample2() {
        List<String> items = getContentList();

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

    private void runExample3(){
        List<Item> items = getContentListItems();

        Map<String, Long> counting = items.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.counting()) //could just change getName to another field to sort by something else
        );
        System.out.println("Counting: " + counting);

        Map<String, Integer> sum = items.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getCount))
        );
        System.out.println("Sum: " + sum);
    }//ex3


    private List<String> getContentList(){
        return Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
    }

    private List<Item> getContentListItems(){
        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orange", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );

        return items;
    }


    private static class Item {
        private String name;
        private int count;
        private BigDecimal price;

        public Item(String name, int count, BigDecimal price) {
            this.name = name;
            this.count = count;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }
    }

}
