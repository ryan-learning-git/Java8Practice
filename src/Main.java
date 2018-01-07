import lessons.datetime.LocalDateTimeTest;
import lessons.datetime.ZonedDateTimeTest;
import lessons.foreach.ForEachMap;
import lessons.lambda.LambdaTest;
import lessons.lambda.comparatorexample.SortWithLambda;
import lessons.lambda.comparatorexample.SortWithoutLambda;
import lessons.methodreferences.MethodReferencesTest;
import lessons.streams.filter.BeforeJava8;
import lessons.streams.filter.FilterNull;
import lessons.streams.filter.NowJava8;
import lessons.streams.filter.streams.StreamsExtra;
import lessons.streams.filter.streams.collectors.groupingby.GroupingByExample;
import lessons.streams.filter.streams.reuse.ReUseStream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        separateSection();
        System.out.println("Lesson 01: Lambda Comparator Example");
        underline();

        System.out.println("Lesson 01.A: Sort without Lambda");
        SortWithoutLambda sortWithoutLambda = new SortWithoutLambda();
        sortWithoutLambda.start();

        separateSubSection();
        System.out.println("Lesson 01.B: Sort with Lambda (also some forEach)");
        SortWithLambda sortWithLambda = new SortWithLambda();
        sortWithLambda.start();

        separateSection();
        System.out.println("Lesson 02: Java 8 ForEach");
        underline();
        ForEachMap forEachMap = new ForEachMap();
        forEachMap.start();

        separateSection();
        System.out.println("Lesson 03: Java 8 Streams Filter");
        underline();

        System.out.println("Lesson 03.A: Before Java 8");
        BeforeJava8 beforeJava8 = new BeforeJava8();
        beforeJava8.start();
        separateSubSection();

        System.out.println("Lesson 03.A: Before Java 8");
        NowJava8 nowJava8 = new NowJava8();
        nowJava8.start();


        separateSection();
        System.out.println("Lesson 04: Java 8 Group By, Count and Sort");
        underline();
        GroupingByExample groupingByExample = new GroupingByExample();
        groupingByExample.start();

        separateSection();
        System.out.println("Lesson 05: Stream filter out null");
        underline();
        FilterNull filterNull = new FilterNull();
        filterNull.start();

        separateSection();
        System.out.println("Lesson 06: Re-Use A Stream");
        underline();
        ReUseStream reUseStream = new ReUseStream();
        reUseStream.start();

        //lambda - http://www.dummies.com/programming/java/how-to-use-lambda-expressions-in-java-8/
            //Basically we're implementing a Functional Interface (interface with 1 abstract function and the rest implemented)
            //Lambda is a concise way to do this. Just define parameter types and method body - compiler interprets the rest
            //based on context in which the lambda is used.
            //Syntax is (parameters) -> expression OR (parameters) -> { statement; ... }

        separateSection();
        System.out.println("Lesson 07: Some Lambda tests");
        underline();
        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.start();

        separateSection();
        System.out.println("Lesson 08: Method reference tests -- need more detail on this");
        underline();
        MethodReferencesTest methodReferencesTest = new MethodReferencesTest();
        methodReferencesTest.start();

        separateSection();
        System.out.println("Lesson 09: Streams extra");
        underline();
        StreamsExtra streamsExtra = new StreamsExtra();
        streamsExtra.start();

        //it seems Optional is also a j8 thing.

        separateSection();
        System.out.println("Lesson 10: Dates");
        underline();
        separateSubSection();
        System.out.println("Lesson 10.A - Local date/time");
        LocalDateTimeTest localDateTimeTest = new LocalDateTimeTest();
        localDateTimeTest.start();
        separateSubSection();
        System.out.println("Lesson 10.B - Zoned date/time");
        ZonedDateTimeTest zonedDateTimeTest = new ZonedDateTimeTest();
        zonedDateTimeTest.start();

        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");

        System.out.println(myList.stream().filter(x -> !x.contains("c")).map(String::toUpperCase).collect(Collectors.toList()));

        List<Integer> myInts = Arrays.asList(50, 100, 283, 938, 33, 1);
        myInts.stream().mapToInt(x -> x).summaryStatistics().getMax();

    }//main

    private static void underline(){
        System.out.println("************************");
    }

    private static void separateSection(){
        System.out.println("************************************************\n\n");
    }
    private static void separateSubSection(){
        System.out.println("\n");
    }

}
