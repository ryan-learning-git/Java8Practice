package lessons.lambda;

//https://www.tutorialspoint.com/java8/java8_method_references.htm
public class LambdaTest {

    private final String HELLO_ENGLISH = "Hello";
    private final String HELLO_FRENCH = "Bonjour"; //if not final this would make the lambda crash

    public void start(){
        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //without
        MathOperation subtraction = (a, b) -> a-b;

        MathOperation multiplication = (int a, int b) -> { return a*b; };
        MathOperation division = (int a, int b) -> { return a/b; };

        System.out.println("10 + 5 = " + operate(10, 5, addition));
        System.out.println("10 - 5 = " + operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + operate(10, 5, division));

        GreetingService greetService1 = message -> System.out.println(HELLO_ENGLISH+" " + message);
        GreetingService greetService2 = (message) -> { System.out.println(HELLO_FRENCH+" " + message); };

        greetService1.sayMessage("Bob");
        greetService2.sayMessage("Francois");
    }//start

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

}
