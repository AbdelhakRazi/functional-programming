package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat();
        if(cat.getClass().isAnnotationPresent(Important.class)){
            System.out.println("This is Important");
        }// check if class is annotated
        for(Method method: cat.getClass().getDeclaredMethods()){// loop through methods and call annotated method
            if(method.isAnnotationPresent(RunNow.class)){
                RunNow annotation = method.getAnnotation(RunNow.class);
                for(int i = 0; i < annotation.times();i++){
                    method.invoke(cat);
                }
            }
        }
        // we can do the same for fields as well
    }
}
