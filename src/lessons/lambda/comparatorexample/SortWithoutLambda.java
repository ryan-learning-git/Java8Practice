package lessons.lambda.comparatorexample;

import lessons.lambda.comparatorexample.data.Developer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithoutLambda {

    //http://www.mkyong.com/java8/java-8-lambda-comparator-example/

    public void start(){

        List<Developer> listDevs = DeveloperList.getDevelopers();

        System.out.println("Before Sort:");
        for (Developer developer : listDevs){
            System.out.println(developer);
        }

        //Sort by age
        Collections.sort(listDevs, new Comparator<Developer>(){
            @Override
            public int compare(Developer o1, Developer o2){
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("After Sort:");
        for (Developer developer : listDevs){
            System.out.println(developer);
        }
        //to sort by different things just pass in different anonymous custom comparators

    }//start



}
