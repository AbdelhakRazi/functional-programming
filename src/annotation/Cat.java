package annotation;

@Important
public class Cat {
    @RunNow(times = 3)
    public void meow(){
        System.out.println("Meow");
    }
    public void eat(){
        System.out.println("eat");
    }
}
