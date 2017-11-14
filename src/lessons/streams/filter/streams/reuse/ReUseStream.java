package lessons.streams.filter.streams.reuse;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReUseStream {

    public void start(){
        String[] array = {"a", "b", "c", "d", "e"};

        Supplier<Stream<String>> streamSupplier = () -> Stream.of(array); //Suspect that Supplier is a functional interface and it infers to use that.

        streamSupplier.get().forEach(x -> System.out.println(x));

        //get another stream
        long count = streamSupplier.get().filter(x -> "b".equals(x)).count();
        System.out.println(count);
    }

}
