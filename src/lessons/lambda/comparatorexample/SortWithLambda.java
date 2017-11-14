package lessons.lambda.comparatorexample;


import lessons.lambda.comparatorexample.data.Developer;

import java.util.Comparator;
import java.util.List;

//http://www.mkyong.com/java8/java-8-lambda-comparator-example/
public class SortWithLambda {

    public void start(){
        List<Developer> listDevs = DeveloperList.getDevelopers();

        System.out.println("Before Sort:");
        for (Developer developer : listDevs){
            System.out.println(developer);
        }

        System.out.println("After Sort (age):");

        //lambda here
        listDevs.sort((Developer o1, Developer o2) -> o1.getAge()-o2.getAge());

        //lambda to print the list
        listDevs.forEach((developer) -> System.out.println(developer));

        System.out.println("After Sort (salary):");
        listDevs.sort((Developer o1, Developer o2) -> o1.getSalary().compareTo(o2.getSalary()));
        listDevs.forEach((developer) -> System.out.println(developer));

        System.out.println("Alternative way of doing a sort:");
        Comparator<Developer> salaryComparator = ((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));
        listDevs.sort(salaryComparator);
        listDevs.forEach((developer) -> System.out.println(developer));

        System.out.println("Flip it and reverse it:");
        listDevs.sort(salaryComparator.reversed());
        listDevs.forEach((developer) -> System.out.println(developer));



    }//start

}
