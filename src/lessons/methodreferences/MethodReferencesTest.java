package lessons.methodreferences;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesTest {

    public void start(){
        List<String> names = Arrays.asList("Ryan", "Ismail", "Alvaro", "Dave", "Steve");
        //we're using a foreach to loop through the names.. and the action run at each case is System.out.println
        //where :: is used to indicate the method. Can also use this for constructors (List::new), static methods,
        //instance methods, etc. Passes the method in as a reference so forEach will use the method println as it
        //sees fit.
        names.forEach(System.out::println);
    }

}
