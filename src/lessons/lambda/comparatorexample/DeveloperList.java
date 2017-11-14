package lessons.lambda.comparatorexample;

import lessons.lambda.comparatorexample.data.Developer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DeveloperList {

    public static List<Developer> getDevelopers(){
        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));

        return result;
    }

}
