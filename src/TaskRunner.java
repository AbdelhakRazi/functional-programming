import java.time.LocalDate;
import java.util.function.Consumer;

public class TaskRunner {
    // what if you want to pass the task that you'll run as an argument?
    // object-oriented way is to create an interface
    // First class functions which can be achieved using Lambda expressions
    // can use anynmous clas as well
    public void runner(Task task){
        System.out.println("Start time: " + LocalDate.now());
        task.run();
        System.out.println("End time: " + LocalDate.now());
    }

    public static void main(String[] args) {

        // for single argument
        TaskRunner taskRunner = new TaskRunner();
        taskRunner.runner(new HelloWorldTask());
        Task helloWorldTask = () -> System.out.println("Hello world");
        Task byeWorldTask = () -> System.out.print("Bye world task");
        taskRunner.runner(helloWorldTask);
        taskRunner.runner(byeWorldTask);
        taskRunner.runner(() -> System.out.println("OKAAY"));
        taskRunner.runner(new Task() {
            @Override
            public void run() {
                System.out.println("Using anonynmous");
            }
        });
    }
}
@FunctionalInterface
interface Task{
    void run();
}
class HelloWorldTask implements Task{

    @Override
    public void run() {
        System.out.println("Hello World");
    }
}
