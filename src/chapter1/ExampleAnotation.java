package chapter1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME )
public @interface ExampleAnotation {
    String str() default "Hello";
    int val() default 0;

}
