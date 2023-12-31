package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // to say in which level this annotation is used, if it is method or class or type or constructor..
// we can specify multiple elements, TYPE stands for class, so we can add comma and ElementType.METHOD
@Retention(RetentionPolicy.RUNTIME) // keeps this annotation for running time,
// we have SOURCE, means java gets rid of annotation before compilation
// CLASS
public @interface Important {
}
