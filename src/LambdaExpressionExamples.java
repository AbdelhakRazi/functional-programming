import java.util.function.Consumer;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntUnaryOperator;

public class LambdaExpressionExamples {
    public void lambdaExamples(){
        Runnable helloWorldTask = () -> {
            System.out.println("Hello World");
        };
        Runnable helloWorldTask1 = () -> System.out.println("Hello World");
        Printer printName = (String name) -> {
            System.out.println("Print name");
        };
        Printer printName1 = (name) -> {
            System.out.println("Print name");
        };
        Printer printNameOptimal = name -> System.out.println("Print name");
        MathOperation returnX1 = x -> {
            return x + 1;
        };
        MathOperation returnX1Optimal = x -> x+1;
        MathOperation returnX2Optimal = x -> x*5;
        int result = returnX1Optimal.operation(5);
        int result1 = returnX2Optimal.operation(5);
        System.out.println(result);
        System.out.println(result1);
        // using JDK built in functional interfaces
        IntUnaryOperator addOperation = x -> x + 1;
        int jdkResult = addOperation.applyAsInt(5);
        System.out.println(jdkResult);


    }

    public static void main(String[] args) {
        LambdaExpressionExamples lambdaExpressionExamples = new LambdaExpressionExamples();
        lambdaExpressionExamples.lambdaExamples();
    }
}
@FunctionalInterface
interface Printer{
    void print(String name);
}
@FunctionalInterface
interface MathOperation{
    int operation(int x);
}
