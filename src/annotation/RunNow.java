package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RunNow {
    // add parameters
    // note  : parameters can't be any tyoe, it can only be primitive type, class type or an array of those
    // can add default value
    int times() default 1;
    //Cat cats(); this means that return type is Cat so instead we use the following
    Class<Cat> cats() default Cat.class;
}
