import lessons.foreach.ForEachMap;
import lessons.lambda.comparatorexample.SortWithLambda;
import lessons.lambda.comparatorexample.SortWithoutLambda;
import lessons.streams.filter.BeforeJava8;
import lessons.streams.filter.NowJava8;
import lessons.streams.filter.streams.collectors.groupingby.GroupingByExample;

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
