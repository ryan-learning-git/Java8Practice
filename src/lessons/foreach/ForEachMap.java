package lessons.foreach;

import java.util.HashMap;
import java.util.Map;

public class ForEachMap {

    public void start(){
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        System.out.println("Standard forEach...");
        items.forEach((k,v)-> System.out.println("Item: " + k + " Count: " + v));

        System.out.println("Multi-line forEach");
        items.forEach((k,v)->{
            System.out.println("Item: " + k + " Count: " + v);
            if ("E".equals(k)){
                System.out.println("Hello E");
            }
        });

    }//start

}
